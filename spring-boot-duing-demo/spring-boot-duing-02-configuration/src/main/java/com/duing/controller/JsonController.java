package com.duing.controller;

import com.duing.bean.Food;
import com.duing.config.FoodConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @RestController
 * 其实是  @Controller  和  @ResponseBody  的结合形式
 * 可以 ctrl+鼠标左键  查看
 */
@RestController
public class JsonController {
//    @Value("${food.meat}")
//    private String meat;
//    @Value("${food.rice}")
//    private String rice;

//    @RequestMapping  指定方法和请求之间的映射关系
//    @RequestMapping("/json")
//    public Food json() {
//        Food food = new Food();
//        food.setMeat(meat);
//        food.setRice(rice);
//        return food;
//    }

    @Autowired
    private FoodConfig foodConfig;

    @RequestMapping("/json")
    public Food json() {
        Food food = new Food();
        food.setMeat(foodConfig.getMeat());
        food.setRice(foodConfig.getRice());
        return food;
    }
}
