package com.nguner.yeditepecardshop.service;

import com.nguner.yeditepecardshop.model.Product;
import org.springframework.stereotype.Service;

import java.util.Collection;

public interface ProductService {
    Collection<Product> getAllProducts();
    Product getProductById(String id);
    // maybe addProduct, etc., for admin functionality
}
