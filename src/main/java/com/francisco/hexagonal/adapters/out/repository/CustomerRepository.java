package com.francisco.hexagonal.adapters.out.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.francisco.hexagonal.adapters.out.repository.entity.CustomerEntity;

public interface CustomerRepository extends MongoRepository<CustomerEntity, String>{

}
