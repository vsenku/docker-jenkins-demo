package com.example.docker.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerJenkinsDemoApplication {
	
	@GetMapping("/message")
	public String getMessage(){
		
		return "Hello from Spring webapp";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerJenkinsDemoApplication.class, args);
	}

}
