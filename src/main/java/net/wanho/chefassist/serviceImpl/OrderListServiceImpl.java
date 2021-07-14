package net.wanho.chefassist.serviceImpl;

import net.wanho.chefassist.bean.Desk;
import net.wanho.chefassist.bean.OrderList;
import net.wanho.chefassist.dao.DeskDao;
import net.wanho.chefassist.dao.OrderListDao;
import net.wanho.chefassist.service.OrderListService;
import net.wanho.chefassist.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.UUID;

@Service
public class OrderListServiceImpl implements OrderListService {
    @Autowired
    OrderListDao orderListDao;

    @Autowired
    DeskDao deskDao;

    @Override
    public String createNewOrder(int tableId) {
//        获取一个随机uuid
        String id = UUID.randomUUID().toString();
        OrderList orderList = new OrderList();
        orderList.setId(id);
        orderList.setTableId(tableId);
        orderList.setStartTime(DateUtil.getNowDateString());
        orderListDao.saveAndFlush(orderList);

        //获取获取id，修改活动状态
        Desk desk = deskDao.findById(tableId).get();
        desk.setIsUsing(1);
        deskDao.saveAndFlush(desk);

        return id;
    }

    @Override
    @Transactional
    public void finishOrder(String id) {
        OrderList ol = orderListDao.findById(id).get();
        ol.setStatus(1);
        ol.setEndTime(DateUtil.getNowDateString());
        orderListDao.saveAndFlush(ol);
        deskDao.finishOrder(id);
    }

    @Override
    public OrderList findOrderIdByDeskId(int deskid) {
        return orderListDao.findOrderIdByDeskId(deskid);
    }
}
