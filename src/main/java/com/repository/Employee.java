package com.repository;



public class Employee {
	public Employee(int employeeId, String name, String role, String reportsTo) {
		super();
		EmployeeId = employeeId;
		Name = name;
		this.role = role;
		ReportsTo = reportsTo;
	}


	public int getEmployeeId() {
		return EmployeeId;
	}


	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public String getReportsTo() {
		return ReportsTo;
	}


	public void setReportsTo(String reportsTo) {
		ReportsTo = reportsTo;
	}


	int EmployeeId;
	

	String Name;
	

	String role;
	

	String ReportsTo;

}
