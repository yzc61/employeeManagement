package com.pika.em.api;

public class EmployeesDTO {
	private String fname;
	private String lname;
	private String department;
	private int wage;
	
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getWage() {
		return wage;
	}
	public void setWage(int wage) {
		this.wage = wage;
	}
	@Override
	public String toString() {
		return "EmployeesDTO [fname=" + fname + ", lname=" + lname + ", department=" + department + ", wage=" + wage
				+ "]";
	}
		
	
}
