package com.tweetapp.tweets.controller;

import java.util.List;

import com.tweetapp.tweets.model.Tweet;
import com.tweetapp.tweets.service.TweetService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tweets")
public class TweetController {

    private TweetService tweetService;

    @Autowired
    public TweetController(TweetService theTweetService) {
        tweetService = theTweetService;
    }

    @GetMapping("/tweet")
    public List<Tweet> findAll() {
        System.out.println("Requested to get all Tweets");
        return tweetService.findAll();
    }

    @PostMapping("/tweet")
    public Tweet addTweet(@RequestBody Tweet tweet) {
        System.out.println("fIRST:" +tweet);
        tweetService.create(tweet);
        System.out.println("Saved the new Tweet " + tweet);
        return tweet;
    }

    @PutMapping("/tweet/{id}")
    public Tweet updateTweet(@RequestBody Tweet theTweet) {

        tweetService.create(theTweet);

        System.out.println("Updated the existing Tweet " + theTweet);
        return theTweet;
    }

    // @DeleteMapping("/tweet/{id}")
    // public String Tweet(@PathVariable String id) {

    //     Tweet tempTweet = tweetService.findById(id);

    //     // throw exception if null

    //     if (tempTweet == null) {
    //         throw new RuntimeException("Tweet id not found - " + id);
    //     }

    //     tweetService.deleteById(id);

    //     System.out.println("Deleted Tweet Details for ID " + id);
    //     return "Deleted Tweet Id - " + id;
    // }

    // @GetMapping("/search/user/{userID}")
    // public List<Ticket> getUserID(@PathVariable String userID) {
    // List<Ticket> theTweet = tweetService.findAllByUserID(userID);

    // return theTweet;
    // }
}
