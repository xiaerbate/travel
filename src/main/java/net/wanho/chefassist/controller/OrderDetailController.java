package net.wanho.chefassist.controller;

import net.wanho.chefassist.bean.OrderDetail;
import net.wanho.chefassist.bean.Result;
import net.wanho.chefassist.service.OrderDetailService;
import net.wanho.chefassist.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orderDetail")
public class OrderDetailController {
    @Autowired
    private OrderDetailService orderDetailService;


    /**
     * 点菜接口
     * @param orderDetail
     * @return
     */
    @PostMapping
    public Result saveOrderDetail(OrderDetail orderDetail) {
        orderDetailService.saveOrderDetail(orderDetail);
        return ResultUtil.success();
    }

    /**
     * 查询点菜详情
     * @param
     * @return
     */
    @GetMapping("/queryOrderDetailByOrderId")
    public Result queryOrderDetailByOrderId(String orderId){
        return ResultUtil.success(orderDetailService.queryOrderDetail(orderId));
    }


    @PutMapping
    public Result finishDish(int id){
        orderDetailService.finishDish(id);
        return ResultUtil.success();
    }
}
