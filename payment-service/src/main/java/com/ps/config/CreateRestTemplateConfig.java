package com.ps.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CreateRestTemplateConfig {
	@Bean("restTemplate")
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
