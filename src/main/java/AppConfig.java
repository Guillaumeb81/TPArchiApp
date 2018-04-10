import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import persistence.InMemoryStoryRepository;
import persistence.StoryRepository;
import presentation.FeedController;
import service.FeedPublication;
import service.FeedService;

import javax.management.MXBean;

/**
 * Created by Guillaume Bardet on 10/04/2018.
 */
@Configuration
public class AppConfig {

    @Bean
    public StoryRepository storyRepository() {
        return new InMemoryStoryRepository();
    }

    @Bean
    public FeedPublication feedPublication() {
        return new FeedPublication(storyRepository());
    }

    @Bean
    public FeedService feedService() {
        return new FeedService(storyRepository());
    }

    @Bean
    public FeedController feedController() {
        return new FeedController(feedService(),feedPublication());
    }
}
