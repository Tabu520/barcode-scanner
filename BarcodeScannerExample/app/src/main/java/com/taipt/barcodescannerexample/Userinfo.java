package com.taipt.barcodescannerexample;

import java.io.Serializable;

public class Userinfo implements Serializable {

    String name;
    String phone;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
