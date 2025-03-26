package com.nguner.yeditepecardshop.repository;

import com.nguner.yeditepecardshop.model.Address;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AddressRepository extends MongoRepository<Address, String> {
}
