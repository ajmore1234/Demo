package com.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RetrieveInfo {
	
 public static void main(String[] args) throws SQLException {
	Connection conc	=Test.getConnection();
	String sqlQuery="select*from company ";
	PreparedStatement pst=conc.prepareStatement(sqlQuery);
	//pst.setString(1, "15");
	ResultSet rs=pst.executeQuery();
	while(rs.next()) {
		System.out.println("id>>"+rs.getString(1));
		System.out.println("name>>"+rs.getString(2));
		System.out.println("city>>"+rs.getString(3));
		
	}
		
		

	}

}
