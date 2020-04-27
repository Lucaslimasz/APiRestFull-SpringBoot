package com.produtos.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produtos.apirest.domain.Project;


public interface ProjectRepository extends JpaRepository<Project, Long>{

	Project findById(long id);
	
}
