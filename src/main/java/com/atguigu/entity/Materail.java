package com.atguigu.entity;

import org.springframework.stereotype.Component;

@Component
public class Materail {

    private String materialName;

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }
}
