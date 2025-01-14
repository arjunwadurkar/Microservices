package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Project;

public interface ProjectService {


	public List<Project> getProjectList();
	public Project getProjectById(String id);
	public Project addProject(Project pro);
	public void deleteProject(String id);
	public List<Project> getProjectbyEmployeeId(String id);
}
