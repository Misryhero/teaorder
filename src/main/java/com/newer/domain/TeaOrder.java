package com.newer.domain;

import java.io.Serializable;
import java.sql.Timestamp;

public class TeaOrder implements Serializable {

    private Integer tid;
    private String detail;
    private Integer num;
    private Integer price;
    private Timestamp oderTime;

    public Integer getTid() {
        return tid;
    }

    public String getDetail() {
        return detail;
    }

    public Integer getNum() {
        return num;
    }

    public Integer getPrice() {
        return price;
    }

    public Timestamp getOderTime() {
        return oderTime;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setOderTime(Timestamp oderTime) {
        this.oderTime = oderTime;
    }
}
