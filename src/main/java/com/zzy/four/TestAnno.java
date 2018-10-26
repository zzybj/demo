package com.zzy.four;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAnno {

    @RequestMapping(value="/")
    @MyAnno
    public String test(){
        return "Hello World";
    }

}
