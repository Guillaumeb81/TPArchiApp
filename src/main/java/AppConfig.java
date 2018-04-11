import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import persistence.InJdbcStoryRepository;
import persistence.InMemoryStoryRepository;
import persistence.StoryRepository;
import presentation.FeedController;
import service.FeedPublication;
import service.FeedService;

import javax.management.MXBean;
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
    public FeedPublication feedPublication(StoryRepository storyRepository) {
        return new FeedPublication(storyRepository);
    }

    @Bean
    public FeedService feedService(StoryRepository storyRepository) {
        return new FeedService(storyRepository);
    }

    @Bean
    public FeedController feedController(FeedService feedService, FeedPublication feedPublication) {
        return new FeedController(feedService,feedPublication);
    }

}
