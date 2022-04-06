package com.example.restdojo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class JokeController {

    @GetMapping(value = "/joke")
    private String getBook() {
        RestTemplate restTemplate = new RestTemplate();

        String uri ="https://api.chucknorris.io/jokes/random";
        return restTemplate.getForObject(uri, String.class);
    }

}
