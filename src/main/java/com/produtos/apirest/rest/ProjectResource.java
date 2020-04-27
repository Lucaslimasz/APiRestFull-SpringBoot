package com.produtos.apirest.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.produtos.apirest.domain.Project;
import com.produtos.apirest.repository.ProjectRepository;

@RestController
@RequestMapping(value="/api")
public class ProjectResource {
	@Autowired
	ProjectRepository projectRepository;
	
	@GetMapping("/Project")
	public List<Project> listaProject(){
		return projectRepository.findAll();
	}
	
	@PostMapping("/Project")
	public Project salvaProject(@RequestBody Project project) {
		return projectRepository.save(project);
	}
	
	@DeleteMapping("/Project")
	public void deletaProject(@RequestBody Project project) {
		projectRepository.delete(project);
	}
	
	@PutMapping("/Project")
	public Project atualizaProject(@RequestBody Project project) {
		return projectRepository.save(project);
	}
}
