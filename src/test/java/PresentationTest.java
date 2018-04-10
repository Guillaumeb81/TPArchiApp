import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import presentation.FeedController;
import service.Story;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Guillaume Bardet on 10/04/2018.
 */
public class PresentationTest {

    @Before
    public void setUp() {

    }

    @Test
    public void should_post_story() {

        // GIVEN
        Story s = new Story("la cgt fais une greve pour changer");
        FeedController fc = new FeedController();

        // WHEN
        fc.post(s);

        // THEN
        List<Story> mesStories = fc.feed();
        Assert.assertEquals(Arrays.asList(new Story("la cgt fais une greve pour changer")), mesStories);
    }
}
