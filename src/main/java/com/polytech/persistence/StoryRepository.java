package com.polytech.persistence;

import com.polytech.service.Story;

import java.util.List;

/**
 * Created by Guillaume Bardet on 10/04/2018.
 */
public interface StoryRepository {

    List<Story> getStories();

    void addStory(Story s);
}
