package com.loggerdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class LoggerDemoApplication implements CommandLineRunner{
	Logger log = LoggerFactory.getLogger(LoggerDemoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(LoggerDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("*****************************Hello*****************");
		Hello h= new Hello();
		h.hello();
	}

}
