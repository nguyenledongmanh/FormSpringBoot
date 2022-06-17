package com.example.managementuser.service;

import java.util.List;

import com.example.managementuser.dto.Employee;

public interface IEmployeeService {
    List<Employee> getAllEmployees();    
    void saveEmployee(Employee employee);
    Employee getEmployeeById(Long id);
    void DeleteEmployee(Long id);
}
