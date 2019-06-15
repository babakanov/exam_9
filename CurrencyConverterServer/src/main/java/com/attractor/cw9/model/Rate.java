package com.attractor.cw9.model;


public class Rate {
    public String code;
    public Double value;

    public Rate() {
    }

    public Rate(String code, Double value) {
        this.code = code;
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }


}
