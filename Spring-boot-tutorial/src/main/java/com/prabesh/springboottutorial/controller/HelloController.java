package com.prabesh.springboottutorial.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public int helloWorld(){
        return 1+1;
    }

}
