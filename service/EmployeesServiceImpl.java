package com.pika.em.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pika.em.DAO.EmployeesDAO;
import com.pika.em.api.Employees;

@Service
public class EmployeesServiceImpl implements EmployeesService {

	@Autowired
	EmployeesDAO employeesDAO;
	
	@Override
	public List<Employees> loadEmployees() {
		
		List<Employees> employeesList = employeesDAO.loadEmployees();
		
		
		
		return employeesList;
	}

	@Override
	public void saveEmployees(Employees employees) {
		// TODO Auto-generated method stub
		employeesDAO.saveEmployees(employees);
		
	}

	
	@Override
	public Employees getEmployees(int id) {
		
		return employeesDAO.getEmployee(id);
	}

	@Override
	public void update(Employees employees) {
		
		employeesDAO.update(employees);
		
	}

	@Override
	public void deleteEmployees(int id) {
		
		employeesDAO.delete(id);
		
	}

	
	

}
