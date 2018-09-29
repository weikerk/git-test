package cn.weiker.test;

import cn.weiker.dao.ItemsDao;
import cn.weiker.domain.Items;
import cn.weiker.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author weiker
 * @Date 2018/9/14 17:03
 * @ClassName ItemsTest
 * @Version 1.0
 */
public class ItemsTest {
    @Test
    public void findById() {
        //获取spring核心容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //测试dao
        //从容器中得到所需要的dao接口的代理对象
        ItemsDao itemsDao = ac.getBean(ItemsDao.class);
        //执行方法
        Items items = itemsDao.findById(1);
        System.out.println(items);
    }
    @Test
    public void save() {
        Items items = new Items();
        items.setName("斗破苍穹");
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsService service = ac.getBean(ItemsService.class);
        service.save(items);
    }
}
