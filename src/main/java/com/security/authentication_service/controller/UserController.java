package com.security.authentication_service.controller;

import com.security.authentication_service.model.Users;
import com.security.authentication_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public Users registerUser(@RequestBody Users user){
        return userService.registerUser(user);
    }
}
