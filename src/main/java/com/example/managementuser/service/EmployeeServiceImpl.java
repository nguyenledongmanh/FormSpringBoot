package com.example.managementuser.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.managementuser.dto.Employee;
import com.example.managementuser.repository.IEmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

    @Autowired
    private IEmployeeRepository iRepository;

    @Override
    public List<Employee> getAllEmployees() {
        // TODO Auto-generated method stub
        return iRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        // TODO Auto-generated method stub
        iRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(Long id) {
        Optional<Employee> optional = iRepository.findById(id);
        if (optional.isPresent()) {
            
            return optional.get();
        }
        
        throw new RuntimeException("Employee Not Found for id: " + id);
    }

    @Override
    public void DeleteEmployee(Long id) {
        // TODO Auto-generated method stub
        iRepository.deleteById(id);
    }


    
}
