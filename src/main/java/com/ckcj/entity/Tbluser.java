package com.ckcj.entity;

import com.ckcj.dao.TblUserdao;

public class Tbluser extends TblUserdao.TblUser {
    private long userid;
    private long rid;
    private String uname;
    private String upwd;
    private double money;
    private String phone;
    private long usersid;


    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {

         this.usersid = userid;
    }

    public long getRid() {

        return rid;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }
}

