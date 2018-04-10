package service;

import persistence.StoryRepository;

/**
 * Created by Guillaume Bardet on 10/04/2018.
 */
public class FeedService {
    private StoryRepository repository = new StoryRepository();

    public void post(Story s) {
        repository.addStory(s);
    }
}
