package com.dockerdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("welcome")
public class DockerDemo1Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DockerDemo1Application.class, args);
	}

	@GetMapping("/")
	public String welcome() {
		return "Hello welcome to docker demo";
	}
	
	@GetMapping("/bye")
	public String bye() {
		return "Hello Bye,Good to see you";
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
