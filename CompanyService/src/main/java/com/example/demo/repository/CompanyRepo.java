package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.CompanyInfoModel;

public interface CompanyRepo extends JpaRepository<CompanyInfoModel, String> {

}
