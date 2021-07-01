package br.com.zup.marvel.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.zup.marvel.dto.UsuarioDTO;
import br.com.zup.marvel.entity.Usuario;
import br.com.zup.marvel.exception.CpfRegistradoException;
import br.com.zup.marvel.exception.EmailRegistradoException;
import br.com.zup.marvel.exception.UsuarioNaoEncontradoException;
import br.com.zup.marvel.mapper.UsuarioMapper;
import br.com.zup.marvel.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	
	private UsuarioRepository usuarioRepository;
	
	private final UsuarioMapper usuarioMapper = UsuarioMapper.INSTANCE;
	
	@Autowired
	private UsuarioService (UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	
	public UsuarioService() {
	}

	public UsuarioDTO salvarUsuario(UsuarioDTO usuarioDTO) throws CpfRegistradoException, EmailRegistradoException {
		
		verificaCpfCadastrado(usuarioDTO.getCpf());
		VerificaEmailCadastrado(usuarioDTO.getEmail());		
		
		Usuario usuario = usuarioMapper.toEntity(usuarioDTO);
		Usuario usuarioCriado = usuarioRepository.save(usuario);
		
		return usuarioMapper.toDTO(usuarioCriado);	
		
	}
	
	public List<UsuarioDTO> listarTodos(){
		
		return usuarioRepository.findAll().stream().map(usuario -> usuarioMapper.toDTO(usuario)).collect(Collectors.toList());
		
	}
	
	public void verificaCpfCadastrado(String cpf) throws CpfRegistradoException {
		
		Optional<Usuario> usuarioCpf = usuarioRepository.findByCpf(cpf);
		
		if(usuarioCpf.isPresent()) {
			
			throw new CpfRegistradoException(cpf);
			
		}
	}
	
	public void VerificaEmailCadastrado(String email) throws EmailRegistradoException {
		
		Optional<Usuario> usuarioEmail = usuarioRepository.findByEmail(email);
		
		if(usuarioEmail.isPresent()) {
			
			throw new EmailRegistradoException(email);
			
		}
	}

	public Usuario listarUsuario(Long codigo) throws UsuarioNaoEncontradoException{
		
		VerificaUsuarioCadastrado(codigo);
		
		return usuarioRepository.findByCodigo(codigo);
	}
	
	public void VerificaUsuarioCadastrado(Long codigo) throws UsuarioNaoEncontradoException {
		
		Usuario usuario = usuarioRepository.findByCodigo(codigo);
		
		if(usuario == null) {
			
			throw new UsuarioNaoEncontradoException(codigo);
			
		}
	}

}
