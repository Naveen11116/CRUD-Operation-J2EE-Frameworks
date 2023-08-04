package com.jsp.controller;

import com.jsp.dto.Student;
import com.jsp.services.StudentServices;

public class TestSaveStudent {

	public static void main(String[] args) {

		Student student = new Student();
		student.setId(3);
		student.setName("naveenku");
		student.setAge(23);
		student.setPhNo(8022585l);
		
	 StudentServices services = new StudentServices();
	 
	 Student student2= services.saveStudent(student);
	 
	 if(student2!=null) {
		 System.out.println("data saved");
	 }
	 
	 else 
		 System.out.println("data check once");
	}

}
