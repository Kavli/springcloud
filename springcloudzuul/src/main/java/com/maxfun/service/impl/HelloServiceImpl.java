package com.maxfun.service.impl;

import com.maxfun.service.IHelloService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2017/11/27.
 */
@Service
public class HelloServiceImpl implements IHelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    @Override
    public String hi(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name, String.class);
    }

    public String hiError(String name){
        return "hi,"+name+",get error";
    }
}
