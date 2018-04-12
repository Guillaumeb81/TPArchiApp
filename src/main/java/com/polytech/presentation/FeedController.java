package com.polytech.presentation;

import com.polytech.service.FeedService;
import com.polytech.service.PublicationService;
import com.polytech.service.Story;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Guillaume Bardet on 10/04/2018.
 */

@Controller
public class FeedController {
    private PublicationService sender;
    private FeedService poster;

    public FeedController(PublicationService sender, FeedService poster) {
        this.sender = sender;
        this.poster = poster;
    }

    @RequestMapping(value = "/share", method = RequestMethod.POST)
    public String post(String content) {
        sender.post(new Story(content));
        return "redirect:/feed";
    }

    @RequestMapping(value = "/feed", method = RequestMethod.GET)
    public String feed(Model model) { // l'appli se charge d'appeler avec le modele en param ,pas a le créer
        List<Story> stories = poster.feed();
        model.addAttribute("stories", stories); // 1ere var est la var du coté html
        return "feed"; // permet d'afficher feed.html
    }
}
