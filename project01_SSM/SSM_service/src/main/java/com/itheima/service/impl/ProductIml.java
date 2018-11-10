package com.itheima.service.impl;

import com.itheima.Product;
import com.itheima.dao.IProductDao;
import com.itheima.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductIml implements IProductService {
    @Autowired
    private IProductDao dao;
    @Override
    public List<Product> findAll() {
        return dao.findAll();
    }
}
