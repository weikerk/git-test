package cn.weiker.dao;

import cn.weiker.domain.Items;

/**
 * 持久层接口
 * @InterfaceName ItemsDao
 * @Author weiker
 * @Date 2018/9/14 15:58
 */
public interface ItemsDao {
    /**
     * 查询一个
     * @param id
     * @return
     */
    public Items findById(Integer id);

    /**
     * 保存
     * @param items
     */
    void save(Items items);
}
