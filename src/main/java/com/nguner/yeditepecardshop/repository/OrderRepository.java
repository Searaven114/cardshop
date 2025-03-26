package com.nguner.yeditepecardshop.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.nguner.yeditepecardshop.model.Order;

public interface OrderRepository extends MongoRepository<Order, String> {
}
