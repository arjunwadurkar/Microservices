package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.CompanyInfoModel;
import com.example.demo.model.Employee;
import com.example.demo.repository.CompanyRepo;
import com.example.demo.service.CompanyService;

@Service
public class ComapnyDao implements CompanyService {

	@Autowired
	RestTemplate rt;
	
	@Autowired
	CompanyRepo repo;
	
	@Override
	public List<CompanyInfoModel> getCompanyList() {
		
		return repo.findAll();
	}

	@Override
	public CompanyInfoModel getCompanyById(String id) {
		
		CompanyInfoModel cmp = repo.findById(id).orElse(null);
		
		String uri = "http://192.168.1.10:8082/employee/company/";
		
		ArrayList  list =rt.getForObject(uri+cmp.getCid(), ArrayList.class);
		//http://192.168.1.10:8082/employee
		cmp.setEmployee(list);
		return cmp;
	}

	@Override
	public CompanyInfoModel addCompany(CompanyInfoModel cmp) {
		// TODO Auto-generated method stub
		return repo.save(cmp);
	}

	@Override
	public void deleteCompany(String id) {
		// TODO Auto-generated method stub
		 repo.deleteById(id);
	}

}
