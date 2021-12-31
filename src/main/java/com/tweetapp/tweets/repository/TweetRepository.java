package com.tweetapp.tweets.repository;


import com.tweetapp.tweets.model.Tweet;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TweetRepository  extends MongoRepository<Tweet, String>{

    
    
}
