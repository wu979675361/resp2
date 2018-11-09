package com.itheima.dao;

import com.itheima.domain.Items;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsDao {
    Items findById(Integer id);
}
