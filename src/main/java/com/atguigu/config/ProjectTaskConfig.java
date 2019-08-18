package com.atguigu.config;

import com.atguigu.entity.Car;
import com.atguigu.entity.House;
import com.atguigu.entity.Materail;
import com.atguigu.entity.ProjectTask;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.util.Assert;

@Configuration
public class ProjectTaskConfig {

    private String msg;

    private Materail materail;

    @Bean
    public ProjectTask projectTask(ObjectFactory<Materail> objectFactory){
        Materail materail = objectFactory.getObject();
        Assert.notNull(materail,"car is not exists");
        return new ProjectTask();
    }

    /*@Primary*/
   /* @Bean
    public House h1(Materail materail){
        this.materail=materail;
        return new House();
    }

    @Bean
    public House h2(){
        return new House();
    }*/

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
