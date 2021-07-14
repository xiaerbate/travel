package net.wanho.chefassist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//RestController   -> ResponseBody+Controller

@Controller
public class ViewController {

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/deskManage")
    public String deskManage(){
        return "deskManage";
    }

    @RequestMapping("/dishManage")
    public String dishManage(){
        return "dishManage";
    }

    @RequestMapping("/orderView")
    public String orderView(){
        return "orderView";
    }

    @RequestMapping("/deskView")
    public String deskView(){
        return "deskView";
    }
}
