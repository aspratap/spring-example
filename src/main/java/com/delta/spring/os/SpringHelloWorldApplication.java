package com.delta.spring.os;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringHelloWorldApplication {

	@GetMapping("/")
	public String welcome() {
		return "Welcome to java techie";
	}
	
	@GetMapping("/{input}")
	public String deployed(@PathVariable String input) {
		return "Hello " + input + ", Your application is deployed successfully";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringHelloWorldApplication.class, args);
	}

}
