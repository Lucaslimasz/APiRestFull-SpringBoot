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

import com.produtos.apirest.domain.Department;
import com.produtos.apirest.repository.DepartmentRepository;


@RestController
@RequestMapping(value="/api")
public class DepartmentResource {
		
	@Autowired
	DepartmentRepository departmentRepository;
	
	@GetMapping("/department")
	public List<Department> listaDepartment(){
		return departmentRepository.findAll();
	}
	
	@PostMapping("/department")
	public Department salvaDepartment(@RequestBody Department department) {
		return departmentRepository.save(department);
	}

	@DeleteMapping("/department")
	public void deletaDepartment(@RequestBody Department department) {
		departmentRepository.delete(department);
	}
	
	@PutMapping("/department")
	public Department atualizaDepartment(@RequestBody Department department) {
		return departmentRepository.save(department);
	}
}
	
