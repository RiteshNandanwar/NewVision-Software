package com.newvisionsoft.employeecurd.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newvisionsoft.employeecurd.entity.Employee;
import com.newvisionsoft.employeecurd.dao.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired
	EmployeeRepo employeeRepo;
	
	@Override
	@Transactional
	public List<Employee> findAll()
	{
		return employeeRepo.findAll();
	}

	@Override
	@Transactional
	public Employee getEmployee(int id) 
	{
		Optional<Employee> result = employeeRepo.findById(id);
		
		Employee employee = null;
		if(result.isPresent())
		{
			employee = result.get();
		}
		else
		{
			throw new RuntimeException("Did not find Employee id: "+id);
		}
		return employee;
	}

	@Override
	@Transactional
	public void deleteById(int id) 
	{
		employeeRepo.deleteById(id);
	}

	@Override
	@Transactional
	public void save(Employee employee) 
	{
		employeeRepo.save(employee);
	}

}