package net.wanho.chefassist.controller;

import lombok.extern.slf4j.Slf4j;
import net.wanho.chefassist.domain.User;
import net.wanho.chefassist.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/login")
    public String login(String name,String password) {

        if(StringUtils.isEmpty(name)){
            return "用户名不允许为空";
        }
        if(StringUtils.isEmpty(password)){
            return "密码不允许为空";
        }

        User user=userMapper.selectUser(name);
        if (user==null){
            return "登录失败";
        }

        if (Objects.equals(password,user.getPassword())) {
            return "登录成功";
        }
        return "登录失败密码错误";
    }

    @GetMapping("/register")
    public String register(String name, String password) {
        log.info("name:{}", name);
        log.info("password:{}", password);
        if(StringUtils.isEmpty(name)){
            return "用户名不允许为空";
        }
        if(StringUtils.isEmpty(password)){
            return "密码不允许为空";
        }

        User user=userMapper.selectUser(name);
        if (user!=null){
            return "注册失败：用户名已经存在";
        }

        int resultCount=userMapper.saveUser(name,password);
        if (resultCount==0){
            return "注册失败";
        }
        return "注册成功";
    }
}
