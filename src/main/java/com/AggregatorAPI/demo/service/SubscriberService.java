package com.AggregatorAPI.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.AggregatorAPI.demo.config.JWTConfig;
import com.AggregatorAPI.demo.entity.MemberModel;
import com.AggregatorAPI.demo.model.Member;
import com.AggregatorAPI.demo.repository.SubscriberRepository;

@Service
public class SubscriberService implements UserDetailsService{

    @Autowired
    private SubscriberRepository subscriberRepository;
    
    // public SubscriberService(SubscriberRepository subscriberRepository) {
    //     this.subscriberRepository = subscriberRepository;
    // }
    @Autowired
    private JWTConfig jwtConfig;

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

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // TODO Auto-generated method stub
        Member member = subscriberRepository.findByEmail(username);
        if(member == null){
            throw new UsernameNotFoundException("User not found");
        }
        return new User(member.getEmail(), member.getPassword(), true, true, true, true, new ArrayList<>());
    }

    public String signIn(String email, String password) {
        Member member = subscriberRepository.findByEmail(email);
        if(member == null){
            return "User not found";
        }
        if(passwordEncoder.matches(password, member.getPassword())){
            return jwtConfig.generateToken();
        }
        return "Invalid credentials";
    }


}
