package com.jsp.services;
import java.util.List;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class StudentServices {

	StudentDao dao = new StudentDao();
	
	public Student saveStudent(Student student) {
		
		return dao.svaeStudent(student);
	}
	
	public Student updateStudent(Student student) {
		return dao.updateStudent(student);
		
	}
	
	public Student getStudenById(int id) {
		
		return dao.getStudentById(id);
	}
	
	public List<Student> getAll() {
		
		return dao.getAll();
	}
	
	public Student deleteStudent(int id) {
		
		return dao.deleteStudent(id);
	}
	public Student login(String name, long ph) {
		
		return dao.login(name,ph);
	}
	
	public List<Student> getByPosition(String name) {
		return dao.getByPosition(name);
	}
	
	public List<Student> deleteByName(String name) {
		
		return dao.deleteByName(name);
	}

}
