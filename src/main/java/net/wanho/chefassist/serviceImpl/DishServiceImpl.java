package net.wanho.chefassist.serviceImpl;

import net.wanho.chefassist.bean.Dish;
import net.wanho.chefassist.dao.DishDao;
import net.wanho.chefassist.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishServiceImpl implements DishService {
    @Autowired
    private DishDao dishDao;

    @Override
    public void addDish(Dish dish) {
        dishDao.save(dish);
    }

    @Override
    public void deleteDish(int id) {
        dishDao.deleteById(id);
    }

    @Override
    public void updateDish(Dish dish) {
        dishDao.saveAndFlush(dish);
    }

    @Override
    public List<Dish> queryDishList() {
        return dishDao.findAll();
    }

}
