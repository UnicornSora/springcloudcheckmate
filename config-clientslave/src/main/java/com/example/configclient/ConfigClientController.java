package com.example.configclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@EnableEurekaClient
public class ConfigClientController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConfigClientApplication.class);

    @Value("${foo}")
    String foo;

    @RequestMapping(value = "/hi")
    public String hi() {
        LOGGER.info("3" + foo);
        return foo;
    }
}
