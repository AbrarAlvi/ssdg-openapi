package com.abrar.openapi.resources;

import com.abrar.openapi.entity.News;
import com.abrar.openapi.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {
    @Autowired
    private NewsService newsService;
    @RequestMapping(value = "/api/news/topstories", method = RequestMethod.GET)
    public @ResponseBody
    News getNews() throws Exception {
        return newsService.getTopStories();
    }
}
