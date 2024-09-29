package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domains.User;
import com.example.demo.repositories.UserRepository;
import com.example.demo.services.exceptions.ObjectNotFoundException;

@Service
public class UserService {

    @Autowired
    private UserRepository user_repo;

    public List<User> findAllUsers(){
        return user_repo.findAll();
    }

    public User findByIUser(String id){

        Optional<User> opt = user_repo.findById(id);

        return opt.orElseThrow( () -> new ObjectNotFoundException(id) );
        
    }

}
