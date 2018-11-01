package com.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.db.DBConnection;
import com.model.Student;

public class StudentService {
	public StudentService() {
		  System.out.println("hi");
	}
	
	public static boolean addStudent(Student student) throws SQLException, ClassNotFoundException{
		 Connection connection = new DBConnection().getConnection();
		String sql = "INSERT INTO STUDENT VALUES(?,?,?,?)";
		PreparedStatement stm = connection.prepareStatement(sql);
		
		stm.setObject(1, student.getIndexNumber());
		stm.setObject(2, student.getName());
		stm.setObject(3, student.getTelephone());
		stm.setObject(4, student.getEmail());
		System.out.println(student.getEmail());
		int res = stm.executeUpdate();
		connection.close();
		return (res>0);
	}
	
	public Student searchStudent(String indexNumber) throws SQLException, ClassNotFoundException{
		Connection connection = new DBConnection().getConnection();
		String sql = "SELECT * FROM WHERE indexNumber = '"+indexNumber+"'";
		Statement stm = connection.createStatement();
		ResultSet rst = stm.executeQuery(sql);
		Student student = null;
		if(rst.next()){
			student = new Student(rst.getNString("IndexNumber"),rst.getNString("Name"),rst.getNString("Telephone")
					,rst.getNString("Email"));
		}
		return student;
	}
}
