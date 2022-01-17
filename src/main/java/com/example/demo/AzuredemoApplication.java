package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController("/api")
public class AzuredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzuredemoApplication.class, args);
	}
	
	
	@RequestMapping(value = "/hello")
	public String getMessage() {
		return "hello";
	}

	
}
