package com.atguigu.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.stereotype.Component;

/*@ConfigurationProperties(prefix = "person")
@Component*/

@ConfigurationProperties(prefix = "person")
public class Person {

    private String name;

    private Integer age;

    @NestedConfigurationProperty
    private Car car;

    private AuthInfo authInfo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }


    public void setAuthInfo(AuthInfo authInfo) {
        this.authInfo = authInfo;
    }

    public AuthInfo getAuthInfo() {
        return authInfo;
    }

    public static class AuthInfo {

        private String username;
        private String password;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
}
