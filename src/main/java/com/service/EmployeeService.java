package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.repository.Employee;
import com.repository.EmployeeRepository;
@Service
public class EmployeeService {
	public List<Employee> getEmployeeDetails() {
		
		return getAll();
	}

	public List<Employee> getAll() {
		List<Employee> empList = new ArrayList();
		Employee e1 = new Employee(1, "Rizwana", "Developer", "Arun");
		Employee e2 = new Employee(2, "Monal", "Developer", "Arun");
		Employee e3 = new Employee(3, "Siddharth", "Developer", "Arun");
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		return empList;
	}
	
	

}
