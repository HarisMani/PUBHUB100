package com.bookappcore.book.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connectionutil {

	public static Connection getConnection() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3308/abi";
		Connection con = DriverManager.getConnection(url, "root", "root");
		System.out.println("connected sucessfully...");
		return con;
	}
}
 