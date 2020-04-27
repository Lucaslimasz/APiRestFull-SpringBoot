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

import com.produtos.apirest.domain.ProjectHistory;
import com.produtos.apirest.repository.ProjectHistoryRepository;

@RestController
@RequestMapping(value="/api")
public class ProjectHistoryResource {

	@Autowired
	ProjectHistoryRepository projectHistoryRepository;
	
	@GetMapping("/ProjectHistory")
	public List<ProjectHistory> listaProjectHistory(){
		return projectHistoryRepository.findAll();
	}
	
	@PostMapping("/ProjectHistory")
	public ProjectHistory salvaProjectHistory(@RequestBody ProjectHistory projectHistory) {
		return projectHistoryRepository.save(projectHistory);
	}
	
	@DeleteMapping("/ProjectHistory")
	public void deletaProjectHistory(@RequestBody ProjectHistory projectHistory) {
		projectHistoryRepository.delete(projectHistory);
	}
	
	@PutMapping("/ProjectHistory")
	public ProjectHistory atualizaProjectHistory(@RequestBody ProjectHistory projectHistory) {
		return projectHistoryRepository.save(projectHistory);
	}
}
