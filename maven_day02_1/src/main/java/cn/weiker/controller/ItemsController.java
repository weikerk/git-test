package cn.weiker.controller;

import cn.weiker.domain.Items;
import cn.weiker.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author weiker
 * @Date 2018/9/14 22:55
 * @ClassName ItemsController
 * @Version 1.0
 */
@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;
    @RequestMapping("/findDetail")
    public String findDetail(Model model) {

        Items items = itemsService.findById(1);
        model.addAttribute("item",items);

        return "itemDetail";
    }
}










