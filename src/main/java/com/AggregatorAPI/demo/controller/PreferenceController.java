package com.AggregatorAPI.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AggregatorAPI.demo.model.Preference;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
@RequestMapping("/api/preference")
public class PreferenceController {
    
    Preference preference = new Preference();

    @GetMapping()
    public String getMethodName() {
        return "Preference "+ preference.getLanguage() + " " + preference.getCategory();    
    }


    @PostMapping()
    public String getMethodName2() {
        return "Preference "+ preference.getLanguage() + " " + preference.getCategory();    
    }
    
}
