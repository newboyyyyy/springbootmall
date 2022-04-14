package com.simpleyi.springbootmall.dao;


import com.simpleyi.springbootmall.constant.ProductCategory;
import com.simpleyi.springbootmall.dto.ProductQueryParams;
import com.simpleyi.springbootmall.dto.ProductRequest;
import com.simpleyi.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {
    List<Product> getProducts(ProductQueryParams productQueryParams);
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId , ProductRequest productRequest);
    void deleteProductById(Integer productId);

}
