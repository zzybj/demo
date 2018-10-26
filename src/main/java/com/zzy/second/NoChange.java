package com.zzy.second;

import java.util.Objects;

/**
 * 不可变类
 *  1.所有属性都是final类型
 *  2.不提供set方法
 *  3.用final修饰类，确保所有的方法不会被重载
 */
public final class NoChange {

    private final String username;
    private final String pwd;

    public NoChange() {
        username="";
        pwd="";
    }

    public NoChange(String username, String pwd) {
        this.username = username;
        this.pwd = pwd;
    }

    public String getUsername() {
        return username;
    }

    public String getPwd() {
        return pwd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NoChange noChange = (NoChange) o;
        return Objects.equals(username, noChange.username) &&
                Objects.equals(pwd, noChange.pwd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, pwd);
    }
}
