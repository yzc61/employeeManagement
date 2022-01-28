<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Pika Pika Pika</h1>

<div align="center">

	<form action="showAddEmployees">
	<input type="submit" value="Add">
	
	</form>

<table border="1">
	<thead>
	<tr>
		<td>id</td>
		<td>first name</td>
		<td>last name</td>
		<td>department</td>
		<td>wage</td>
		
	</tr>
	</thead>
	<c:forEach var="employees" items="${employees}">
	<tr>	
		<td>${employees.id}</td> 
		<td>${employees.fname}</td>
		<td>${employees.lname}</td>
		<td>${employees.department}</td>
		<td>${employees.wage}</td>   
		<td> <a href ="uptadeEmployees?userId=${employees.id}"> Update </a> </td>
		<td> <a href ="deleteEmployees?userId=${employees.id}" onclick="if(!(confirm('Are you sure?'))) return false"> Delete </a> </td>
	</tr>	
	</c:forEach>
	
</table>
</div>
</body>
</html>