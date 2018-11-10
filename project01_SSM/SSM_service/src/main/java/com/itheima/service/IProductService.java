package com.itheima.service;

import com.itheima.Product;
import com.itheima.dao.IProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IProductService {

    List<Product> findAll();
}
