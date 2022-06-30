package com.akash.assessment.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int empId;
	String empName;
	int empSal;
	String empRole;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpSal() {
		return empSal;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	public String getEmpRole() {
		return empRole;
	}
	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}
	public Employee(String empName, int empSal, String empRole) {
		super();
		this.empName = empName;
		this.empSal = empSal;
		this.empRole = empRole;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName, int empSal, String empRole) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empRole = empRole;
	}
	
	
}
