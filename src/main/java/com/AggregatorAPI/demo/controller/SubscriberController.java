package com.AggregatorAPI.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AggregatorAPI.demo.entity.MemberModel;
import com.AggregatorAPI.demo.model.Member;
import com.AggregatorAPI.demo.service.SubscriberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/subscriber")
public class SubscriberController {

    @Autowired
    private SubscriberService subscriberService;
    
    // public SubscriberController(SubscriberService subscriberService){
    //     this.subscriberService = subscriberService;
    // }

    @PostMapping("/register")
    public Member registerUser(@RequestBody MemberModel memberModel) {
        System.out.println("hello");
        return subscriberService.addSubscriber(memberModel);
    }

    @PostMapping("/signin")
    public String signIn(@RequestBody MemberModel memberModel) {
        System.out.println("hehe");
        return subscriberService.signIn(memberModel.getEmail(), memberModel.getPassword());
    }
    
}
