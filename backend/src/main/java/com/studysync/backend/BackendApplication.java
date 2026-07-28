package com.studysync.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication {

    public static void main(String[] args) {
        // Intercept the environment variable and force it into Spring's system properties
        String mongoUri = System.getenv("MONGODB_URI");
        if (mongoUri != null && !mongoUri.isBlank()) {
            System.setProperty("spring.data.mongodb.uri", mongoUri);
        }

        SpringApplication.run(BackendApplication.class, args);
    }
}