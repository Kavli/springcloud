package com.maxfun.service;

import com.maxfun.service.impl.FeignServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2017/11/27.
 */
@FeignClient(value = "service-hi", fallback = FeignServiceImpl.class)
public interface IFeignService {
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String hi(@RequestParam(value = "name") String name);
}