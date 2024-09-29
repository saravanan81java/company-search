package com.company.companysearch.service;

import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	public EmployeeServiceImpl() {
		System.out.println("EmployeeService : "+this.hashCode());
	}
	
	public void display() {
		System.out.println("EmployeeService");
	}

}
