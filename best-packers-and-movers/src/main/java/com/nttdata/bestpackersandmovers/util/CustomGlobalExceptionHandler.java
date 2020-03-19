package com.nttdata.bestpackersandmovers.util;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.nttdata.bestpackersandmovers.exception.CustomerNotFoundException;
import com.nttdata.bestpackersandmovers.exception.LanguageNotSupportedException;
import com.nttdata.bestpackersandmovers.model.CustomErrorResponse;

@ControllerAdvice
public class CustomGlobalExceptionHandler extends ResponseEntityExceptionHandler {

	// Let Spring BasicErrorController handle the exception, we just override the
	// status code

	@ExceptionHandler(CustomerNotFoundException.class)
	public ResponseEntity<CustomErrorResponse> bookNotFoundExceptionCalled(CustomerNotFoundException ex,
			WebRequest request) {

		CustomErrorResponse errors = new CustomErrorResponse();
		errors.setTimestamp(LocalDateTime.now());
		errors.setStatus(HttpStatus.NOT_FOUND.value());
		errors.setError(ex.getMessage());

		return new ResponseEntity<CustomErrorResponse>(errors, new HttpHeaders(), HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(LanguageNotSupportedException.class)
	public ResponseEntity<CustomErrorResponse> languageNotSupportedException(LanguageNotSupportedException ex,
			WebRequest request) {

		CustomErrorResponse errors = new CustomErrorResponse();
		errors.setTimestamp(LocalDateTime.now());
		errors.setError(ex.getMessage());

		return new ResponseEntity<CustomErrorResponse>(errors, new HttpHeaders(), HttpStatus.NOT_FOUND);
	}

	// In this method we are just changing the response code
	@ExceptionHandler(Exception.class)
	public void springHandleNotFound(HttpServletResponse response) throws IOException {
		response.sendError(HttpStatus.NOT_FOUND.value());
		// response.sendError(HttpStatus.INTERNAL_SERVER_ERROR.value());
	}

}
