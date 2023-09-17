package com.t2c.base.controllers;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;

  
@RestController
public class TestController {
  
    @GetMapping("/")
    public String helloGFG(@AuthenticationPrincipal Jwt jwt)
    {
        return String.format("Hello, %s!", jwt.getClaimAsString("preferred_username"));
    }
}