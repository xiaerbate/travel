package net.wanho.chefassist.controller;

import net.wanho.chefassist.bean.OrderList;
import net.wanho.chefassist.bean.Result;
import net.wanho.chefassist.service.OrderListService;
import net.wanho.chefassist.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/orderList")
public class OrderListController {
    @Autowired
    OrderListService orderListService;

    /**
     * 创建新订单
     * @param tableId
     * @return
     */
    @PostMapping
    public Result createNewOrder(int tableId){
        String orderId = orderListService.createNewOrder(tableId);
        return ResultUtil.success("操作成功",orderId);
    }

    /**
     * 结束订单
     * @param orderId
     * @return
     */
    @PutMapping
    public Result finishOrder(String orderId){
        orderListService.finishOrder(orderId);
        return ResultUtil.success("操作成功",orderId);
    }

    @GetMapping("/findOrderIdByDeskId")
    public Result findOrderIdByDeskId(int deskid){
        OrderList ol = orderListService.findOrderIdByDeskId(deskid);
        return ResultUtil.success(ol);
    }
}
