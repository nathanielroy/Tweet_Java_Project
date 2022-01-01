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

	
}
