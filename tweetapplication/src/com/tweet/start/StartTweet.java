package com.tweet.start;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import com.tweet.user.User;
import com.tweet.user.UserDao;

public class StartTweet {

	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to TweetApp");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
		System.out.println("press 1 to Register to TweetApp");
		System.out.println("press 2 to Login to TweetApp");
		System.out.println("press 3 forgot password");
		System.out.println("press 4 to exit app");
		Integer choice=Integer.parseInt(br.readLine());
		if(choice==1) {
			//add a student
			System.out.println("enter first name");
			String name=br.readLine();
			System.out.println("enter email id");
			String  email=br.readLine();
			System.out.println("enter password");
			String password=br.readLine();
			User st=new User(name,email,password);
			System.out.println(st);
			boolean answer=UserDao.addUserToDb(st);
			if(answer) {
				System.out.println("User registered successfully");
			}
			else {
				System.out.println("user not register ");
			}
		
	}
		else if(choice==2) {
			//delete a student
			System.out.println("enter email id");
			String  email=br.readLine();
			System.out.println("enter password");
			String password=br.readLine();
			boolean answer=UserDao.loginUser(email,password);
			if(answer) {
				System.out.println("user logged in successfully");
				
			}
			else {
				System.out.println("user not logged in ");
			}
			
			
			
    	   
		}
		else if(choice==3) {
			System.out.println("enter email id");
			String  email=br.readLine();
			System.out.println("enter the first name");
			String  uname=br.readLine();
			System.out.println("enter the new password");
			String  pass2=br.readLine();
//			User us=new User();
//			us.setPassword(pass2);
			boolean answer=UserDao.forgotPassword(email,uname,pass2);
			if(answer) {
				System.out.println(" successfully updated new password");
			}
			else {
				System.out.println("password not updated successfully ");
			}
    	   
        }
		else if(choice==4) {
	    //to exit the application
    	   System.exit(0);
        }
//		else {
//		   
//		}
		System.out.println("thanks for using the TweetApp");

	}
	}
}
