package com.AggregatorAPI.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Preference {
    @Id
    private String language;
    private String category;

    public Preference() {
        this.language = "English";
        this.category = "General";
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
