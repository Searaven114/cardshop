package com.nguner.yeditepecardshop.service.impl;

import com.nguner.yeditepecardshop.model.Product;
import com.nguner.yeditepecardshop.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    @Override
    public Collection<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product getProductById(String id) {
        return null;
    }

    //private static ProductRepository productRepo;
}
