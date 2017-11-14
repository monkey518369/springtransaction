package com.monkey.test.spring.transaction.utils.datasource;


/**
 * @Author:monkey
 * @Description:
 * @Date: Create in 23:46 2017/11/13
 */
public class DataSourceContextHolder {

    private static final ThreadLocal<String> local = new ThreadLocal<>();

    public static ThreadLocal<String>  getLocal(){
        return local;
    }

    public static void setRead(){
        local.set(DataSourceType.read.getType());
    }

    public static void setWrite(){
        local.set(DataSourceType.write.getType());
    }

    public static String geReadOrWrite(){
        System.out.println(local.get() + "=====================");
        return local.get();
    }

    public static void clear(){
        local.remove();
    }
}
