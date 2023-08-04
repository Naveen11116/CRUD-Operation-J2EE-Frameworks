package com.jsp.controller;

import com.jsp.dto.Student;
import com.jsp.services.StudentServices;

public class TestUpdateStudent {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setId(1);
		student.setName("naveen kumar");
		student.setAge(21);
		student.setPhNo(8074115l);
		
	 StudentServices services = new StudentServices();
	 
	 Student student2= services.updateStudent(student);
	 
	 if(student2!=null)
	 {
		 System.out.println("data saved");
	 }
	 
	 else 
		 System.out.println("data check once");

	}

}
