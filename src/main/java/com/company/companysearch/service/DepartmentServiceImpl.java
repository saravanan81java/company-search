package com.company.companysearch.service;

import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	public DepartmentServiceImpl() {
		System.out.println("DepartmentService : "+ this.hashCode());
	}
	
	public void display() {
		System.out.println("DepartmentService");
	}

}
