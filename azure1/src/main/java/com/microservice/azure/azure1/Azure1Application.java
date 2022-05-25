package com.microservice.azure.azure1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication

public class Azure1Application {

	public static void main(String[] args) {
		SpringApplication.run(Azure1Application.class, args);
		System.out.println("Hello Spring boot");
	}
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello Azure from spring boot";
	}
	

}
