package com.tweetapp.tweets.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Tweet {

	@Id
	private String id;

	private String firstName;

	private String lastName;

	private String email;

	private String username;

	private Gender gender;

	private TweetsByUser tweets;

	public Tweet() {

	}

	public Tweet(String firstName, String lastName, String email, String username, Gender gender, TweetsByUser tweets) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.username = username;
		this.gender = gender;
		this.tweets = tweets;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public TweetsByUser getTweets() {
		return tweets;
	}

	public void setTweets(TweetsByUser tweets) {
		this.tweets = tweets;
	}

	@Override
	public String toString() {
		return "Tweet [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", username=" + username + ", gender=" + gender + ", tweets=" + tweets + "]";
	}

	
	
}
