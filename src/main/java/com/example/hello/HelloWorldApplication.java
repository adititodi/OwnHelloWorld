package com.example.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {
    public static void main(String[] args) {
        String port = System.getenv("PORT");
        System.out.println("Starting app on port: " + (port != null ? port : "8080"));
        SpringApplication.run(HelloWorldApplication.class, args);
    }
}
