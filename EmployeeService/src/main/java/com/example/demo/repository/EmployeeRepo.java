package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, String>
{
	public List<Employee> findByCid(String id);

}
