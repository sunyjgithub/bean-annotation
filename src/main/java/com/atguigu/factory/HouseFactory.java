package com.atguigu.factory;

import com.atguigu.entity.House;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/*@Component*/
public class HouseFactory implements FactoryBean<House> {
    @Override
    public House getObject() throws Exception {
        return new House();
    }

    @Override
    public Class<?> getObjectType() {
        return House.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
