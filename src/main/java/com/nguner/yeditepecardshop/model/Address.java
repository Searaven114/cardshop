package com.nguner.yeditepecardshop.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Data
@Document(collection = "addresses")
public class Address {

    @Id
    private String id;
    private String street;
    private String city;
    private String zipCode;
    private String country;

}
