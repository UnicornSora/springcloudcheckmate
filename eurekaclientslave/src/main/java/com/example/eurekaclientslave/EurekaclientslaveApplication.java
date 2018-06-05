package com.example.eurekaclientslave;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaclientslaveApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaclientslaveApplication.class, args);
    }
}
