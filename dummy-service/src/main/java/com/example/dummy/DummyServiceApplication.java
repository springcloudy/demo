package com.example.dummy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class DummyServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(DummyServiceApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
