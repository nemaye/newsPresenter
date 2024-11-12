package com.AggregatorAPI.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/news")
public class NewsController {
    
    @GetMapping()
    public String getMethodName() {
        return new String("hello32");
    }
    
}
