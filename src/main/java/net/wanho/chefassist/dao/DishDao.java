package net.wanho.chefassist.dao;

import net.wanho.chefassist.bean.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishDao extends JpaRepository<Dish, Integer> {

}
