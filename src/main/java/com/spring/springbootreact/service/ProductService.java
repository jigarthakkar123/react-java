package com.spring.springbootreact.service;

import java.util.List;
import java.util.Optional;

import com.spring.springbootreact.model.Product;

public interface ProductService {
    List<Product> getAllProducts();
    Optional<Product> getProductById(Long id);
    Product saveProduct(Product product);
    Product updateProduct(Product product);
    void deleteProduct(Long id);
}