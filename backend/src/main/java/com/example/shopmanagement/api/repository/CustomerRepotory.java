package com.example.shopmanagement.api.repository;

import com.example.shopmanagement.api.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepotory extends MongoRepository<Customer, String> {
}
