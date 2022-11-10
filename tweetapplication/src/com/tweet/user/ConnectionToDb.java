package com.tweet.user;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionToDb {
	static Connection con;
	public static Connection createConnection(){
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String user="root";
		String password="pass@word1";
		String url="jdbc:mysql://localhost:3306/tweetapplication";
		con=DriverManager.getConnection(url,user,password);
		
	}catch(Exception e) {
		e.printStackTrace();
	}
		return con;
	}
}
