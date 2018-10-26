package com.zzy.four;


import java.lang.annotation.*;

@Documented
@Target({ElementType.PARAMETER,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {

}
