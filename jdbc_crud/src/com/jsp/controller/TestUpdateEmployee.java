package com.jsp.controller;

import com.jsp.dto.Employee;

import com.jsp.services.EmployeeService;

public class TestUpdateEmployee {

	public static void main(String[] args) {
		
	Employee employee = new Employee();
	
	employee.setId(4);
	
	employee.setName("priyakumar");
	
	employee.setPhNo(807455l);
	
	employee.setEmail("naveenpriya@gmail.com");
	
	employee.setPassword("priyakumar");
	
	EmployeeService service = new EmployeeService();
	
	int res = service.UpdateEmployee(employee);
	
	if(res>0) {
		
		System.out.println("data updated");
	}
	
	else
		System.out.println("data check once");
	}

}
