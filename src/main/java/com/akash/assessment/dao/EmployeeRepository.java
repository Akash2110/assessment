package com.akash.assessment.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akash.assessment.beans.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
