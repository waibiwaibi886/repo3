package com.youyue.domain;

import java.io.Serializable;

public class Account implements Serializable {
    private Integer id;
    private Integer uid;
    private double money;
    private String name;

    public Account() {
    }

    public Account(Integer id, Integer uid, double money, String name) {
        this.id = id;
        this.uid = uid;
        this.money = money;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", uid=" + uid +
                ", money=" + money +
                ", name='" + name + '\'' +
                '}';
    }
}
