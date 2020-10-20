package com.integration.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.config.EnableIntegration;

@EnableIntegration
@IntegrationComponentScan
@SpringBootApplication
public class SpringIntegrationFtpApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringIntegrationFtpApplication.class, args);
    }

}
