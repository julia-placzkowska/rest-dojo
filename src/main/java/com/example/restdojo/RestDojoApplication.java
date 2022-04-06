package com.example.restdojo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestDojoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestDojoApplication.class, args);


	}

	public void getFromApi(){
//		ResponseEntity<String> response =
//				RestTemplate.getForObject(
//						"http://localhost:8080/employees/",
//						String.class);
//		String result = response.getBody();
	}

}
