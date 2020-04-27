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

import com.produtos.apirest.domain.Task;
import com.produtos.apirest.repository.TaskRepository;

@RestController
@RequestMapping(value="/api")
public class TaskResource {
	
	@Autowired
	TaskRepository taskRepository;
	
	@GetMapping("/task")
	public List<Task> listaTask(){
		return taskRepository.findAll();
	}
	
	@PostMapping("/task")
	public Task salvaTask(@RequestBody Task task) {
		return taskRepository.save(task);
	}
	
	@DeleteMapping("/task")
	public void deletaTask(@RequestBody Task task) {
		taskRepository.delete(task);
	}
	
	@PutMapping("/task")
	public Task atualizaTask(@RequestBody Task task) {
		return taskRepository.save(task);
	}
	
}
