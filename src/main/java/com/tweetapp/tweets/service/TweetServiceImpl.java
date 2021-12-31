package com.tweetapp.tweets.service;

import java.util.List;
import java.util.Optional;

import com.tweetapp.tweets.model.Tweet;
import com.tweetapp.tweets.repository.TweetRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TweetServiceImpl implements TweetService {

    private TweetRepository tweetRepository;

    @Autowired
    public TweetServiceImpl(TweetRepository theTweetRepository) {
        tweetRepository = theTweetRepository;
    }

    @Override
    public List<Tweet> findAll() {
        return tweetRepository.findAll();
    }

    @Override
    public Optional<Tweet> findById(String id) {
        //return tweetRepository.findByTweetid(id);
         return tweetRepository.findById(id);
    }

    @Override
    public void create(Tweet tweet) {
         tweetRepository.save(tweet);
    }

    @Override
    public void deleteById(String id) {
        tweetRepository.deleteById(id);

    }

}
