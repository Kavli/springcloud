package com.maxfun.ws.contractor;

import com.maxfun.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/11/27.
 */
@RestController
public class HelloContractor {

    @Autowired
    private IHelloService helloService;

    static {
        System.out.println("enable ribbon");
    }
    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        //return "test";
        return helloService.hi(name);
    }
}
