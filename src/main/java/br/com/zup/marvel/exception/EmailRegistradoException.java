package br.com.zup.marvel.exception;

public class EmailRegistradoException extends Exception {

	private static final long serialVersionUID = 369338300017566439L;
	
	public EmailRegistradoException (String email) {
		
        super(String.format("E-mail %s já está cadastrado no sistema.", email));

	}
	

}
