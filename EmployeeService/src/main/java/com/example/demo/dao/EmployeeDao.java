package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepo;
import com.example.demo.service.EmployeeService;
@Service
public class EmployeeDao implements EmployeeService {

	@Autowired
	RestTemplate t1;
	@Autowired
	EmployeeRepo repo;
	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Employee getEmployeeById(String id) {
		// TODO Auto-generated method stub
		//http://192.168.1.10:8083/project
		Employee emp = repo.findById(id).orElseGet(null);
		
		String uri = "http://192.168.1.10:8083/project/employee/";
		ArrayList list = t1.getForObject( uri + emp.getEid(), ArrayList.class);
		
		emp.setProject(list);
		return emp;
	}

	@Override
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return repo.save(emp);
	}

	@Override
	public void deleteEmployeeById(String id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public List<Employee> EmployeeByCompanyId(String id) {
		// TODO Auto-generated method stub
		List<Employee> list = repo.findByCid(id);
		
		String uri = "http://192.168.1.10:8083/project/employee/";
		for(int i=0; i<list.size(); i++) {
			Employee emp =list.get(i);
			ArrayList list1 = t1.getForObject( uri + emp.getEid(), ArrayList.class);
			
			emp.setProject(list1);
			
		}
		return list;
	}

}
