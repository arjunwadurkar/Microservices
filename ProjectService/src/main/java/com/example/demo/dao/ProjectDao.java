package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Project;
import com.example.demo.repository.ProjectRepo;
import com.example.demo.service.ProjectService;

@Service
public class ProjectDao implements ProjectService {

	
	@Autowired
	ProjectRepo repo;
	
	@Override
	public List<Project> getProjectList() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Project getProjectById(String id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public Project addProject(Project pro) {
		// TODO Auto-generated method stub
		return repo.save(pro);
	}

	@Override
	public void deleteProject(String id) {
		repo.deleteById(id);

	}

	@Override
	public List<Project> getProjectbyEmployeeId(String id) {
		// TODO Auto-generated method stub
		//http://192.168.1.10:8083/project
		
		return repo.findByEid(id);
	}

}
