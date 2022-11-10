package com.tweet.user;

import java.sql.Connection;
import java.sql.PreparedStatement;

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
}
