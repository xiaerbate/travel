package net.wanho.chefassist.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

//    获取当前String类型的时间
    public static String getNowDateString(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        return sdf.format(date);
    }
}
