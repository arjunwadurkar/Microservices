package com.example.demo.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/employee") 
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@GetMapping
	public List<Employee> getAllEmployee()
	{
		return service.getAllEmployee();
	}
	
	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable String id) {
		return service.getEmployeeById(id);
	}
	
	@PostMapping
	public Employee addEmployee(@RequestBody Employee emp)
	{
		emp.setEid(UUID.randomUUID().toString());
		return service.addEmployee(emp);
	}
	
	@DeleteMapping("/{id}")
	public String deleteEmployee(@PathVariable String id) {
		service.deleteEmployeeById(id);
		return "Employee Deleted";
	}
	
	@GetMapping("/company/{id}")
	public List<Employee> getEmployeeByCompanyId(@PathVariable String id)
	{
		return service.EmployeeByCompanyId(id);
	}

}
