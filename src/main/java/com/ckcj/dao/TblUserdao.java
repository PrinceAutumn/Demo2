package com.ckcj.dao;

import com.ckcj.entity.TblUser;

public interface TblUserdao {
    //1.增加用户
    public <Tbluser> Boolean addTblUser(Tbluser tbluser);

    //2.删除用户
    public Boolean delTbluser(String uid);

    boolean delTblUser(String uid);

    class TblUser {
    }
}
