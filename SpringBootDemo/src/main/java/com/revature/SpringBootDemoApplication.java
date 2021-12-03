package com.revature;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.revature.model.User;

@SpringBootApplication
public class SpringBootDemoApplication implements CommandLineRunner{
	
	private UserRepository userRepository;
	
	@Autowired
	public SpringBootDemoApplication(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User u=new User(23,"product1");
		userRepository.save(u);
		
	}

}
