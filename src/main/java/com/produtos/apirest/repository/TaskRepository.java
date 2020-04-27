package com.produtos.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produtos.apirest.domain.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{
	
	Task findById(long id);
}
