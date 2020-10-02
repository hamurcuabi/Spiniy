package com.emrhmrc.customspinner;

import com.emrhmrc.spiniy.helper.BaseModel;

/**
 * Created by hamurcuabi on 02,October,2020
 **/
public class Test implements BaseModel {
    private String name;
    private int id;

    public Test(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
