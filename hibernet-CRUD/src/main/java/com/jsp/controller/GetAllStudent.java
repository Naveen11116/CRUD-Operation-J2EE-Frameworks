package com.jsp.controller;

import java.util.List;

import com.jsp.dto.Student;
import com.jsp.services.StudentServices;

public class GetAllStudent {

	public static void main(String[] args) {

		StudentServices services = new StudentServices();

		List<Student> list = services.getAll();

		if (list.size()>0) {
			for(Student student : list) {
				
				System.out.println(student.getId());
				System.out.println(student.getName());
				System.out.println(student.getAge());
				System.out.println(student.getPhNo());
			}
		}
		else
			System.out.println("chek data");
		
		}

	}
