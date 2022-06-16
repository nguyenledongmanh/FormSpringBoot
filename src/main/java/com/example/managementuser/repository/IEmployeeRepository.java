package com.example.managementuser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.managementuser.dto.Employee;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Long>{
    
}