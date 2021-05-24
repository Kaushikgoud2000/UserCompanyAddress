package com.example.interview1.entities;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class User {
    @Id
    private Long uid;
    private String uname;
    @OneToOne(cascade = CascadeType.ALL)
    public Address address;
}
