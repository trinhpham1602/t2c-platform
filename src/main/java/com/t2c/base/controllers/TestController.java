package com.t2c.base.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
  
@RestController
public class TestController {
  
    @GetMapping("/")
    public String helloGFG(String name)
    {
        return String.format("Hello, %s!", name);
    }
}