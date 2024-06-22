package com.example.shopmanagement.api.repository;

import com.example.shopmanagement.api.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, Integer> {

}
