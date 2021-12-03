package com.pms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentService2Application {

	public static void main(String[] args) {
		SpringApplication.run(PaymentService2Application.class, args);
	}

}
