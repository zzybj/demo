package com.zzy.third;

/**
 * 饿汉模式
 * 类初始化时即加载对象
 */
public class One {

    private static One one = new One();

    private One() {

    }

    public static One getInstance() {
        return one;
    }

}
