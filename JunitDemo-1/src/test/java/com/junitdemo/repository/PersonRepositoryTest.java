package com.junitdemo.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.junitdemo.model.Person;
@SpringBootTest
class PersonRepositoryTest {

	@Autowired
	private PersonRepository personRepository; 
	@Test
	void isPersonExistById() {
		Person person = new Person(123,"Suleman","Hyderabad");
		personRepository.save(person);
		
		Boolean actualResult = personRepository.existsById(123);
		assertThat(actualResult).isTrue();
	}
	@BeforeEach
	void setup() {
		System.out.println("Setting up");
	}
	@AfterEach
	void tearDown() {
		System.out.println("Tearing Down");
		personRepository.deleteAll();
	}
}