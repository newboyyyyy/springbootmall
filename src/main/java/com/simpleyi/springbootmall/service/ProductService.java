package com.simpleyi.springbootmall.service;


import com.simpleyi.springbootmall.dto.ProductRequest;
import com.simpleyi.springbootmall.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProducts();
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId , ProductRequest productRequest);
    void deleteProductById(Integer productId);

}
