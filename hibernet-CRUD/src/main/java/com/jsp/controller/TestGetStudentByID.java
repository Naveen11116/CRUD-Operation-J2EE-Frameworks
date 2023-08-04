package com.jsp.controller;

import com.jsp.dto.Student;
import com.jsp.services.StudentServices;

public class TestGetStudentByID {

	public static void main(String[] args) {

		StudentServices services = new StudentServices();
		
		Student student    =services.getStudenById(1);
		
		if(student!=null ) {
			System.out.println(student.getId());
			System.out.println(student.getName());
			System.out.println(student.getAge());
			System.out.println(student.getPhNo());
		}
		
		else
			System.out.println("check id once");
	}
	
	

}
