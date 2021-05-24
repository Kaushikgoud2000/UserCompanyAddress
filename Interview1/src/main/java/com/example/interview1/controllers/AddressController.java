package com.example.interview1.controllers;

import com.example.interview1.entities.Address;
import com.example.interview1.entities.User;
import com.example.interview1.repositories.AddressRepo;
import com.example.interview1.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/address")
@ResponseBody
public class AddressController {
    @Autowired
    AddressRepo addressRepo;
    @Autowired
    UserRepo userRepo;
    @GetMapping(value = "/")
    public List<Address> getAll()
    {
        return addressRepo.findAll();
    }
    @GetMapping("user/bycity")
    public List<User> getByCity(@RequestParam String city)
    {
        if(city == null)
        {
            return userRepo.findAll();
        }
        else
        {
            List<User> res=new ArrayList<>();
            List<User> temp=userRepo.findAll();
            for(User user:temp)
            {
                if(user.getAddress().getCity().equals(city))
                {
                    res.add(user);
                }
            }
            return res;
        }
    }


    @PostMapping(value = "/addAddress")
    public Address addAddress(@RequestBody Address address)
    {
        return addressRepo.save(address);
    }
}
