package com.example.configclient;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@EnableEurekaClient
public class TestController extends ConfigClientController {

    @Override
    @RequestMapping(value = "/hiTest")
    public String hi() {
        LOGGER.info("4" + foo);
        return super.hi();
    }
}
