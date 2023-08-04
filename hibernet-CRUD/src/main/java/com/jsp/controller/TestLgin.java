package com.jsp.controller;

import com.jsp.dto.Student;
import com.jsp.services.StudentServices;

public class TestLgin {

	public static void main(String[] args) {

		StudentServices services = new StudentServices();

		Student student = services.login("naveen", 8074115l);

		if (student!=null) {
			
			System.out.println("home page");
		}
		else {
			
			System.out.println("check the name");
		}

	}

}
