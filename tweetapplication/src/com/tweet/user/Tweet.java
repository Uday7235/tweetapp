package com.tweet.user;

public class Tweet {
private String username;
private String tweet;
public Tweet(String username, String tweet) {
	super();
	this.username = username;
	this.tweet = tweet;
}

public Tweet() {
	super();
}

public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getTweet() {
	return tweet;
}
public void setTweet(String tweet) {
	this.tweet = tweet;
}
@Override
public String toString() {
	return "Tweet [username=" + username + ", tweet=" + tweet + "]";
}

}
