package com.pika.em.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.pika.em.api.Employees;

public class EmployeeRowMapper implements RowMapper<Employees>{

	@Override
	public Employees mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Employees employee = new Employees();
		
		employee.setId(rs.getInt("id"));
		employee.setFname(rs.getString("fname"));
		employee.setLname(rs.getString("lname"));
		employee.setDepartment(rs.getString("department"));
		employee.setWage(rs.getInt("wage"));
			
		return employee;
	}

	
	
}
