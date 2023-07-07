package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.RedisService;

@RestController
@RequestMapping("/api")
public class RedisController {

    @Autowired
    private RedisService redisService;

    @GetMapping("/getFromRedis")
    public String getFromRedis(String key) {
        return redisService.getFromRedis(key);
    }
}
