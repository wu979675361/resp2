package com.itheima.dao;

import com.itheima.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IProductDao {
    @Select("select * from product")
    List<Product> findAll();
}
