package com.example.configclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConfigClientSlaveApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientSlaveApplication.class, args);
    }

}
