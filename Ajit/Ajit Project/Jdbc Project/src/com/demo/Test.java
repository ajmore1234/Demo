package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Here we created method
public class Test {
public static Connection getConnection() {
	Connection connection=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/studentdb?characterEncoding=utf8";
		connection=DriverManager.getConnection(url, "root", "root");
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return connection;
	
}
	public static void main(String[] args) {
	//	getConnection();
		
	}

}
