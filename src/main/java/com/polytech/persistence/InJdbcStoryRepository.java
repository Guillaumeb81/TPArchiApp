package com.polytech.persistence;

import com.polytech.service.Story;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Guillaume Bardet on 10/04/2018.
 */
public class InJdbcStoryRepository implements StoryRepository{

    private Connection connection;
    private String CONNECT_URL;


    public InJdbcStoryRepository(Connection connection) throws SQLException {
        this.connection = connection;
    }



    public void addStory(Story content) {

        String query = "INSERT INTO STORY(CONTENT) VALUES('" + content.getContent() + "')";

        try {
            Statement state = null;
            state = connection.createStatement();
            state.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public List<Story> getStories() {
        String query = "SELECT * FROM STORY";
        List<Story> stories = new ArrayList<Story>();

        try {
            Statement state = null;
            state = connection.createStatement();
            ResultSet resultSet = state.executeQuery(query);

            while (resultSet.next()) {
                String content = resultSet.getString("CONTENT");
                stories.add(new Story(content));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return stories;
    }




}
