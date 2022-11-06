package com.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FetchRecordsUsingId {

	public static void main(String[] args) throws SQLException {
		
		
			Connection cn =Demo.getConnection();
			String sql  ="select*from studentdetails order by marks desc";
			
			PreparedStatement prs=cn.prepareStatement(sql);
			ResultSet rs=prs.executeQuery();
			System.out.println("Student details based on marks obtained ");
			System.out.println(" ");
			while(rs.next()) {
			System.out.print("Student Id >>"+rs.getInt(1)+", ");
			System.out.print("  Student Name>>"+rs.getString(2)+" ,");
			System.out.println("  marks obtained out of 10 is>>"+rs.getInt(3));
			
			}
		} 

	}


