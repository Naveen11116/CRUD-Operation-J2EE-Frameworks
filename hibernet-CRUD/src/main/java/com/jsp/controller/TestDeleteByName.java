package com.jsp.controller;

import java.util.List;

import com.jsp.dto.Student;
import com.jsp.services.StudentServices;

public class TestDeleteByName {

	public static void main(String[] args) {
		
		StudentServices services = new StudentServices();
		
		List<Student> list = services.deleteByName("naveen");
		
		if(list!=null) {
			System.out.println("data deleted");
		}
		else {
			System.out.println("check name once");
		}
				

	}

}
