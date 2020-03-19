package com.nttdata.bestpackersandmovers.exception;

public class LanguageNotSupportedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LanguageNotSupportedException(String language) {
		super("This language is not supported " + language);

	}

}
