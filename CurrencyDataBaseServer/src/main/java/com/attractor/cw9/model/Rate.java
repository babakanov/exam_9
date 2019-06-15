package com.attractor.cw9.model;

import javax.persistence.Column;

public class Rate {

    @Column
    private String code;

    @Column
    private double value;

    @Column
    private String create_at;

    public Rate() {

    }

    public Rate(String code, double value, String create_at) {
        this.code = code;
        this.value = value;
        this.create_at = create_at;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getCreate_at() {
        return create_at;
    }

    public void setCreate_at(String create_at) {
        this.create_at = create_at;
    }

    @Override
    public String toString() {
        return "Rate{" +
                "code='" + code + '\'' +
                ", value=" + value +
                ", create_at='" + create_at + '\'' +
                '}';
    }
}
