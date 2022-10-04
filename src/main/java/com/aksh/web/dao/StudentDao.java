package com.aksh.web.dao;
import java.sql.*;

import com.demo.web.model.Student;

public class StudentDao {
	
	public Student getStudent(int id) {
		
		Student s =new Student();
		
		try {
			Class.forName("com.mysql.cj.jdbc");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","mysql");
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery("select * from Student where userId="+id);
			if(rs.next()) {
				s.setUserId(rs.getInt("userId"));
				s.setUserName(rs.getString("userName"));
			}
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		return null;
		
	}
	

	

}
