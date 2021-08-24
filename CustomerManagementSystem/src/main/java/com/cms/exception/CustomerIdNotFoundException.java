package com.cms.exception;

public class CustomerIdNotFoundException extends RuntimeException{
private String message;
public CustomerIdNotFoundException(String message) {
	super(message);
	this.message = message;
}
}
