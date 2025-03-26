package com.nguner.yeditepecardshop.repository;

import com.nguner.yeditepecardshop.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
