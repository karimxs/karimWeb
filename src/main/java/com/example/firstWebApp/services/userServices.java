package com.example.firstWebApp.services;

import com.example.firstWebApp.entities.user;
import com.example.firstWebApp.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class userServices {
    @Autowired
    private userRepository repository;

    public user addUser(user u)
    {
        return repository.save(u);
    }
    public ArrayList<user> getAll()
    {
        return (ArrayList<user>) repository.findAll();
    }
    public Optional<user> findUserById(Long id)
    {
        return repository.findById(id);
    }

  /*  public user updateUserInfo(user u,Long id)
    {
        Optional<user> u1 = repository.findById(id);
        u1.get().setAddress(u.getAddress());
        u1.get().setFirstName(u.getFirstName());
        u1.get().setEmail(u.getEmail());
        u1.get().setSecondName(u.getSecondName());
        u1.get().setPhoneNumber(u.getPhoneNumber());
        return repository.save(u1);
    }*/
}