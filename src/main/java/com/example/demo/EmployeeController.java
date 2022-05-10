package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {
	@Autowired
	EmployeeService empser;
	
	@PostMapping(value="/save")
	public String save (@RequestBody EmployeeEntity e) {
		return empser.save(e);
	}
	
	@DeleteMapping(value="/delete/{id}")
	public String delete(@PathVariable ("id") int d) {
		return empser.delete(d);
	}
	
	@PostMapping(value="/update/{id}")
	public String update (@RequestBody EmployeeEntity e) {
		return empser.update(e);
	}
	@GetMapping(value="/get/{id}")
	public EmployeeEntity get(@PathVariable int id) {
		return empser.get(id); 
	}
	

}
