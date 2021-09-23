package com.ckcj.tools;

import com.ckcj.dao.TblUserdao;
import com.ckcj.dao.TblUserDaoImpl;
import com.ckcj.entity.Tbluser;
import org.junit.jupiter.api.Test;


public class TestTblUseDao {
    TblUserDao tblUserDao= (TblUserDao) new TblUserDaoImpl() {
        @Override
        public Boolean delTbluser(String uid) {
            return null;
        }

        @Override
        public <Tbluser> Boolean addTblUser(com.ckcj.entity.Tbluser tbluser) {
            return null;
        }
    };
    //测试方法定义：voie 方法名test前缀
    @Test
    public static <tbluser> void main(String[] args) {
        TblUserDao tblUserDao = new TblUserDaoImpl() {
            @Override
            public Boolean delTbluser(String uid) {
                return null;
            }

            @Override
            public <Tbluser> Boolean addTblUser(com.ckcj.entity.Tbluser tbluser) {
                return null;
            }

            TblUser tblUser = new Tbluser();
            TblUser.setRid(1);
            tbluser.setUname("admin");
            tbluser.setUpwd("123456");
            tbluser.setMoney(100);
            tbluser.setPhone("12345678990");
            tblUserDao.addTbluser(tbluser);
        }
    }

        @Test
        public boolean delTbluser(String upwd, String userid) {

            return false;
        }

    private class TblUserDao {
    }
}
