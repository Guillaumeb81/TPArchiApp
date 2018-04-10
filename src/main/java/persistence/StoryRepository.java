package persistence;

import service.Story;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Guillaume Bardet on 10/04/2018.
 */
public interface StoryRepository {

    public List<Story> getStories();

    public void addStory(Story s);
}
