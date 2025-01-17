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

import com.example.demo.model.Project;
import com.example.demo.service.ProjectService;

@RestController
@RequestMapping("/project")
public class ProjectController {
	@Autowired
	ProjectService service;
	
	@GetMapping
	public List<Project> getProjectList()
	{
		return service.getProjectList();
	}
	
	@GetMapping("/{id}")
	public Project getProjectById(@PathVariable String id) {
		return service.getProjectById(id);
	}
	
	@PostMapping
	public Project addProject(@RequestBody Project pro) {
		pro.setPid(UUID.randomUUID().toString());
		return service.addProject(pro);
	}
	
	@DeleteMapping("/{id}")
	public String deleteProject(@PathVariable String id) {
		
		service.deleteProject(id);
		return "Project Deleted";
	}
	
	@GetMapping("/employee/{id}")
	public List<Project> getProjectByEmployeeId(@PathVariable String id){
		return service.getProjectbyEmployeeId(id);
	}

}
