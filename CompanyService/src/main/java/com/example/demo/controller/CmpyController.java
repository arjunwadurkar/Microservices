package com.example.demo.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CompanyInfoModel;
import com.example.demo.service.CompanyService;

@RestController
@RequestMapping("/company")
public class CmpyController {
	
	@Autowired
	CompanyService cs;
	
	
	@GetMapping
	public List<CompanyInfoModel> getCompanyList(){
		
		return cs.getCompanyList();
	}
	@GetMapping("/{id}")
	public CompanyInfoModel getCompanyById(@PathVariable String id)
	{
		return cs.getCompanyById(id);
	}
	@PostMapping
	public CompanyInfoModel addComapny(@RequestBody CompanyInfoModel cmp) {
		cmp.setCid(UUID.randomUUID().toString());
		
		return cs.addCompany(cmp);
	}
	@DeleteMapping("/{id}")
	public String deleteCompany(@PathVariable String id) {
		cs.deleteCompany(id);
		return "Deleted";
	}

}
