package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo {

	public static Connection getConnection() {
		Connection connection=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("step 1");
			String url="jdbc:mysql://localhost:3306/studentquizdb?characterEncoding=utf8";
			connection=DriverManager.getConnection(url, "root", "root");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Step2");
		return connection;
		
	}
		public static void main(String[] args) {
		//	getConnection();
			
		}

	}


