package com.polytech.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import com.polytech.persistence.InJdbcStoryRepository;
import com.polytech.persistence.StoryRepository;
import com.polytech.presentation.FeedController;
import com.polytech.service.FeedService;
import com.polytech.service.PublicationService;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Created by Guillaume Bardet on 10/04/2018.
 */
@Configuration
public class AppConfig {

    @Bean
    public StoryRepository inJdbcStoryRepository(DataSource dataSource) throws SQLException {
        return new InJdbcStoryRepository(dataSource.getConnection());
    }

    @Bean
    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder()
                .addScript("db.sql")
                .build();
    }

    /*
    @Bean
    public StoryRepository storyRepository() {
        return new InMemoryStoryRepository();
    }
    */

    @Bean
    public FeedService feedPublication(StoryRepository storyRepository) {
        return new FeedService(storyRepository);
    }

    @Bean
    public PublicationService feedService(StoryRepository storyRepository) {
        return new PublicationService(storyRepository);
    }

    @Bean
    public FeedController feedController(PublicationService publicationService, FeedService feedService) {
        return new FeedController(publicationService, feedService);
    }

}
