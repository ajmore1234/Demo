package com.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecord {

	public static void main(String[] args) throws SQLException {
	Connection con=	Test.getConnection();
	System.out.println("Step 2");

	String sqlQuery="delete from student where id=?";
	PreparedStatement pst=con.prepareStatement(sqlQuery);
	pst.setInt(1, 103);
	System.out.println("Step 3");

	// execute /insert
	int rowsAffected=pst.executeUpdate();
	System.out.println("Rows affected"+rowsAffected);
	con.close();
	}

}
