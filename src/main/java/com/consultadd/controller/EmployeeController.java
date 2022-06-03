package com.consultadd.controller;

import com.consultadd.model.Employee;
import com.consultadd.model.repository.EmployeeRepository;
import com.consultadd.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/employee")
    public List<Employee> getEmployees(){
//        List<Employee> employeeList=employeeService.findAll();
        return employeeService.getEmployees();
    }
    @PostMapping("/addemp")
    public String saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }
}
