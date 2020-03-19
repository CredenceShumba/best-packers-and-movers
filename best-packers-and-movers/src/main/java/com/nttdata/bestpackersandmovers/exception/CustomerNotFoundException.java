package com.nttdata.bestpackersandmovers.exception;

public class CustomerNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CustomerNotFoundException(Integer id) {
		super("ERROR MESSAGE: Customer @id " + id + " Not Found");
	}
	

}
