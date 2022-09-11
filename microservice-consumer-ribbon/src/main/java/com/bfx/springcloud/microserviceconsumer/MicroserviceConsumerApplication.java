package com.bfx.springcloud.microserviceconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
// 注册为Eureka客户端应用，以获得服务发现的能力
@EnableDiscoveryClient
public class MicroserviceConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceConsumerApplication.class, args);
    }

    @Bean
    // 通过@LoadBalanced注解开启客户端负载均衡
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
