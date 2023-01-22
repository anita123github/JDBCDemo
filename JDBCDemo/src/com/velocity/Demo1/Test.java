package com.velocity.Demo1;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		try {
			String sql = "insert into user (lastName,firstName,address,city,salary)"
					+ "values('pawar','ram','sangavi','pune',5000)";
			//Step1:load the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			//step2:establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "root");
			//create the statement
			Statement statement = con.createStatement();
			//submit the query
			 statement.execute(sql);
			 System.out.println("Insertion successfully...");
			 //resources closed
			 con.close();
			 statement.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
