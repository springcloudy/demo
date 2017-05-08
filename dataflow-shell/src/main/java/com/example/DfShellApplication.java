package com.example;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.dataflow.shell.EnableDataFlowShell;

@SpringBootApplication
@EnableDataFlowShell
@EnableDiscoveryClient
public class DfShellApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(DfShellApplication.class)
                .bannerMode(Banner.Mode.OFF)
                .run(args);
    }
}
