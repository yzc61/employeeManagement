package com.pika.em.service;

import java.util.List;

import com.pika.em.api.Employees;

public interface EmployeesService {

	List<Employees> loadEmployees();

	void saveEmployees(Employees employees);
	
	Employees getEmployees(int id);

	void update(Employees employees);

	void deleteEmployees(int id);
}
