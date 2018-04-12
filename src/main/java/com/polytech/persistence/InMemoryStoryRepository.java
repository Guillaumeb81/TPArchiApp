package com.polytech.persistence;

import com.polytech.service.Story;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Guillaume Bardet on 10/04/2018.
 */
public class InMemoryStoryRepository implements StoryRepository{
    private static List<Story> listeStories = new ArrayList<Story>();

    public List<Story> getStories() {
        return listeStories;
    }

    public void addStory(Story s) {
        listeStories.add(s);
    }
}
