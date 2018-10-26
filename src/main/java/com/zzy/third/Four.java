package com.zzy.third;

/**
 * 静态内部类实现单例模式
 *
 */
public class Four {

    private static Four four;

    private Four(){

    }

    public Four getInstance(){
        return Singleton.four;
    }

    private static class Singleton{
        private static final Four four = new Four();
    }

}
