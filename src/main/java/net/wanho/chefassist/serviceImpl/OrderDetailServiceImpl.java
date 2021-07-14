package net.wanho.chefassist.serviceImpl;

import net.wanho.chefassist.bean.Dish;
import net.wanho.chefassist.bean.OrderDetail;
import net.wanho.chefassist.bean.OrderList;
import net.wanho.chefassist.dao.DishDao;
import net.wanho.chefassist.dao.OrderDetailDao;
import net.wanho.chefassist.dao.OrderListDao;
import net.wanho.chefassist.dto.OrderDetailDto;
import net.wanho.chefassist.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {
    @Autowired
    private DishDao dishDao;
    @Autowired
    private OrderListDao orderListDao;
    @Autowired
    private OrderDetailDao orderDetailDao;

    @Override
    public void saveOrderDetail(OrderDetail orderDetail) {
        orderDetail.setStatus(0);
        this.orderDetailDao.save(orderDetail);
        Dish dish = this.dishDao.findById(orderDetail.getDishId()).get();
        Double prices = dish.getPrice() * orderDetail.getCount();
        OrderList orderList = this.orderListDao.findById(orderDetail.getOrderId()).get();
        Double totalMoney = orderList.getTotalMoney();
        if (totalMoney == null || totalMoney.equals("")) {
            totalMoney = 0.00;
            totalMoney += prices;
        }else {
            totalMoney += prices;
        }
        orderList.setTotalMoney(totalMoney);
        this.orderListDao.saveAndFlush(orderList);
    }

    @Override
    public void finishDish(int id) {
        //通过id找到实体类对象
        Optional<OrderDetail> optional = orderDetailDao.findById(id);
        OrderDetail od = optional.get();

        //修改数据并保存
        od.setStatus(1);
        orderDetailDao.saveAndFlush(od);
    }

    @Override
    public List<OrderDetailDto> queryOrderDetail(String orderId) {
        List<OrderDetailDto> list = orderDetailDao.queryOrderDetail(orderId);
        for (OrderDetailDto o:list){
            if(o.getStatus() == 0){
                o.setStatusTxt("未完成");
            }else {
                o.setStatusTxt("已选择");
            }
        }
        return list;
    }

}
