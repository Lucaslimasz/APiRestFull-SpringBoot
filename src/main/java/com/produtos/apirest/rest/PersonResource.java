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

import com.produtos.apirest.domain.Person;
import com.produtos.apirest.repository.PersonRepository;


@RestController
@RequestMapping(value="/api")
public class PersonResource {
	
	@Autowired
	PersonRepository personRepository;
	
	@GetMapping("/Person")
	public List<Person> listaPerson(){
		return personRepository.findAll();
	}
	
	@PostMapping("/Person")
	public Person salvaPerson(@RequestBody Person person) {
		return personRepository.save(person);
	}
	
	@DeleteMapping("/Person")
	public void deletaPerson(@RequestBody Person person) {
		personRepository.delete(person);
	}
	
	@PutMapping("/Person")
	public Person atualizaPerson(@RequestBody Person person) {
		return personRepository.save(person);
	}
	
}
