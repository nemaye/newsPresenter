package com.AggregatorAPI.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AggregatorAPI.demo.model.Preference;
import com.AggregatorAPI.demo.service.PreferenceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.security.core.Authentication;



@RestController
@RequestMapping("/api/preference")
public class PreferenceController {
    
    Preference preference = new Preference();

    //4ffa5507860c4182988e437549f8b6f3

    @Autowired
    PreferenceService preferenceService;

    @GetMapping()
    public String getMethodName() {
        return "Preference "+ preference.getLanguage() + " " + preference.getCategory();    
    }


    @PostMapping()
    public String getMethodName2() {
        return "Preference "+ preference.getLanguage() + " " + preference.getCategory();    
    }

    @PutMapping("/{id}")
    public String setUserPreference(@PathVariable int id, @RequestBody Preference preference, Authentication authentication) {
        //TODO: process PUT request
        preferenceService.setUserPreference(id, preference, authentication);
        return preference.getLanguage() + " " + preference.getCategory() + " " + authentication.getName();
    }
    
}
