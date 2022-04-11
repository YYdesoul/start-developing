package com.soul.domain;


public class Result {

    Object value;

    public Result() {
    }

    public Result(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
