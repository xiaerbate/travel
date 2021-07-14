package net.wanho.chefassist.dao;

import net.wanho.chefassist.bean.OrderList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OrderListDao extends JpaRepository<OrderList,String> {

    @Query(value = "select new net.wanho.chefassist.bean.OrderList(ol.id,ol.tableId," +
            "ol.startTime,ol.endTime,ol.totalMoney,ol.status) from OrderList ol " +
            "where ol.tableId=:deskid and ol.status=0")
    OrderList findOrderIdByDeskId(@Param("deskid") int deskid);
}
