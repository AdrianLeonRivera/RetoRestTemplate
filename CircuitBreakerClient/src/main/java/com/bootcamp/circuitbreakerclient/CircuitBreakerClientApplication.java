package com.bootcamp.circuitbreakerclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CircuitBreakerClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CircuitBreakerClientApplication.class, args);
		
		
	}

}
