package com.example.demo.service;

import java.util.List;

import com.example.demo.model.CompanyInfoModel;

public interface CompanyService {
	
	public List<CompanyInfoModel> getCompanyList();
	
	public CompanyInfoModel getCompanyById(String id);
	
	public CompanyInfoModel addCompany(CompanyInfoModel cmp);
	
	public void deleteCompany(String id);
	
}
