package com.junitdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junitdemo.model.Person;
import com.junitdemo.repository.PersonRepository;
import com.junitdemo.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;

	@Override
	public List<Person> getAllPersons() {
		return this.personRepository.findAll();
	}

	public PersonServiceImpl(PersonRepository personRepository) {

		this.personRepository = personRepository;
	}

}
