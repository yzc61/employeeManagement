package com.pika.em.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pika.em.DAO.EmployeesDAO;
import com.pika.em.DAO.EmployeesDAOImpl;
import com.pika.em.api.Employees;
import com.pika.em.api.EmployeesDTO;
import com.pika.em.service.EmployeesService;

@Controller
public class EmployeesController {
	
	//@Autowired
	//private EmployeesDAO EmployeesDAO ;
	
	@Autowired
	private EmployeesService employeesService;
	
	@GetMapping("/showEmployees")
	public String showEmployeesList(Model model) {
		
		List<Employees> employeesList = employeesService.loadEmployees();
				
		model.addAttribute("employees", employeesList);
		return "employees-list";
	}
	
	@GetMapping("/showAddEmployees")
	public String addEmployees(Model model) {
		
		//EmployeesDTO employeesDTO = new EmployeesDTO();
		Employees employees = new Employees();
		
		//model.addAttribute("employees",employeesDTO);
		model.addAttribute("employees",employees);
		
		return "add-employees";
	}
	

	@PostMapping("/save-employees")
	//public String saveEmployees(EmployeesDTO employeesDTO) {
	public String saveEmployees(Employees employees) {
		
		System.out.println(employees);
		
		if(employees.getId()==0) {
			employeesService.saveEmployees(employees);
		}else {
			employeesService.update(employees);
		}
		
		
		
		//employeesService.saveEmployees(employees);
		//return "redirect:/thankyou";
		return "redirect:/showEmployees";
	}
	 
	
	//@ResponseBody
	//@GetMapping("/thankyou")
	//public String thanks() {
		
		//return "Record has been saved...";
	//}
	
	
	
	
	@GetMapping("/uptadeEmployees")
	public String updateEmployees(@RequestParam("userId") int id,Model model) {
		
		Employees myemployee = employeesService.getEmployees(id);
		System.out.println(myemployee);
		
		model.addAttribute("employees", myemployee);
		
		return "add-employees";
	}
	
	@GetMapping("/deleteEmployees")
	public String deleteEmployees(@RequestParam("userId") int id) {
		
		employeesService.deleteEmployees(id);
		
		return "redirect:/showEmployees";
	}
	
		
}
