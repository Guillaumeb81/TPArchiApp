package service;

/**
 * Created by Guillaume Bardet on 10/04/2018.
 */
public class Story {


    private String message;

    public Story(String s) {
        message = s;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Story story = (Story) o;

        return message != null ? message.equals(story.message) : story.message == null;

    }

    @Override
    public int hashCode() {
        return message != null ? message.hashCode() : 0;
    }
}
