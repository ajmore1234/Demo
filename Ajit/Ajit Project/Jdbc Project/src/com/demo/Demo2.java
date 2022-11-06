package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("step 1");
		 String url="jdbc:mysql://localhost:3306/studentdb?characterEncoding=utf8";
		 System.out.println("Step 2");
	Connection	connection=DriverManager.getConnection(url, "root", "root");
String sqlQuery="update  ajit set name=? where id=?";
PreparedStatement pst=connection.prepareStatement(sqlQuery);
System.out.println("step3");
pst.setString(1, "gopal");
pst.setInt(2,5);
  
  int rowsAffected= pst.executeUpdate();
  System.out.println("executed");

	}

}
