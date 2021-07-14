package net.wanho.chefassist.controller;

import net.wanho.chefassist.bean.Desk;
import net.wanho.chefassist.bean.Result;
import net.wanho.chefassist.dto.DeskDto;
import net.wanho.chefassist.service.DeskService;
import net.wanho.chefassist.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;
import java.util.List;

//restful
@RestController
@RequestMapping("/desk")
public class DeskController {
    @Autowired
    private DeskService deskService;

//    @RequestMapping(value = "/add",method = RequestMethod.POST)
//    @PostMapping(value = "/add")

    @PostMapping
    public Result addDesk(Desk desk){
        deskService.addDesk(desk);
        return ResultUtil.success();
    }

    @DeleteMapping
    public Result deleteDesk(int id){
        deskService.deleteDesk(id);
        return ResultUtil.success();
    }

    @PutMapping
    public Result updateDesk(Desk desk){
        deskService.updateDesk(desk);
        return ResultUtil.success();
    }

    @GetMapping
    public Result queryDeskList(){
        List<Desk> list = deskService.queryDeskList();
        return ResultUtil.success(list);
    }
}
