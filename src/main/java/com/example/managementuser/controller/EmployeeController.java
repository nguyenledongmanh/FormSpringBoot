package com.example.managementuser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.managementuser.dto.Employee;
import com.example.managementuser.service.IEmployeeService;

@Controller
public class EmployeeController {
    
    @Autowired
    private IEmployeeService iService;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listEmployees", iService.getAllEmployees());
        return "index";
    }

    @GetMapping("/new-employee-form")
    public String newEmployeeForm(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "new_employee";
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        // TODO save employee to database
        iService.saveEmployee(employee);
        return "redirect:/";
    }
}
