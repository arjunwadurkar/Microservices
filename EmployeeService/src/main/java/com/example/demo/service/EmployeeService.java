package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeService {
	
	public List<Employee> getAllEmployee();
	public Employee getEmployeeById(String id);
	public Employee addEmployee(Employee emp);
	public void deleteEmployeeById(String id);
	public List<Employee> EmployeeByCompanyId(String id);
	

}
