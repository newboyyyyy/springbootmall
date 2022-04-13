package com.simpleyi.springbootmall.service.impl;

import com.simpleyi.springbootmall.dao.ProductDao;
import com.simpleyi.springbootmall.dto.ProductRequest;
import com.simpleyi.springbootmall.model.Product;
import com.simpleyi.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }


}
