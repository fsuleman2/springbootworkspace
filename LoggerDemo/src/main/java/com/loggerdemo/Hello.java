package com.loggerdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/hello")
public class Hello {
static Logger logger = LoggerFactory.getLogger(Hello.class);

public static void hello() {
	logger.info("*****************************Hello*****************");
	logger.info("*****************************bye*****************");
}
@GetMapping("/")
public  String hello1() {
	return "Hello Swagger";
}

}
