package br.com.zup.marvel.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UsuarioNaoEncontradoException extends Exception{

	private static final long serialVersionUID = 2767974365109432173L;
	
	public UsuarioNaoEncontradoException(Long codigo) {

		super(String.format("Usuário %s não está cadastrado no sistema.", codigo));

	}

}
