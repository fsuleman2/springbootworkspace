package com.junitdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junitdemo.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
	@Autowired
	private PersonService personService;
	
	
	@GetMapping("/")
	public ResponseEntity<?> getAllPersons(){
		return ResponseEntity.ok(this.personService.getAllPersons());
	}
}
