package com.itheima.test;

/**
 * @Author: xiaobai
 * @Param:
 * @Description:
 */
public class DEMO {
    public static void main(String[] args) {
        long b = System.currentTimeMillis();
        int  a= 1000;
        for (int i = 0; i < a; i++) {
            System.out.println("1");
        }
        long c = System.currentTimeMillis();
        long d = (c-a)/1000/60/60/24;
        System.out.println("共耗时："+d);
    }
}
