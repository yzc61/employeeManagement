package com.pika.em.DAO;

import java.util.List;

import com.pika.em.api.Employees;

public interface EmployeesDAO {
	
	List<Employees> loadEmployees();
	void saveEmployees(Employees employee);
	Employees getEmployee(int id);
	void update(Employees employee);
	void delete(int id);
}
