package com.maxfun.service.impl;

import com.maxfun.service.IFeignService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2017/11/27.
 */
@Component
public class FeignServiceImpl implements IFeignService {

    @Override
    public String hi(@RequestParam(value = "name") String name) {
        return "hi," + name + ",error";
    }
}
