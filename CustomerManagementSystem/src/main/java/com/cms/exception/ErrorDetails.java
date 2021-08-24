package com.cms.exception;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Data;
//@Data alone is equal to below all
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
@Data

public class ErrorDetails {
public ErrorDetails(LocalDateTime now, String description, String localizedMessage) {
	super();
	this.timestamp = now;
	this.request = description;
	this.message1 =  localizedMessage;
}
public ErrorDetails(LocalDateTime now, String description, List<String> errors) {
	super();
	this.timestamp = now;
	this.request = description;
	this.message =  errors;
}
private LocalDateTime timestamp;
private String request;
private String message1;
private List<String> message;
}
