package com.xiehaojie.usrmgr.controller;

import com.xiehaojie.usrmgr.aop.AuthChecker;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @AuthChecker
    @RequestMapping("/hello")
    public String hello() {
        return "Hello Spring Boot!";
    }
}
