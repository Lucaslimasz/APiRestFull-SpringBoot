package com.produtos.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produtos.apirest.domain.Person;


public interface PersonRepository extends JpaRepository<Person, Long>{

	Person findById(long id);
}
