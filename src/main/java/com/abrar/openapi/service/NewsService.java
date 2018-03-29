package com.abrar.openapi.service;

import com.abrar.openapi.entity.News;
import com.abrar.openapi.entity.Results;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class NewsService {

    RestTemplate restTemplate = new RestTemplate();
    private final String baseUrl= "https://api.nytimes.com/svc/topstories/v2/home.json?api-key=a6318ddb4c4c4be7b6b5f5190ef6dbcf";
    public News getTopStories() {

        MappingJackson2HttpMessageConverter jsonConverter = new MappingJackson2HttpMessageConverter();
        jsonConverter.setSupportedMediaTypes(Arrays.asList(new MediaType("text", "json", MappingJackson2HttpMessageConverter.DEFAULT_CHARSET)));
        restTemplate.getMessageConverters().add(jsonConverter);
        News topStories = restTemplate.getForEntity(baseUrl, News.class).getBody();

        // Need to change it later :)
        List<Results> list = topStories.getResults();
        for(Results res : list){
            topStories.setTitle(res.getTitle());
            topStories.setSection(res.getSection());
        }
        return topStories;
    }
}
