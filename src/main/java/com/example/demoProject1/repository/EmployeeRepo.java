package com.example.demoProject1.repository;

import com.example.demoProject1.entities.Employees;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

@Repository
public interface EmployeeRepo extends JpaRepository<Employees, Integer>{

//    Optional<Employees> findByEmail(String email);
}
