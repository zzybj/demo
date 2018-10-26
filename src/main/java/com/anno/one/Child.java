package com.anno.one;


import com.anno.Description;

@Description(desc = "color", author = "boy", age = 18)
public class Child implements People {

    @Override
    @Description(desc = "color", author = "girl", age = 20)
    public String name() {
        return null;
    }

    @Override
    public int age() {
        return 0;
    }

    @Override
    public void work() {

    }
}
