package com.demo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo5 {

	public static void main(String[] args) throws SQLException {
	Connection conc	=Test.getConnection();
	CallableStatement cst=conc.prepareCall("call demo_getDetails()");
	ResultSet rs=cst.executeQuery();
	while(rs.next()) {
		System.out.println(rs.getString(1));
		System.out.println(rs.getString(2));
	}
	if(cst.getMoreResults()) {
		ResultSet rs2 = cst.getResultSet();
		
		while(rs2.next()) {
			System.out.println(rs2.getString(1));
			System.out.println(rs2.getString(2));
			
		}
	}
	}

}
