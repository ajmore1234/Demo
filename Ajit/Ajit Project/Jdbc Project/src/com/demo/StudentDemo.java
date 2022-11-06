package com.demo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class StudentDemo {

	public static void main(String[] args)  {
		Connection cnc = Demo.getConnection();
		System.out.println("step3");

		String sql = " select * from studentquiz ";
		// HashSet< String> set = new HashSet<>();

		PreparedStatement cst= null;
		ResultSet rs= null;
		try {
			cst = cnc.prepareStatement(sql);
			rs = cst.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		Scanner sc = new Scanner(System.in);
		int countCorrect = 0;
		int countWrong = 0;

		try {
			while (rs.next()) {

				// System.out.println("welcome to quiz");

				System.out.println(rs.getString("Question_Number") + rs.getString("Questions"));
				System.out.println(rs.getString("Option1") + " " + rs.getString("Option2"));
				System.out.println(rs.getString("Option3") + " " + rs.getString("Option4"));

				System.out.println("select option");
				// String option1=sc.nextLine();
				String option = sc.nextLine();
				String ans = rs.getString("Correct_Ans");

				if (ans.equals(option)) {
					countCorrect++;
					// System.out.println("your ans is right");

				}

				else {
					countWrong++;

				}

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("correct answers are " + countCorrect);
		// System.out.println("your answer is wrong");
		System.out.println("Wrong answers are " + countWrong);
		int marks = countCorrect;
		System.out.println("total Marks obtained " + marks);

		if (marks > 8 && marks <= 10) {
			System.out.println("your grade is A");
		}
		if (marks >= 6 && marks <= 8) {
			System.out.println("your grade is B");
		}
		if (marks == 5) {
			System.out.println("your grade is C");
		}
		if (marks < 5) {
			System.out.println("your are fail ");
		}
		//Scanner sc1= new Scanner(System.in);
		System.out.println("Enter your Id ");
		int stud_id	=sc.nextInt();
		System.out.println("Enter your Name");
		String stud_name =sc.next();
		System.out.println("congratulation you completed quiz");
		
		String sqlQuery = "insert into studentdetails ( stud_id,stud_name,marks)values(?,?,?)";
		// HashSet< String> set = new HashSet<>();

		PreparedStatement csst;
		try {
			csst = cnc.prepareStatement(sqlQuery);
			csst.setInt(1,stud_id);
			csst.setString(2,stud_name);
			csst.setInt(3,marks);
			
			int i= csst.executeUpdate();
			//System.out.println("rows affected"+i);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
	}

}
