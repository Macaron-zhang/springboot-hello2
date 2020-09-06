package com.atguigu.springboot.springboothello2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuickSpringBootController {
    @RequestMapping("/hello")
    public String QuickHello(){
        return "HelloSpringBoot!!!!";
    }
}
