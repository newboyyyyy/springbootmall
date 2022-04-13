package com.simpleyi.springbootmall.service;


import com.simpleyi.springbootmall.dto.ProductRequest;
import com.simpleyi.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
}
