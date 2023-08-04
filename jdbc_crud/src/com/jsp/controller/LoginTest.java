package com.jsp.controller;

import com.jsp.dto.Employee;
import com.jsp.services.EmployeeService;

public class LoginTest {

	public static void main(String[] args) {
		
		EmployeeService employeeService = new EmployeeService();
		
		Employee employee= employeeService.logInEmployee("naveen@gmail.com", "naveen12345");
		
		if(employee!=null) {
			
			System.out.println(employee.getEmail());
			System.out.println(employee.getId());
			System.out.println(employee.getName());
			System.out.println(employee.getPassword());
			System.out.println(employee.getPhNo());
		}
		
		else
			System.out.println("invalid data");	

	}

}
