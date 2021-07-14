package net.wanho.chefassist.controller;

import net.wanho.chefassist.bean.Dish;
import net.wanho.chefassist.bean.Result;
import net.wanho.chefassist.service.DishService;
import net.wanho.chefassist.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dish")
public class DishController {
    @Autowired
    DishService dishService;

    @PostMapping
    public Result addDish(Dish dish) {
        dishService.addDish(dish);
        return ResultUtil.success();
    }

    @DeleteMapping
    public Result deleteDish(Integer id) {
        dishService.deleteDish(id);
        return ResultUtil.success();
    }

    @PutMapping
    public Result updateDish(Dish dish) {
        dishService.updateDish(dish);
        return ResultUtil.success();
    }

    @GetMapping
    public Result queryDishList() {
        return ResultUtil.success(dishService.queryDishList());
    }
}
