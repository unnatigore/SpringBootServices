package com.cg.rest.restservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.rest.restservice.entity.Employee;

@Service
public interface EmployeeService {

	void updateEmployee(Employee employee);

	void addNewEmployee(Employee employee);

	List<Employee> getAllEmployees();

	void deleteEmployee(int empId);

	Object getEmployeeById(int empId);



}
