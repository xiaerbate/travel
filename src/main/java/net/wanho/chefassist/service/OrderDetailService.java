package net.wanho.chefassist.service;

import net.wanho.chefassist.bean.OrderDetail;
import net.wanho.chefassist.dto.OrderDetailDto;

import java.util.List;

public interface OrderDetailService {
    void saveOrderDetail(OrderDetail orderDetail);

    /**
     * 完成活动/选择
     */
    void finishDish(int id);


    /**
     * 查询订单详情
     * @param orderId
     * @return
     */
    List<OrderDetailDto> queryOrderDetail(String orderId);

}
