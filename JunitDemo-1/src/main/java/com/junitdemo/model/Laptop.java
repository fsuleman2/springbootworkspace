package com.junitdemo.model;

import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Laptop {
	
	@Id
	private int lid;
	private String name;
	@ManyToOne
	private Student student;
}
