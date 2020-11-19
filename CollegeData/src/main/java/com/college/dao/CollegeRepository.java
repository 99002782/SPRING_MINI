package com.college.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.college.model.College;

@Repository
public interface CollegeRepository extends MongoRepository<College,Integer>{
College findByCode(Integer code);
List<College> findByAddressState(String state);
List<College> findByAddressCity(String city);
List<College> findByName(String name);

}
