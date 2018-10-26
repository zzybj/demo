package com.zzy.third;

/**
 * 懒汉模式
 * 当需要用到对象时，再对其实例化
 */
public class Two {

    private static Two two = null;

    private Two() {

    }

    public static Two getInstance() {
        if(two == null){
            two = new Two();
        }
        return two;
    }

}
