package com.task.playhouse.models.repositories;

import com.task.playhouse.models.entities.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {
    
}
