package com.studysync.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication {

    public static void main(String[] args) {
        // Print the environment variables directly to Render logs before Spring boots
        System.out.println("\n\n====== PRE-STARTUP DIAGNOSTICS ======");
        System.out.println("ENV MONGODB_URI: " + System.getenv("MONGODB_URI"));
        System.out.println("ENV SPRING_DATA_MONGODB_URI: " + System.getenv("SPRING_DATA_MONGODB_URI"));
        System.out.println("=====================================\n\n");

        SpringApplication.run(BackendApplication.class, args);
    }
}