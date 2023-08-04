package com.jsp.controller;

import com.jsp.dto.Employee;
import com.jsp.services.EmployeeService;

public class TestSaveEmployee {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		emp.setId(5);
		emp.setName("priya");
		emp.setPhNo(9224789l);
		emp.setEmail("npri@gmail.com");
		emp.setPassword("priyana");
		
		EmployeeService eS = new EmployeeService();
		
		 int res = eS.saveEmployee(emp);
		 
		 if(res>0) {
			 System.out.println("data saved");
		 }
		 else
			 System.out.println("data check once");

	}

}
