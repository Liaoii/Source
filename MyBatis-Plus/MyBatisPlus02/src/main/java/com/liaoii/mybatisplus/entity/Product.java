package com.liaoii.mybatisplus.entity;

import lombok.Data;

@Data
public class Product {
    private Integer id;
    private String name;
    private Integer price;
    private Integer version;
}
