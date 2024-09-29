package com.company.companysearch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.companysearch.service.DepartmentService;
import com.company.companysearch.service.EmployeeService;

@RestController
public class CompanyController {
	
	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	DepartmentService departmentService;
	
	@GetMapping("/ping")
	public String ping() {
		return "Welcome ping action sucessfully executed!!!";
	}
	
	@GetMapping("/pingMe")
	public String pingMe() {
		return "Welcome ping me action sucessfully executed!!!";
	}

}