package com.AggregatorAPI.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.AggregatorAPI.demo.entity.MemberModel;
import com.AggregatorAPI.demo.model.Member;
import com.AggregatorAPI.demo.repository.SubscriberRepository;

@Service
public class SubscriberService {

    @Autowired
    private SubscriberRepository subscriberRepository;
    
    // public SubscriberService(SubscriberRepository subscriberRepository) {
    //     this.subscriberRepository = subscriberRepository;
    // }

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Member addSubscriber(MemberModel memberModel){
        Member member = new Member();
        member.setEmail(memberModel.getEmail());
        member.setName(memberModel.getName());
        member.setPassword(passwordEncoder.encode(memberModel.getPassword()));
        member.setIsSubscribed(false);
        subscriberRepository.save(member);
        return subscriberRepository.save(member);
    }
}
