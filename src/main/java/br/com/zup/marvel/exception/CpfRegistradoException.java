package br.com.zup.marvel.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CpfRegistradoException extends Exception {

	private static final long serialVersionUID = -378011403224956586L;
	
	public CpfRegistradoException (String cpf) {
		
        super(String.format("CPF %s já está cadastrado no sistema.", cpf));

	}

}
