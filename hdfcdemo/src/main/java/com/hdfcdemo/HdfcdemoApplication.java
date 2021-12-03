package com.hdfcdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HdfcdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HdfcdemoApplication.class, args);
	}
	
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome to hdfc app";
	}
	
	@GetMapping("/")
	public String bye() {
		return "Logging out from hdfc app";
	}
}
