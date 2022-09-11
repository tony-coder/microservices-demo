package com.bfx.springcloud.microserviceconsumerhystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/*开启断路器功能*/
@EnableCircuitBreaker
@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceConsumerHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceConsumerHystrixApplication.class, args);
    }

    @Bean
    // 通过@LoadBalanced注解开启客户端负载均衡
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
