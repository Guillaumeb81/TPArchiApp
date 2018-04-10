package presentation;

import service.FeedPublication;
import service.FeedService;
import service.Story;
import java.util.List;

/**
 * Created by Guillaume Bardet on 10/04/2018.
 */
public class FeedController {
    private FeedService sender;
    private FeedPublication poster;

    public FeedController(FeedService sender, FeedPublication poster) {
        this.sender = sender;
        this.poster = poster;
    }

    public void post(Story s) {
        sender.post(s);
    }

    public List<Story> feed() {
        return poster.feed();
    }
}
