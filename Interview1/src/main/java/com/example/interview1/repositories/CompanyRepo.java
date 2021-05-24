package com.example.interview1.repositories;

import com.example.interview1.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepo extends JpaRepository<Company,Long> {
    public Company findByCid(Long id);
}
