package com.example.interview1.controllers;

import com.example.interview1.entities.User;
import com.example.interview1.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/User")
@ResponseBody
public class UserController {
    @Autowired
    UserRepo userRepo;
    @GetMapping(value = "/")
    public List<User> getAll()
    {
        return userRepo.findAll();
    }
    @PostMapping(value = "/addUser")
    public User addUser(@RequestBody User user)
    {
        return userRepo.save(user);
    }
}
