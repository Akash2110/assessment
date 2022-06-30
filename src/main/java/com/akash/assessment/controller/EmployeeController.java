package com.akash.assessment.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.mapping.Array;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.akash.assessment.beans.Employee;
import com.akash.assessment.dao.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@PostMapping("/addemp")
	
	void addEmployee(@RequestBody Employee e) {
		if(e!=null) {
			employeeRepository.save(e);
		}
		else {
			System.out.println("employee object is null");
		}
	}
	
	@GetMapping("/getemployees")
	List<Employee> getAllEmployee() {
	    List<Employee> list=new ArrayList<Employee>();
	    	list=	employeeRepository.findAll();
	    return list;
	}
	
	@GetMapping("/getemp")
	
	Employee getEmployeeBasedOnId(@RequestParam("id")int id) {
		Employee employee=employeeRepository.findById(id).get();
		return employee;
	}
	
	
	@DeleteMapping("/delemp")
	
	void deleteEmployeeBasedOnId(@RequestParam("id")int id) {
		
		Employee e=employeeRepository.getReferenceById(id);
		employeeRepository.delete(e);
		
	}
	
	
	
	
}
