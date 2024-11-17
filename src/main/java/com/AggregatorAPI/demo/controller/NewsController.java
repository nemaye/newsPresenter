package com.AggregatorAPI.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.AggregatorAPI.demo.model.Preference;
import com.AggregatorAPI.demo.repository.PreferenceRepository;
import com.AggregatorAPI.demo.service.NewsService;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping()
public class NewsController {
    
    // @Autowired
    // NewsService newsService;
    
    @Autowired
    PreferenceRepository preferenceRepository;
    
    @Value("https://newsapi.org/v2/top-headlines")
    private String apiUri;

    @Value("4ffa5507860c4182988e437549f8b6f3")
    private String apiKey;
    
    @SuppressWarnings("null")
    @GetMapping("/api/news/{id}")
    public Map<String,Object> news(@PathVariable int id) {
        RestTemplate restTemplate = new RestTemplate();

        Optional<Preference> preference = preferenceRepository.findByMemberId(id);

        String country = "us";
        if(preference.isPresent()){
            // preference.get().getCategory();
            country = preference.get().getLanguage();
        }

        String url = apiUri + "?country=" + country + "&apiKey=" + apiKey;
        System.out.println("url is: "+url);
        @SuppressWarnings("unchecked")
        Map<String, Object> response = restTemplate.getForObject(url, Map.class);
        return response;

    }
    
}
