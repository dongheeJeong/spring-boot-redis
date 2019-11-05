package com.spring.boot.redis.demoredis.controller;

import com.spring.boot.redis.demoredis.service.GetSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private GetSetService getSetService;

    @GetMapping("/getset")
    public String getSet() {
        return getSetService.test();
    }
}
