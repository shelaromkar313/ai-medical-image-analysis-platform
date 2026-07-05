package com.medical.ai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * Main application class for Medical Image Analysis Platform
 * 
 * This is the entry point for the Spring Boot application.
 * It enables JPA auditing for automatic timestamp management
 * and caching for performance optimization.
 */
@SpringBootApplication
@EnableJpaAuditing
@EnableCaching
public class MedicalImageAnalysisApplication {

    public static void main(String[] args) {
        SpringApplication.run(MedicalImageAnalysisApplication.class, args);
        System.out.println("Medical Image Analysis Platform Backend Started Successfully!");
    }
}
