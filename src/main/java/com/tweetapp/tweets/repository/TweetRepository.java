package com.tweetapp.tweets.repository;

import com.tweetapp.tweets.model.Tweet;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TweetRepository extends MongoRepository<Tweet, String> {
    //public Tweet findByTweetid(String id);

}
