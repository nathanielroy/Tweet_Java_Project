package com.tweetapp.tweets.service;

import java.util.List;
import java.util.Optional;

import com.tweetapp.tweets.model.Tweet;

public interface TweetService {

    public List<Tweet> findAll();

    public Optional<Tweet> findById(String id);

    public void create(Tweet tweet);

    public void deleteById(String id);

    // public List<Tweet> findAllByUserID(String id);

}
