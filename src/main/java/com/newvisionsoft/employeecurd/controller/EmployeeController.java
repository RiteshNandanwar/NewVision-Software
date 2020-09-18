package com.newvisionsoft.employeecurd.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newvisionsoft.employeecurd.entity.Employee;
import com.newvisionsoft.employeecurd.service.EmployeeService;

@RestController
@RequestMapping("/newvision")
public class EmployeeController
{
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employee> findAll()
	{
		return employeeService.findAll();
	}
	
	@GetMapping("/employee/{employeeid}")
	public Employee getEmployee(@PathVariable int employeeid)
	{
		Employee employee = employeeService.getEmployee(employeeid);
		
		if(employee == null)
		{
			throw new RuntimeException("Employee Id not Found : "+employeeid);
		}
		return employee;
	}
	
	@PostMapping("/employees")
	public void saveEmployee(@RequestBody Employee employee)
	{
		employee.setId(0);
		employeeService.save(employee);
	}
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee employee)
	{
		employeeService.save(employee);
		return employee;
	}
	
	@DeleteMapping("/employee/{employeeid}")
	public String deleteEmployee(@PathVariable int employeeid)
	{
		Employee employee = employeeService.getEmployee(employeeid);
		
		if(employee == null)
		{
			return "Employee ID not found , Id : "+employeeid;
		}
		else
		{
			employeeService.deleteById(employeeid);
			return "Employee Deleted, ID : "+employeeid;
		}
	}
}
