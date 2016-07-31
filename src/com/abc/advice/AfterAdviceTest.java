package com.abc.advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AfterAdviceTest {
    @After(value="execution(* com.abc.service.*.afterAdvice*(..)) && args(name)")
    public void releaseResource(String name) {
        System.out.println("模拟释放数据库连接");
    }
}
