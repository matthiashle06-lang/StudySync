package com.studysync.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication {

    public static void main(String[] args) {
        // HARDCODED TEST: Bypassing everything.
        String hardcodedUri = "mongodb+srv://matthiasbatumalai_db_user:92qeI08S5gfJho1e@studysync.bp32bfd.mongodb.net/studysync?appName=StudySync";
        System.setProperty("spring.data.mongodb.uri", hardcodedUri);

        SpringApplication.run(BackendApplication.class, args);
    }
}