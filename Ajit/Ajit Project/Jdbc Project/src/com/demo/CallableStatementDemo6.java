package com.demo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CallableStatementDemo6 {

	public static void main(String[] args) throws SQLException {
		Connection conc=Test.getConnection();
		CallableStatement cst=conc.prepareCall("call insert_demo(?,?,?)");
		cst.setString(1, "nava");
		cst.setString(2, "punjab");
		cst.setInt(3, 35);
		cst.executeUpdate();
		System.out.println("Record inserted successfully");
	}

}
