package com.tweetapp.tweets.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Tweet {

	@Id
	private String id;

	private String firstName;

	private String lastName;

	private String email;

	public Tweet() {
		
	}
	
	public Tweet(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Tweet [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
	 
	

}
