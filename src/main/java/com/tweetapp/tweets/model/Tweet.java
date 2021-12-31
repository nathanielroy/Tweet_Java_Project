package com.tweetapp.tweets.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Tweet {
	
	@Id
	private String id;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	 

}
