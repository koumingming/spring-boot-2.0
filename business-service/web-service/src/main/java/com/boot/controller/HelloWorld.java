package com.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: kmm
 * @Date: 2018-11-06 10:59
 * @Description:
 */
@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World" + System.currentTimeMillis();
    }
}
