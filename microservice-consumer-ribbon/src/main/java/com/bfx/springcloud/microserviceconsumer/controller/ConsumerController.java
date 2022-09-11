package com.bfx.springcloud.microserviceconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/ribbon-consumer", method = RequestMethod.GET)
    public String helloConsumer() {
        // 通过RestTemplate来实现对HELLO-SERVICE服务提供的/hello接口进行调用。可以看到这里访问的地址是服务名HELLO-SERVICE，而不是一个具体的地址，在服务治理框架中，这是一个非常重要的特性
        return restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody();
    }
}
