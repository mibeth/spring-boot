package com.okta.rest.springboot.controller;

//import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;


@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
            return "Hello, "+""+"!";
    }

    @GetMapping("/add")
    public String add(@RequestParam int number1, @RequestParam int number2){
        return String.valueOf(number1+number2);
    }
}
