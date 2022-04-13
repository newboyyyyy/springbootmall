package com.simpleyi.springbootmall.dao;

import com.simpleyi.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

}
