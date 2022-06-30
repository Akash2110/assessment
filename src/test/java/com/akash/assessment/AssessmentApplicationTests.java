package com.akash.assessment;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.akash.assessment.beans.Employee;
import com.akash.assessment.dao.EmployeeRepository;



@SpringBootTest
class AssessmentApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;
	@Test
	void testAddFlight() {
		Employee employee=new Employee("arun",39000,"dotnet developer");
		employeeRepository.save(employee);
		
		List<Employee> list=employeeRepository.findAll();
		
		
		List<Employee> list1=employeeRepository.findAll();
	
		Assertions.assertEquals(list.size(), list1.size());
		}

	@Test
	void testUpdateFlight() {
		
		List<Employee> list=employeeRepository.findAll();
		Employee employee=list.get(0);
		
		String s=employee.getEmpName();
		employee.setEmpName(employee.getEmpName()+"kumar");
		
		
		employeeRepository.save(employee);
		System.out.println(employee.getEmpName()+"-------"+s);
		Assertions.assertNotEquals(s, employee.getEmpName());
		
	}
}
