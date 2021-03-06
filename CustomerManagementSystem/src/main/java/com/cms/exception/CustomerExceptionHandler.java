package com.cms.exception;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class CustomerExceptionHandler {
@ExceptionHandler(CustomerIdNotFoundException.class)
public ResponseEntity<Object> handlerCustomerIdNotFound(CustomerIdNotFoundException ex, WebRequest request) {
		ErrorDetails error = new ErrorDetails(LocalDateTime.now(),request.getDescription(false), ex.getLocalizedMessage());
		ResponseEntity<Object> re = new ResponseEntity<Object>(error,HttpStatus.NOT_FOUND);
		return re;
}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Object> handlerCustomerAllException(MethodArgumentNotValidException ex, WebRequest request) {
		List<String> errors = ex.getAllErrors().stream().map(e->e.getDefaultMessage()).collect(Collectors.toList());
		
		ErrorDetails error = new ErrorDetails(LocalDateTime.now(),request.getDescription(false),errors);
		ResponseEntity<Object> re = new ResponseEntity<Object>(error,HttpStatus.NOT_FOUND);
		return re;
	}
}
