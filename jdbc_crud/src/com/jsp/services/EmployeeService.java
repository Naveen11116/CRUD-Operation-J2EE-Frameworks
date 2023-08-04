package com.jsp.services;

import java.util.List;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

public class EmployeeService {

	EmployeeDao dao = new EmployeeDao();
	
	public void createTable() {
		
		dao.createTable();
	}
	
	public int saveEmployee(Employee emp) {
		
		return dao.saveEmployee(emp);
	}
	
	public int UpdateEmployee(Employee emp) {
		
		return dao.updateEmployee(emp);
	}
	
	public int deleteEmployee(int id) {
		
		return dao.deleteEmployee(id);
	}
	
	public List<Employee> getAllEmployee(){
		
		return dao.getAllEmployee();
		
	}
	
	public Employee getEmployeebyId(int id) {
		
		return dao.getEmployeebyId(id);
	}
	
	public Employee logInEmployee(String email, String password) {
		
		return dao.loginEmployee(email, password);
	}
}
