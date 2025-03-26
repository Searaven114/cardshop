package com.nguner.yeditepecardshop.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@Document(collection = "carts")
public class Cart {
    @Id
    private String id;
    private String userId;              // the ID of the User who owns this cart
    private List<CartItem> items = new ArrayList<>();
}

