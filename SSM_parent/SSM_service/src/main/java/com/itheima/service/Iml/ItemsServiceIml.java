package com.itheima.service.Iml;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceIml implements ItemsService {
   @Autowired
    private ItemsDao itemsDao;
    public Items findById(Integer id) {
        return itemsDao.findById(1);
    }
}
