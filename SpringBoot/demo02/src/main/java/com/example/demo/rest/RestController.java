package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    // expose "/" that returns a hello world
    @GetMapping("/")
    public String PrintWord(){
        return "Hello World";
    }

    // expose a new end point for workout

    @GetMapping("/workout")
    public String doWorkOut(){
        System.out.println("hellloo");
        return "start working out!";
    }

}
