package com.bfx.springcloud.microserviceprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient //服务发现
public class MicroserviceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceProviderApplication.class, args);
    }

}
