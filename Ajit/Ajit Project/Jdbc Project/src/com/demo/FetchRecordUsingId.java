package com.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class FetchRecordUsingId {

	public static void main(String[] args) throws SQLException {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter id");
	int Stud_id=sc.nextInt();
	
	
		Connection cnc	= Demo.getConnection();
		String sql ="select*from studentdetails where stud_id =?";
		PreparedStatement pst = cnc.prepareStatement(sql);
		pst.setInt(1, Stud_id);
ResultSet rs	=	pst.executeQuery();
while(rs.next()) {
	System.out.println("Student id is >>"+rs.getInt(1));
	System.out.println("Student name is >> "+rs.getString(2));
	System.out.println("Student marks are >>"+rs.getInt(3));
}
		
	
	}

}
