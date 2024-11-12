package com.AggregatorAPI.demo.repository;

import com.AggregatorAPI.demo.model.Member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriberRepository extends JpaRepository<Member, Integer> {


}
