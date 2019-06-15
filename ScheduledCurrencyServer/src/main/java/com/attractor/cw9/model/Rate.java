package com.attractor.cw9.model;

public class Rate {
    private String code;
    private Double value;
    private String date;

    public Rate() {
    }


    public Rate(String code, Double value, String date) {
        super();
        this.code = code;
        this.value = value;
        this.date = date;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Rate{" +
                "code='" + code + '\'' +
                ", value=" + value +
                ", date='" + date + '\'' +
                '}';
    }
}