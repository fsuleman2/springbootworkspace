package com.junitdemo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;


class JunitDemo1ApplicationTests {
	private Calculator c = new Calculator();

//	@Test
//	void contextLoads() {
//	}

	//use @Disabled to ignore test cases
	@Test
	void testSum() {
		int expectedResult = 18;
		int actualResult = c.doSum(12, 3, 3); //17
		assertThat(actualResult).isEqualTo(expectedResult);
	}

	@Test
	void testProduct() {
		//expected
		int expectedResult = 6;
		
		//actual result
		int actualResult = c.doProduct(3, 2);
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	//comparing two numbers
	@Test
	void testTwoNums() {
		Boolean actualResult = c.compareTwoNums(3,3);
		assertThat(actualResult).isTrue();
	}
	
}
