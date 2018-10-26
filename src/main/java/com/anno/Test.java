package com.anno;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(3);
        list.add("a");
        list.add("b");
        list.add("c");
        String[] arr = new String[list.size()];
        arr = list.toArray(arr);
        System.out.println(arr.length);
    }

}
