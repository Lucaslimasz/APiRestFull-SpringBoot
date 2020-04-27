package com.produtos.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produtos.apirest.domain.ProjectHistory;

public interface ProjectHistoryRepository extends JpaRepository<ProjectHistory, Long>{

	ProjectHistory findById(long id);
	
}
