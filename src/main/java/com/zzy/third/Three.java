package com.zzy.third;

/**
 * 双重检查锁定实现单例模式
 */
public class Three {

    private static Three three;

    private Three(){

    }

    public static Three getInstance(){
        if(three == null){
            synchronized (Three.class){
                if(three == null){
                    three = new Three();
                }
            }
        }
        return three;
    }

}
