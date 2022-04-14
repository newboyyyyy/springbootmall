package com.simpleyi.springbootmall.dto;

import com.simpleyi.springbootmall.constant.ProductCategory;
import lombok.Data;

@Data
public class ProductQueryParams {
    private ProductCategory category;
    private String search;

}
