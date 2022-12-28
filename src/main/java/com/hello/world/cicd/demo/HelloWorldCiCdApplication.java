package com.hello.world.cicd.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController("/api")
public class HelloWorldCiCdApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldCiCdApplication.class, args);
	}

	@GetMapping("/saludos/{name}")
	public String saludar(@PathVariable String name) {
		return "Hello, " + name;
	}
}
