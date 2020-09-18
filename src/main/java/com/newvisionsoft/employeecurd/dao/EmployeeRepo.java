package com.newvisionsoft.employeecurd.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newvisionsoft.employeecurd.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>
{
	
}
