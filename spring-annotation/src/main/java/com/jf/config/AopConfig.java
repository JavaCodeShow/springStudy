package com.jf.config;

import com.jf.bean.SqlRun;
import com.jf.bean.Transaction;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author 潇潇暮雨
 * @create 2019-07-29   22:10
 */
@EnableAspectJAutoProxy
public class AopConfig {

    @Bean
    public SqlRun sqlRun() {
        return new SqlRun();
    }

    @Bean
    public Transaction transaction() {
        return new Transaction();
    }

}
