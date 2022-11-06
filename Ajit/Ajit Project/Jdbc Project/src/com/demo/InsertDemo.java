package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// load driver class
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Step 1");
		String url="jdbc:mysql://localhost:3306/studentdb?characterEncoding=utf8";
		// to establish connection
		Connection connection=DriverManager.getConnection(url, "root", "root");
		System.out.println("Step 2");
		// create a sql Statement
		Statement statement=connection.createStatement();
		System.out.println("Step 3");
		String sqlQuery=" insert into ajit values(108,'ganesh','60000')";
		// execute /insert
		int rowsAffected=statement.executeUpdate(sqlQuery);
		System.out.println("Rows affected"+rowsAffected);
		connection.close();
		
		
		

	}

}
