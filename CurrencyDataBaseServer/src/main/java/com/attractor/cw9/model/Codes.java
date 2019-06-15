package com.attractor.cw9.model;

import javax.persistence.Column;

public class Codes {
    @Column
    private String code;

    public Codes() {
    }

    public Codes(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Codes{" +
                "code='" + code + '\'' +
                '}';
    }
}
