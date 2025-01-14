package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Project;

public interface ProjectRepo extends JpaRepository<Project , String>
{

	public List<Project> findByEid(String id);
}
