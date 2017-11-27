package com.maxfun.ws.contractor;

import com.maxfun.service.IFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/11/27.
 */
@RestController
public class FeignContractor {
    @Autowired
    private IFeignService feignService;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String hi(@RequestParam(value = "name") String name) {
        return feignService.hi(name);
    }
}
