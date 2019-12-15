package com.zirfee.service_provider1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
    @GetMapping("/hi")
    public String hello(){
        return "helloWorld";
    }
}
