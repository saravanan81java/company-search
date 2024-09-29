package com.company.companysearch;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.company.companysearch.service.EmployeeService;

@SpringBootApplication
public class CompanySerachApplication {
	
	public static boolean isPrime(int num) {
		if(num <= 1) {
			return false;
		}
		
		 
		for (int index = 2; index <= Math.sqrt(num); index++) {
			if(num % index == 0) {
				return  false;
			}
		}
		return true;
	}
	
	public static void primeFactors (int n) {
		List<Integer> listOfValues = new ArrayList<>();
		
		for (int i = 2; i <= n; i++) {
            if (n % i == 0 && isPrime(i)) {
                while (n % i == 0) {
                    
                    listOfValues.add(i);
                    n /= i;
                }
            }
        }
		
		listOfValues.forEach(num -> System.out.print(num + " "));
		
	}
	
	public static void main(String[] args) {
		primeFactors(315);
		primeFactors(12);
		
		System.out.println("\n" + System.getProperty("java.version"));
		System.out.println(org.springframework.core.SpringVersion.getVersion());
		SpringApplication.run(CompanySerachApplication.class, args);
		
	 
		
	}
}