package com.ironhack.LabWeek4.controller;

import com.ironhack.LabWeek4.service.HelloService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping
public class HelloController {
    private final HelloService helloService;
    public HelloController(HelloService helloService){
        this.helloService = helloService;
    }

//print Hello message
    @GetMapping("/hello")
        public String hello(){
        return helloService.getMessage();
    }
}