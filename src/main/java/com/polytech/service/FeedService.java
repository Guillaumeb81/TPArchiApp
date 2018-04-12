package com.polytech.service;

import com.polytech.persistence.StoryRepository;

import java.util.List;

/**
 * Created by Guillaume Bardet on 10/04/2018.
 */
public class FeedService {
    private StoryRepository repository;

    public FeedService(StoryRepository repository) {
        this.repository = repository;
    }

    public List<Story> feed() {
        return repository.getStories();
    }
}
