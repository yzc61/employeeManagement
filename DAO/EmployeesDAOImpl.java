package com.pika.em.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pika.em.api.Employees;
import com.pika.em.rowmapper.EmployeeRowMapper;

@Repository
public class EmployeesDAOImpl implements EmployeesDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Employees> loadEmployees() {
		
		String sql="SELECT * FROM employees";
		
		List<Employees> theListOfEmployees =jdbcTemplate.query(sql, new EmployeeRowMapper());
		
		
		return theListOfEmployees;
	}

	@Override
	public void saveEmployees(Employees employee) {
		
		Object[] sqlParam = {employee.getFname(),employee.getLname(),employee.getDepartment(),employee.getWage()};
		
		String sql = "INSERT INTO `company`.`employees` (fname,lname,department,wage) VALUES (?,?, ?, ?)";
		
		jdbcTemplate.update(sql, sqlParam);
		
		System.out.println("1 record inserted....");
	
	}

	@Override
	public Employees getEmployee(int id) {
		
		String sql = "SELECT * FROM EMPLOYEES WHERE ID=?";
		Employees employee = jdbcTemplate.queryForObject(sql, new EmployeeRowMapper(), id);
		
		return employee;
	}

	@Override
	public void update(Employees employee) {
		
		String sql = "UPDATE `company`.`employees` SET `fname` = ?, `lname` = ?, `department` = ?, `wage` = ? WHERE (`id` = ?)";
		
		jdbcTemplate.update(sql,employee.getFname(),employee.getLname(),employee.getDepartment(),employee.getWage(),employee.getId());
		System.out.println("Record updated....");
	
	}

	@Override
	public void delete(int id) {
		
		String sql = "DELETE FROM `company`.`employees` WHERE (`id` = ?)";
		jdbcTemplate.update(sql,id);
	}



}
