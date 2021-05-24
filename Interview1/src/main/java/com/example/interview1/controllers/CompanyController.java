package com.example.interview1.controllers;

import com.example.interview1.entities.Company;
import com.example.interview1.entities.User;
import com.example.interview1.repositories.CompanyRepo;
import com.example.interview1.repositories.UserRepo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/company")
@ResponseBody
public class CompanyController {
    @Autowired
    CompanyRepo companyRepo;
    @Autowired
    UserRepo userRepo;
    @GetMapping(value = "/")
    public List<Company> getAll()
    {
        return companyRepo.findAll();
    }
    @PostMapping(value = "/addCompany")
    @JsonIgnore
    public Company addCompany(@RequestBody Company company)

    {
        return companyRepo.save(company);
    }
}
