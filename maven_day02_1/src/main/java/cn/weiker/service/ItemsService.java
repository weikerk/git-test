package cn.weiker.service;

import cn.weiker.domain.Items;

/**
 * 业务层接口
 * @InterfaceName ItemsService
 * @Author weiker
 * @Date 2018/9/14 22:11
 */
public interface ItemsService {
    /**
     * 通过id查询一个
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
