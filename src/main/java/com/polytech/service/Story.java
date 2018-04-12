package com.polytech.service;

/**
 * Created by Guillaume Bardet on 10/04/2018.
 */
public class Story {

    public Story() {
    }

    private String content;

    public Story(String s) {
        content = s;
    }

    public String getContent() {
        return content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Story story = (Story) o;

        return content != null ? content.equals(story.content) : story.content == null;

    }

    @Override
    public int hashCode() {
        return content != null ? content.hashCode() : 0;
    }


}
