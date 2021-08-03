package com.task.playhouse.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.task.playhouse.models.entities.User;
import com.task.playhouse.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api")

public class UserController{
    @Autowired
    private UserService userService;

    @PostMapping("/{id}")
    public User create(@RequestBody User user){
        return userService.save(user); 
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}