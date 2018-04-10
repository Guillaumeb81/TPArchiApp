package service;

import persistence.StoryRepository;

/**
 * Created by Guillaume Bardet on 10/04/2018.
 */
public class FeedService {
    private StoryRepository repository;

    public FeedService(StoryRepository repository) {
        this.repository = repository;
    }

    public void post(Story s) {
        repository.addStory(s);
    }
}
