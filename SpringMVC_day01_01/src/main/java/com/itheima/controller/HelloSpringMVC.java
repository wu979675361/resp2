package com.itheima.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//控制器类
@Controller
public class HelloSpringMVC {
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("Hello SpringMVC");
        return "success";
    }
}
