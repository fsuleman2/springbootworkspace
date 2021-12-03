package com.junitdemo.service.impl;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.junitdemo.repository.PersonRepository;
//@ExtendWith(MockitoExtension.class)
class PersonServiceImplTest {
	@Mock
	private PersonRepository personRepository;

	
	private PersonServiceImpl personServiceImpl;
	
	AutoCloseable autoCloseable;
	
	@BeforeEach
	void setUp() {
		autoCloseable = MockitoAnnotations.openMocks(this);
		this.personServiceImpl = new PersonServiceImpl(this.personRepository);
	}

	@Test
	void getAllPersons() {
		personServiceImpl.getAllPersons();
		verify(this.personRepository).findAll();
	}
	
	@AfterEach
	void tearDown() {
		try {
			autoCloseable.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
