package com.jf.bean;

import org.aspectj.lang.annotation.*;

/**
 * @author 潇潇暮雨
 * @create 2019-07-29   22:14
 */
@Aspect
public class Transaction {
    @Before("execution(* com.jf.bean.SqlRun.update(..))")
    public void openTransaction() {
        System.out.println("打开事务");
    }

    @After("execution(* com.jf.bean.SqlRun.update(..))")
    public void closeTransaction() {
        System.out.println("提交事务");
    }

    @AfterReturning("execution(* com.jf.bean.SqlRun.update(..))")
    public void returnTransaction() {
        System.out.println("无异常，正常执行结束");
    }


    @AfterThrowing("execution(* com.jf.bean.SqlRun.update(..))")
    public void RollbackTransaction() {
        System.out.println("出现异常,回滚事务");
    }

}
