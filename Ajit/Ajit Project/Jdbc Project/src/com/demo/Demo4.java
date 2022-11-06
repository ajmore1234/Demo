package com.demo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo4 {

	public static void main(String[] args) throws SQLException {
	Connection con	    =Test.getConnection();
	CallableStatement cst  = con.prepareCall("call fetch_cityName()");
	ResultSet rs=cst.executeQuery();
	while(rs.next()) {
		System.out.println(rs.getString(1));
		System.out.println(rs.getString(2));
	}
	

	}

}
