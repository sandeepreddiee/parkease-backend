package com.parkease.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // Tells Spring this is a controller class
public class HelloController {

    @GetMapping("/hello")  // If someone visits /hello in the browser...
    public String sayHello() {
        return "Hello Sandeep 👋 ParkEase backend is alive!";
    }
}
