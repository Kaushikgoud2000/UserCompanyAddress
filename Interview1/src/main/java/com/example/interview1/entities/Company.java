package com.example.interview1.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Company {
    @Id
    private Long cid;
    private String cname;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn
    private List<User> users;
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;
}
