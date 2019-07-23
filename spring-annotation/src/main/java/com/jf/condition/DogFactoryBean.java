package com.jf.condition;

import com.jf.bean.Dog;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author 潇潇暮雨
 * @create 2019-07-23   22:05
 */

public class DogFactoryBean implements FactoryBean {
    @Override
    public Dog getObject() throws Exception {
        return new Dog();
    }

    @Override
    public Class<?> getObjectType() {
        return Dog.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
