package com.tweet.user;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;




public class UserDao {
	public static boolean addUserToDb(User st) {
		boolean status=false;
		try {
			Connection con =ConnectionToDb.createConnection();
			String query= "insert into users(uname,password,email) values(?,?,?)";
			PreparedStatement ptstmt=con.prepareStatement(query);
			ptstmt.setString(1, st.getFirstName());
			ptstmt.setString(2, st.getPassword());
			ptstmt.setString(3, st.getEmail());
			ptstmt.executeUpdate();
			status=true;
		}
		catch(Exception e) {
			
		}
		return status;
	}
	public static boolean loginUser(String email,String pass ) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		boolean status=false;
		try {
			Connection con =ConnectionToDb.createConnection();
			String query1= "select * from users";
			Statement stmt=con.createStatement();
			
			
			ResultSet rs =stmt.executeQuery(query1);
			while(rs.next()) {
				String uname=rs.getString(1);
				String name = rs.getString(2);
				String pass1=rs.getString(3);
				
				if(name.equals(email)&&pass.equals(pass)) {
				System.out.println("Hi "+uname);
				
				System.out.println("press 1 to post tweet");
				
				System.out.println("press 2 to view my tweets");
				System.out.println("press 3 to view all tweets");
				System.out.println("press 4 to view all users");
				System.out.println("press 5 to reset password");
				System.out.println("press 6 logout of application");
				Integer choice1=Integer.parseInt(br.readLine());
				if(choice1==1) {
					System.out.println("enter tweet to post");
					String tweet=br.readLine();
					Tweet tw=new Tweet(uname,tweet);
					boolean st=TweetDao.addTweetToDb(tw);
				}
				}
				else {
					System.out.println("please enter valid details");
				}
			}
			
			status=true;
		}
		catch(Exception e) {
			
		}
		return status;
	}
	public static boolean forgotPassword(String email,String name ,String us) {
		boolean status=false;
		try {
			Connection con =ConnectionToDb.createConnection();
			String query1= "select * from users";
			Statement stmt=con.createStatement();
			
			
			ResultSet rs =stmt.executeQuery(query1);
			while(rs.next()) {
				String name1 = rs.getString(1);
				String email1 = rs.getString(2);
			if(email.equals(email1)&&name.equals(name1)) {
				Connection con1 =ConnectionToDb.createConnection();
				String query= "UPDATE users SET password = ?  WHERE email = ?";
						
				PreparedStatement ptstmt=con.prepareStatement(query);
				ptstmt.setString(1,us);
				ptstmt.setString(2, email);
				ptstmt.executeUpdate();
				
			}
			else {
				System.out.println("enter valid details");
			}
			status=true;
		}
		}
		catch(Exception e) {
			
		}
		return status;
	}
}
