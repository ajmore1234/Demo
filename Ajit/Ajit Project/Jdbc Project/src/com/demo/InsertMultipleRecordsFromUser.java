package com.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertMultipleRecordsFromUser {
	public static void insert(String id,String name,String city) throws SQLException {
		Connection con =Test.getConnection();
		String sqlQuery="insert into company (id,name,city)values(?,?,?)";
		PreparedStatement pst=con.prepareStatement(sqlQuery);
	
		pst.setString(1, id);
		pst.setString(2, name);
		pst.setString(3, city);
		int rowsAffected=pst.executeUpdate();
		System.out.println("record insrted"+rowsAffected);
	}

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=3;i++) {
			System.out.println("enter id");
			String id =sc.nextLine();
			System.out.println("enter name");
			String name =sc.nextLine();
			System.out.println("enter city");
			String city=sc.nextLine();
			insert(id,name,city);
		}
		

	}

}
