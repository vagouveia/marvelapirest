package br.com.zup.marvel.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.zup.marvel.dto.LivroDTO;
import br.com.zup.marvel.dto.UsuarioDTO;
import br.com.zup.marvel.entity.Usuario;
import br.com.zup.marvel.exception.CpfRegistradoException;
import br.com.zup.marvel.exception.EmailRegistradoException;
import br.com.zup.marvel.exception.LivroNaoCadastradoException;
import br.com.zup.marvel.exception.LivroRegistradoException;
import br.com.zup.marvel.exception.UsuarioNaoEncontradoException;
import br.com.zup.marvel.service.LivroService;
import br.com.zup.marvel.service.UsuarioService;

@RestController
@RequestMapping("api")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private LivroService livroService;
	
	@PostMapping("/cadastro/usuario")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<UsuarioDTO> salvarUsuario(@RequestBody @Valid UsuarioDTO usuarioDTO) throws CpfRegistradoException, EmailRegistradoException, LivroRegistradoException, LivroNaoCadastradoException {
					
		LivroDTO livroDTO = livroService.retornaLivroDTO(usuarioDTO.getLivro().getComicId());
		
		usuarioDTO.setLivro(livroDTO);
		
		usuarioService.salvarUsuario(usuarioDTO);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioDTO);
		
	}
	
	@GetMapping("/buscar/{codigo}")
	public Usuario listaUsuario(@PathVariable Long codigo) throws UsuarioNaoEncontradoException{
		
		return usuarioService.listaUsuario(codigo);
		
	}
	
}
