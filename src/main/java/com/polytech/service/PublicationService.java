package com.polytech.service;

import com.polytech.persistence.StoryRepository;

/**
 * Created by Guillaume Bardet on 10/04/2018.
 */
public class PublicationService {
    private StoryRepository repository;

    public PublicationService(StoryRepository repository) {
        this.repository = repository;
    }

    public void post(Story s) {
        repository.addStory(s);
    }
}
