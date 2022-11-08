package com.pzhu.spring.cloud.alibaba.nacos.config.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author PoorRichard
 * @Date  23:54
 */
@RestController
public class ConfigController {


    @Autowired
    private ConfigurableApplicationContext applicationContext;

    @GetMapping("name")
    public String name(){
        return applicationContext.getEnvironment().getProperty("username");
    }
}
