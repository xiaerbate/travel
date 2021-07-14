package net.wanho.chefassist.service;

import net.wanho.chefassist.bean.Dish;

import java.util.List;

public interface DishService {
    void addDish(Dish dish);

    void deleteDish(int id);

    void updateDish(Dish dish);

    List<Dish> queryDishList();
}
