package com.springboot.workshopmongo.services.exception;

// COMPILADOR NAO EXIGE QUE TRATE A EXCESSAO
public class ObjectNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException(String msg) {
		super(msg);
	}

}
