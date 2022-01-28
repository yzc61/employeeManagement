<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<h3> Add Employee</h3>
	<form:form action="save-employees" modelAttribute="employees" method="POST">
	
	<form:hidden path="id"/>
	<label>First Name:</label>
	<form:input path="fname"/>
	<br/>
	<label>Last Name:</label>
	<form:input path="lname"/>
	<br/>
	<label>Department</label>
	
	<form:select path="department">
    <form:option value="Human Resources" label="Human Resource"/>
    <form:option value="Engineer" label="Engineer"/>
    <form:option value="Technician" label="Technician"/>
    </form:select>
	<br/>
	<label>Wage:</label>
	<form:input path="wage"/>
	<br/>
	<input type="submit" value="Submit">
	
	</form:form>
</div>	
</body>
</html>