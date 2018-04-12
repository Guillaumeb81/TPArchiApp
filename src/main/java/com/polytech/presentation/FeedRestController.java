package com.polytech.presentation;

import com.polytech.service.FeedService;
import com.polytech.service.PublicationService;
import com.polytech.service.Story;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Guillaume Bardet on 11/04/2018.
 */

@RestController
public class FeedRestController {
// pareil que feedcontroller mais retourne un json et pas une string

    private FeedService feedService;
    private PublicationService publicationService;

    public FeedRestController(FeedService feedService,PublicationService publicationService) {
        this.feedService = feedService;
        this.publicationService = publicationService;
    }

    @RequestMapping(value = "/api/feed",method = RequestMethod.GET)
    public List<Story> stories() {
        List<Story> stories = feedService.feed();
        return stories;
    }

    @RequestMapping(value = "api/feed", method = RequestMethod.POST)
    public Story post(@RequestBody String content) {
        Story s = new Story(content);
        publicationService.post(s);
        return s;
    }
}
