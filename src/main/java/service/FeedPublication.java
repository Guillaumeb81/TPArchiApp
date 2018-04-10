package service;

import com.sun.jmx.mbeanserver.Repository;
import persistence.StoryRepository;

import java.util.List;

/**
 * Created by Guillaume Bardet on 10/04/2018.
 */
public class FeedPublication {
    private StoryRepository repository = new StoryRepository();

    public List<Story> feed() {
        return repository.getStories();
    }
}
