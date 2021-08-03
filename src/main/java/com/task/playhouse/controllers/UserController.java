package com.task.playhouse.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

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
    public Map<String, String> sayHello() {
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "200, OK");
        map.put("msg", "Hello World");
        return map;
    }
}