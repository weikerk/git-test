package cn.weiker.service.impl;

import cn.weiker.dao.ItemsDao;
import cn.weiker.domain.Items;
import cn.weiker.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author weiker
 * @Date 2018/9/14 22:13
 * @ClassName ItemsServiceImpl
 * @Version 1.0
 */
@Service
public class ItemsServiceImpl implements ItemsService{
    @Autowired
    private ItemsDao itemsDao;

    public Items findById(Integer id) {
        return itemsDao.findById(id);
    }

    public void save(Items items) {
        itemsDao.save(items);
    }
}
