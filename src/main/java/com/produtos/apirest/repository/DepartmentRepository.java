package com.produtos.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produtos.apirest.domain.Department;


public interface DepartmentRepository extends JpaRepository<Department, Long>{
	
	Department findById(long id);
	
}
