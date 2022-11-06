 package com.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class RetriveRecords {

	public static void main(String[] args) throws SQLException {
	Connection con	=Test.getConnection();
	   String SqlQuery="select* from ajit where id=?";
	//   String SqlQuery="select* from ajit";
	PreparedStatement pst= con.prepareStatement(SqlQuery);
	Scanner sc= new Scanner(System.in);
	System.out.println("enter id");
	String id=sc.nextLine();
	pst.setString(1, id);
   ResultSet rs	=pst.executeQuery(); // used with select
   while(rs.next()) {
	   System.out.println("id>>"+rs.getInt(1));
	   System.out.println("name>>"+rs.getString(2));
	   System.out.println("salary"+rs.getString(3));
   }

	}

}
