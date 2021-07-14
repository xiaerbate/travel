package net.wanho.chefassist.service;

import net.wanho.chefassist.bean.OrderList;

public interface OrderListService {
    String createNewOrder(int id);

    void finishOrder(String id);

    OrderList findOrderIdByDeskId(int deskid);
}
