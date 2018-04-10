package presentation;

import service.FeedPublication;
import service.FeedService;
import service.Story;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Guillaume Bardet on 10/04/2018.
 */
public class FeedController {
    private FeedService sender = new FeedService();
    private FeedPublication poster = new FeedPublication();

    public void post(Story s) {
        sender.post(s);
    }

    public List<Story> feed() {
        return poster.feed();
    }
}
