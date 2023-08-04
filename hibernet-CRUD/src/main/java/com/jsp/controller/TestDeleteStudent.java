package com.jsp.controller;

import com.jsp.dto.Student;

import com.jsp.services.StudentServices;

public class TestDeleteStudent {

	public static void main(String[] args) {


		StudentServices services = new StudentServices();
		
		Student student=services.deleteStudent(1);
		
		if(student!=null) {
			
			System.out.println("data deleted");
		}
		
		else {
		 System.out.println("check the data");
		}
	}

}
