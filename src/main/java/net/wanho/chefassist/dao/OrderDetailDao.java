package net.wanho.chefassist.dao;

import net.wanho.chefassist.bean.OrderDetail;
import net.wanho.chefassist.dto.OrderDetailDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderDetailDao extends JpaRepository<OrderDetail,Integer> {

    @Query(value = "select new net.wanho.chefassist.dto.OrderDetailDto(" +
            "od.id,d.name,od.count,d.price,od.count*d.price,od.status,'') " +
            " from OrderDetail od join Dish d on d.id=od.dishId where od.orderId=:id ")
    List<OrderDetailDto> queryOrderDetail(@Param("id") String orderId);

}
