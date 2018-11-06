package com.boot.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: kmm
 * @Date: 2018-11-06 10:59
 * @Description:
 */
@RestController
@Api(tags = "测试接口-API")
public class HelloWorld {

    @GetMapping("/hello")
    @ApiOperation("hello的测试接口")
    @ApiImplicitParam(name = "name", value = "名称", required = true, dataType = "String")
    public String hello(@RequestParam(required = true) final String name) {
        return name + "Hello World" + System.currentTimeMillis();
    }
}
