package com.jsp.controller;

import com.jsp.services.EmployeeService;

public class TestEmployee {

	public static void main(String[] args) {
		
		EmployeeService eS= new EmployeeService();
		
		eS.createTable();

	}

}
