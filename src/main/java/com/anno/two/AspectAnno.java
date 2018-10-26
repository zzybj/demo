package com.anno.two;

import com.anno.Description;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class AspectAnno {

    @Pointcut("execution(public * com.example.demo.DemoApplication.get*(..))")
    public void annotationPointCut() {
        System.out.println("当前方法");
    }

    @Before("annotationPointCut()")
    public void before(JoinPoint point) {
        MethodSignature sign = (MethodSignature) point.getSignature();
        Method method = sign.getMethod();
        Description anno = method.getAnnotation(Description.class);
        System.out.println("前置："+anno.age() + " " + anno.author() + " " + anno.desc());
    }

}
