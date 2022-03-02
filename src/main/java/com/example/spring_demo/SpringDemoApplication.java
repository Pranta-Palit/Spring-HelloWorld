package com.example.spring_demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}

	// RestController annotation allows this class to serve REST endpoint
	@GetMapping
	public List<String> hello()
	{
		// following code will show the string hello world
		// return "Hello World";

		// following code will return json array
		return List.of("Hello", "World");
	}
}
