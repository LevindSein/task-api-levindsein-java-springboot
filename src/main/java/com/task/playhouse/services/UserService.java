package com.task.playhouse.services;

import java.util.Optional;

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

    //Create or Update
    public User save(User user){
        return userRepo.save(user);
    }

    //Get All Record
    public Iterable<User> findAll(){
        return userRepo.findAll();
    }

    //Exist Id
    public boolean existById(Long id){
        return userRepo.existsById(id);
    }

    //Find by Id
    public Optional<User> findById(Long id){
        return userRepo.findById(id);
    }

    //Delete by Id
    public void deleteById(Long id){
        this.userRepo.deleteById(id);
    }
}
