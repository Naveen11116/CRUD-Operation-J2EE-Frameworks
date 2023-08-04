package com.jsp.controller;

import com.jsp.services.EmployeeService;

public class TestDeleteEmployee {

	public static void main(String[] args) {
		
		EmployeeService employeeService = new EmployeeService();
		
		int res = employeeService.deleteEmployee(1);
		
		if(res>0) {
			
			System.out.println("data deleted");
		}
		
		else
			System.out.println("data check once");

	}

}
