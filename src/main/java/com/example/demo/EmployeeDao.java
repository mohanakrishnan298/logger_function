package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	@Autowired EmployeeRepo emprepo;
	
	public String save(EmployeeEntity e) {
		emprepo.save(e);
		return "SAVED SUCCESSFULLY";
	}
	public String delete(int id) {
	try {
		emprepo.deleteById(id);
		return "DELETE SUCCESSULLY";
		
		}catch(Exception b) {
			return "";
		}
	}
	public String update(EmployeeEntity e) {
		emprepo.save(e);
		return "UPDATE SUCCESSFULLY";
	}
	public EmployeeEntity get(int id) {
	return emprepo.getById(id);

}
	public String save(String name) {
		// TODO Auto-generated method stub
		emprepo.save(name);
		return "saved";
	}
}
