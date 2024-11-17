package com.AggregatorAPI.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Preference {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.AUTO)
    private int userId;
    private String language;
    private String category;

    @OneToOne
    private Member member;

    public Preference() {
        this.language = "English";
        this.category = "General";
    }

    public Preference(String language, String category) {
        this.language = language;
        this.category = category;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
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
