package com.jf.dao;

import com.alibaba.druid.pool.DruidDataSource;
import com.jf.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author 潇潇暮雨
 * @create 2019-08-15   21:57
 */
@Repository
public class PersonDao {
    @Autowired
    private DruidDataSource dataSource;

    public void insert(Person person) {

    }
}
