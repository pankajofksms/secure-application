package com.security.authentication_service.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @GetMapping("/hello")
    public String hello(HttpServletRequest request){
        return "Welcome to Authentication Service. The session is : " + request.getSession().getId();
    }

}
