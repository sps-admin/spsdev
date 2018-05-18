package com.skyguard.sps.common.test;

/**
 * Created by liupei on 2018/5/18.
 */
public class TestDto {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return this.name;
    }
}
