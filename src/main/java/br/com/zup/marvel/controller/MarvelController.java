package br.com.zup.marvel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.zup.marvel.dto.ComicDTO;
import br.com.zup.marvel.dto.LivroDTO;
import br.com.zup.marvel.dto.wrapper.DataWrapperDTO;
import br.com.zup.marvel.exception.LivroRegistradoException;
import br.com.zup.marvel.service.LivroService;
import br.com.zup.marvel.service.MarvelService;
import br.com.zup.marvel.util.DataUtils;
import br.com.zup.marvel.util.IbsnUtils;
import br.com.zup.marvel.util.LivroUtils;
import br.com.zup.marvel.util.UrlUtils;

@RestController
public class MarvelController {
	
	@Autowired
	private MarvelService marvelService;
	
	@Autowired
	private LivroService livroService;

	
	@GetMapping(value = "/v1/public/comics/{comicId}")
	public ResponseEntity<LivroDTO> getById(@PathVariable String comicId) throws LivroRegistradoException{
		
		String hash = UrlUtils.criarHash();
		String publicKey = UrlUtils.getPublicKey();
		Integer diaSemana = DataUtils.getDiaSemana();
		String nomeSemana = DataUtils.getNomeSemana(diaSemana);
			
		DataWrapperDTO<ComicDTO> comicDTO = marvelService.getById(comicId, publicKey, hash);
		LivroDTO livroDTO = new LivroDTO();

		for (ComicDTO objComicDTO : comicDTO.getData().getResults()) {
			
			Integer diaSemanaIbsn = IbsnUtils.retornaDiaSeanaIbsn(objComicDTO);
			String autorLista = LivroUtils.converterListaAutoresParaString(objComicDTO);
			Double preco = LivroUtils.converterListaPrecoParaDouble(objComicDTO);
			String autor = LivroUtils.limitarQuantidadeString(autorLista);
			
			if(objComicDTO.getTitle() != null) {
				
				String titulo = LivroUtils.limitarQuantidadeString(objComicDTO.getTitle());
				livroDTO.setTitulo(titulo);	

			} else {
				
				livroDTO.setTitulo(null);	
				
			}
			
			if(objComicDTO.getDescription() != null) {
				
				String descricao = LivroUtils.limitarQuantidadeString(objComicDTO.getDescription());
				livroDTO.setDescricao(descricao);

			} else {
				
				livroDTO.setDescricao(null);

			}
						
			if(diaSemanaIbsn == diaSemana) {
				
				preco -= preco*0.1;
				livroDTO.setDescontoAtivo(Boolean.TRUE);
				
			} else {
				
				livroDTO.setDescontoAtivo(Boolean.FALSE);
			}
			
			livroDTO.setComicId(objComicDTO.getId());
			livroDTO.setDiaDesconto(nomeSemana);
			livroDTO.setAutor(autor);
			livroDTO.setPreco(preco);
			livroDTO.setIbsn(objComicDTO.getIsbn());
			
			livroService.salvarLivro(livroDTO);		
			
		}
		
		return ResponseEntity.status(HttpStatus.CREATED).body(livroDTO);
		
	}


}
