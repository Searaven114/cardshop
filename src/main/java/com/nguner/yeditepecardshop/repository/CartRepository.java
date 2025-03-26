package com.nguner.yeditepecardshop.repository;

import com.nguner.yeditepecardshop.model.Cart;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CartRepository extends MongoRepository<Cart, String> {
}
