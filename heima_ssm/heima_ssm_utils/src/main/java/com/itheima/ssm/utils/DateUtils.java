package com.itheima.ssm.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    //日期转成字符串
    public static String Date2String(Date date ,String s ){
        SimpleDateFormat sdf=new SimpleDateFormat(s);
        String format = sdf.format(date);
        return  format;
    }

    //字符串转成日期
    public static Date String2Date(String s,String ss) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat(ss);
        Date parse = sdf.parse(s);
        return parse;
    }
}
