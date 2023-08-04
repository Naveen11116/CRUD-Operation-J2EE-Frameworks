package com.jsp.controller;

import com.jsp.dto.Employee;

import com.jsp.services.EmployeeService;

public class TestEmployeeById {

	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		
		Employee employee = employeeService.getEmployeebyId(1);
		
		if(employee != null) {
			
			 System.out.println(employee.getId());
			 System.out.println(employee.getName());
			 System.out.println(employee.getPhNo());
			 System.out.println(employee.getEmail());
			 System.out.println(employee.getPassword());
			
		}
		
		else
		{
			System.out.println("please check id");
		}
        
		
	}

}
