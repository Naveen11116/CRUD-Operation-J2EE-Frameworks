package com.jsp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

import com.jsp.dto.Employee;

import com.mysql.cj.jdbc.Driver;

public class EmployeeDao {

	public void createTable() {

		try {
			DriverManager.registerDriver(new Driver());

			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud?user=root&password=root");

			Statement s = c.createStatement();

			s.executeUpdate(
					"create table employee1(id int primary key,name varchar(45),phNo bigint(10), email varchar(45),password varchar(45))");

			c.close();
			System.out.println("table created");
		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public int saveEmployee(Employee emp) {

		try {
			DriverManager.registerDriver(new Driver());

			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud", "root", "root");

			PreparedStatement pS = c.prepareStatement("insert into employee1 values(?,?,?,?,?)");

			pS.setInt(1, emp.getId());
			pS.setString(2, emp.getName());
			pS.setLong(3, emp.getPhNo());
			pS.setString(4, emp.getEmail());
			pS.setString(5, emp.getPassword());

			int res = pS.executeUpdate();

			c.close();

			return res;

		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public int updateEmployee(Employee emp) {

		try {
			DriverManager.registerDriver(new Driver());

			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud", "root", "root");

			PreparedStatement pS = c.prepareStatement("update employee1 set name=?,phNo=?,email=?,password=? where id=?");
			
			pS.setString(1, emp.getName());
			pS.setLong(2, emp.getPhNo());
			pS.setString(3, emp.getEmail());
			pS.setString(4, emp.getPassword());
			pS.setInt(5, emp.getId());

			int res = pS.executeUpdate();

			c.close();

			return res;
		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;

	}

	public int deleteEmployee(int id) {
		
		try {
			DriverManager.registerDriver(new Driver());

			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud", "root", "root");

			PreparedStatement pS = c.prepareStatement("delete from employee1 where id=?");

			pS.setInt(1, id);

			int res = pS.executeUpdate();

			c.close();

			return res;

		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public List<Employee> getAllEmployee() {

		List<Employee> list = new ArrayList<>();

		try {
			DriverManager.registerDriver(new Driver());

			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud", "root", "root");

			Statement statement = c.createStatement();

			ResultSet resultSet = statement.executeQuery("select * from employee1");

			while (resultSet.next()) {
				int id = resultSet.getInt(1);

				String name = resultSet.getString(2);

				long phno = resultSet.getLong(3);

				String email = resultSet.getString(4);

				String password = resultSet.getString(5);

				Employee employee = new Employee();

				employee.setId(id);

				employee.setName(name);

				employee.setPhNo(phno);

				employee.setEmail(email);

				employee.setPassword(password);

				list.add(employee);

			}

		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public Employee getEmployeebyId(int id) {

		Employee employee = new Employee();

		try {
			DriverManager.registerDriver(new Driver());

			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud", "root", "root");

			Statement statement = c.createStatement();

			ResultSet resultSet = statement.executeQuery("select * from employee1");

			while (resultSet.next()) {

				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getLong(3));
				System.out.println(resultSet.getString(4));
				System.out.println(resultSet.getString(5));
			}

		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return employee;
	}
	
	public Employee loginEmployee(String email, String password) {
		
		Employee employee = new Employee();
		
		try {
			DriverManager.registerDriver(new Driver());
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud", "root", "root");
			
			PreparedStatement preparedStatement = connection.prepareStatement("select * from employee1 where email=? and password=?");
			
			preparedStatement.setString(1, email);
			
			preparedStatement.setString(2, password);
			
			ResultSet resultSet= preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				employee.setId(resultSet.getInt(1));
				employee.setName(resultSet.getString(2));
				employee.setPhNo(resultSet.getLong(3));
				employee.setEmail(resultSet.getString(4));
				employee.setPassword(resultSet.getString(5));
				
			}
			
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return employee;
	}
}
