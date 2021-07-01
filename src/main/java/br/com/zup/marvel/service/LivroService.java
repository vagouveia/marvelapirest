package br.com.zup.marvel.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.zup.marvel.dto.LivroDTO;
import br.com.zup.marvel.entity.Livro;
import br.com.zup.marvel.exception.LivroNaoCadastradoException;
import br.com.zup.marvel.exception.LivroRegistradoException;
import br.com.zup.marvel.mapper.LivroMapper;
import br.com.zup.marvel.repository.LivroRepository;

@Service
public class LivroService {
	
	private LivroRepository livroRepository;
	
	private final LivroMapper livroMapper = LivroMapper.INSTANCE;
	
	@Autowired
	public LivroService(LivroRepository livroRepository) {
		this.livroRepository = livroRepository;
	}

	public LivroService() {
	}
	
	public LivroDTO salvarLivro(LivroDTO livroDTO) throws LivroRegistradoException {
		
		verificaLivroCadastrado(livroDTO.getComicId());
		
		Livro livro = livroMapper.toEntity(livroDTO);
		Livro livroCriado = livroRepository.save(livro);
		
		return livroMapper.toDTO(livroCriado);		
		
	}

	public void verificaLivroCadastrado(Long comicId) throws LivroRegistradoException {

		Optional<Livro> livroCadastrado = livroRepository.findByComicId(comicId);	
				
		if(livroCadastrado.isPresent()) {
			
			throw new LivroRegistradoException(comicId);
		}
	}
	
	public LivroDTO retornaLivroDTO(Long comicId) throws LivroNaoCadastradoException {

		Optional<Livro> livroCadastrado = livroRepository.findByComicId(comicId);	
		
		if(livroCadastrado.isPresent()) {
			
			Livro livro = new Livro();
			
			livro = livroRepository.getById(livroCadastrado.get().getCodigo());
			
			return livroMapper.toDTO(livro);
					
		}
		
		if(!livroCadastrado.isPresent()) {
			
			throw new LivroNaoCadastradoException(comicId);
		}
				
		return null;
	}
	
}
