package br.com.zup.marvel.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class LivroNaoCadastradoException extends Exception {
	
	private static final long serialVersionUID = 7322927827350614014L;

	public LivroNaoCadastradoException(Long comicId) {

		super(String.format("Livro %s não está cadastrado no sistema.", comicId));

	}

}
