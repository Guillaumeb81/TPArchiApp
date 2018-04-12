import com.polytech.config.AppConfig;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.polytech.presentation.FeedController;
import com.polytech.service.Story;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Guillaume Bardet on 10/04/2018.
 */
public class PresentationTest {
    private FeedController controller;

    @Before
    @Ignore
    public void setUp() {
        AnnotationConfigApplicationContext config = new AnnotationConfigApplicationContext(AppConfig.class);
        controller = config.getBean(FeedController.class);
    }

    @Test
    @Ignore
    public void should_post_story() {

        // GIVEN
        //Story s = new Story("la cgt fais une greve pour changer");

        // WHEN
       // controller.post(s);

        // THEN
       // List<Story> mesStories = controller.feed();
       // Assert.assertEquals(Arrays.asList(new Story("la cgt fais une greve pour changer")), mesStories);
    }
}
