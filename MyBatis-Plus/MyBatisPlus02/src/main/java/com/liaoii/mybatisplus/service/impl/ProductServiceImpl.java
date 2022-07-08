package com.liaoii.mybatisplus.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liaoii.mybatisplus.entity.Product;
import com.liaoii.mybatisplus.mapper.ProductMapper;
import com.liaoii.mybatisplus.service.ProductService;
import org.springframework.stereotype.Service;

@Service
@DS("slave")
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
