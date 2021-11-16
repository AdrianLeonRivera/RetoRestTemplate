package com.bootcamp.circuitbreakerserver.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CocheController {

	Logger logger=LoggerFactory.getLogger(CocheController.class);
	private String status;
	
	@GetMapping("/open")
	public ResponseEntity<String> getStatusOpen()
	{
		this.status="open";
		logger.info("Circuito abierto");
		return new ResponseEntity<String>(HttpStatus.OK).ok("Open");
	}
	
	@GetMapping("/half-open")
	public ResponseEntity<String> getStatusHalfOpen()
	{
		this.status="half-open";
		logger.info("Circuito con error");
		return new ResponseEntity<String>(HttpStatus.OK).ok("Half-Open");
	}
	
	@GetMapping("/close")
	public ResponseEntity<String> getStatusClose()
	{
		this.status="close";
		logger.info("Circuito cerrado");
		return new ResponseEntity<String>(HttpStatus.OK).ok("Close");
	}
	
	public String getStatus()
	{
		return status;
	}
}
