package com.example.interview1.repositories;

import com.example.interview1.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends JpaRepository<Address,Long> {
    public Address findByAid(Long id);
    public Address findByCity(String city);
}
