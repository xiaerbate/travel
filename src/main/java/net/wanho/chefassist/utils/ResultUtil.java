package net.wanho.chefassist.utils;

import net.wanho.chefassist.bean.Result;

public class ResultUtil {

    public static Result success(){
        return new Result(200, "操作成功", null);
    }

    public static Result success(String msg){
        return new Result(200, msg, null);
    }

    public static Result success(Object object){
        return new Result(200, "操作成功", object);
    }

    public static Result success(String msg,Object object){
        return new Result(200, msg, object);
    }

    public static Result error(String msg){
        return new Result(99, msg, null);
    }

    public static Result error(){
        return new Result(99, "操作失败", null);
    }
}
