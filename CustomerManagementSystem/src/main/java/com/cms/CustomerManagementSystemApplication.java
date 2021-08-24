package com.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
public class CustomerManagementSystemApplication {
	public static void main(String[] args) {
		SpringApplication.run(CustomerManagementSystemApplication.class, args);
	}

}
