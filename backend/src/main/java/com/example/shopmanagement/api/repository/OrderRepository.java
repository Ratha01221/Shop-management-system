package com.example.shopmanagement.api.repository;

import com.example.shopmanagement.api.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, String> {
}
