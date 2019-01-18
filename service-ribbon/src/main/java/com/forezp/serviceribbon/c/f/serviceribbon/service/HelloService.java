package com.forezp.serviceribbon.c.f.serviceribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

//    restTemplate.getForObject(“http://SERVICE-HI/hi?name=”+name,String.class)方法时，已经做了负载均衡，访问了不同的端口的服务实例。
    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }
}
