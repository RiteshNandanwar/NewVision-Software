package com.newvisionsoft.employeecurd.service;

import java.util.List;

import com.newvisionsoft.employeecurd.entity.Employee;

public interface EmployeeService 
{
	public List<Employee> findAll();
	
	public Employee getEmployee(int id);
	
	public void deleteById(int id);
	
	public void save(Employee employee); 

}
