package com.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
     @RequestMapping("/")
     public String sayHelloWorld(){
         return "Hello World ! Spring Boot!";
     }

}
