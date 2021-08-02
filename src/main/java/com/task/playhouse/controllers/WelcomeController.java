package com.task.playhouse.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("api/welcome")

public class WelcomeController{

    @GetMapping
    public String welcome(){
        return "Welcome Get Levind Sein";
    }
}