package com.task.playhouse.services;

import javax.transaction.Transactional;

import com.task.playhouse.models.entities.User;
import com.task.playhouse.models.repositories.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepo userRepo;

    //Create
    public User save(User user){
        return userRepo.save(user);
    }
}
