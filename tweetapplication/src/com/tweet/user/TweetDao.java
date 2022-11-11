package com.tweet.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class TweetDao {
	public static boolean addTweetToDb(Tweet st) {
		boolean status=false;
		try {
			Connection con =ConnectionToDb.createConnection();
			String query= "insert into tweet(uname,tweetinfo) values(?,?)";
			PreparedStatement ptstmt=con.prepareStatement(query);
			ptstmt.setString(1, st.getUsername());
			ptstmt.setString(2, st.getTweet());
			
			ptstmt.executeUpdate();
			status=true;
		}
		catch(Exception e) {
			
		}
		return status;
	}
	
	public static boolean viewMyTweet(String uname) {
		boolean status=false;
		try {
			Connection con =ConnectionToDb.createConnection();
			String query= "select * from tweet" ;
		     Statement stmt=con.createStatement();
			
			ResultSet rs =stmt.executeQuery(query);
			System.out.println("my tweets:");
			while(rs.next()) {
			
			
			String name = rs.getString(1);
			String name2=rs.getString(2);
			
			if(name.equals(uname)) {
				
				
				System.out.println(name2);	
			}
//			else {
//				System.out.println("tweets not available");
//			}
			
			
//			if(uname1.equals(uname)) {
//				
//			}
			
			}
			
			status=true;
		}
		catch(Exception e) {
			
		}
		return status;
	}
	public static boolean viewAllTweets() {
		boolean status=false;
		try {
			Connection con =ConnectionToDb.createConnection();
			String query= "select tweetinfo from tweet" ;
		     Statement stmt=con.createStatement();
			
			ResultSet rs =stmt.executeQuery(query);
			System.out.println("my tweets:");
			while(rs.next()) {
			
			
			String name = rs.getString(1);
			System.out.println(name);
			
			
			
//			if(uname1.equals(uname)) {
//				
//			}
			
			}
			
			status=true;
		}
		catch(Exception e) {
			
		}
		return status;
	}
	
	public static boolean viewAllUsers() {
		boolean status=false;
		try {
			Connection con =ConnectionToDb.createConnection();
			String query= "select uname from users" ;
		     Statement stmt=con.createStatement();
			
			ResultSet rs =stmt.executeQuery(query);
			System.out.println("users:");
			while(rs.next()) {
			
			
			String name = rs.getString(1);
			System.out.println(name);
			
			
			
//			if(uname1.equals(uname)) {
//				
//			}
			
			}
			
			status=true;
		}
		catch(Exception e) {
			
		}
		return status;
	}
	
	public static boolean resetPassword(String pass1,String pass2,String email) {
		boolean status=false;
		try {
			Connection con =ConnectionToDb.createConnection();
			String query= "select email,password from users" ;
		     Statement stmt=con.createStatement();
			
			ResultSet rs =stmt.executeQuery(query);
			System.out.println("resetting password");
			while(rs.next()) {
			
			
			String email1 = rs.getString(1);
			String pass3=rs.getString(2);
			if(email1.equals(email)&&pass3.equals(pass1)) {
				Connection con1 =ConnectionToDb.createConnection();
				String query3= "UPDATE users SET password = ?  WHERE email = ?";
						
				PreparedStatement ptstmt=con.prepareStatement(query3);
				ptstmt.setString(1,pass2);
				ptstmt.setString(2, email);
				ptstmt.executeUpdate();
			}
			
		
			
			}
			
			status=true;
		}
		catch(Exception e) {
			
		}
		return status;
	}
}
