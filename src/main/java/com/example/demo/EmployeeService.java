package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class EmployeeService {
	
	@Autowired  EmployeeDao empdao;
	
	public String save(EmployeeEntity e) {
		return empdao.save(e);
		
	}public String save (String name) {
		if(name.contains(name.toUpperCase())) {
			return empdao.save(name);
		}else {
		
	return "not valid";
		}
	}
	public String delete(int id) {
		return empdao.delete(id);
	}
	public String update(EmployeeEntity e) {
		return empdao.update(e);
	}
	public  EmployeeEntity get(int id) {
		return empdao.get(id);
	}

}
