package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.repository.Employee;
import com.service.EmployeeService;

@RestController
@RequestMapping("/v1/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService ; 
	
	@GetMapping("/getAll")
	public List<Employee> getAllEmployee(){
		List<Employee> emp = employeeService.getAll();
		
		return emp;
		
	}
}
