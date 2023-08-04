package com.jsp.controller;

import java.util.List;

import com.jsp.dto.Employee;
import com.jsp.services.EmployeeService;

public class TestGetAllEmployee {

	public static void main(String[] args) {
		
		EmployeeService employeeService = new EmployeeService();
		
		List<Employee> employees = employeeService.getAllEmployee();
		
		if(employees.size()>0) {
			
	          for(Employee employee: employees) {
	        	  System.out.println(employee.getEmail());
	        	  System.out.println(employee.getId());
	        	  System.out.println(employee.getName());
	        	  System.out.println(employee.getPhNo());
	        	  System.out.println(employee.getPassword());
	          }
		}
		
		else
			System.out.println("plzz add the data");

	}

}
