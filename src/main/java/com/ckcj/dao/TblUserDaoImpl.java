package com.ckcj.dao;

import com.ckcj.entity.Tbluser;
import com.ckcj.tools.MybatisDbHelper;
import jdk.nashorn.internal.objects.NativeError;
import jdk.nashorn.internal.runtime.Context;

public abstract class TblUserDaoImpl implements TblUserdao {
    public  boolean addTblUser(Tbluser tbluser, Object Tbluser) {
        boolean flag = false;
        try {
            //1.得到链接
            org.apache.ibatis.session.SqlSession sqlSession = MybatisDbHelper.getSession();
            //2.SQL
            int num = sqlSession.insert("addTbluer", Tbluser);
            //3.提交
            sqlSession.commit();
            System.out.println(num);
            if (num > 0) {
                flag = true;
            }
        } catch (Exception e) {
            flag = false;
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean delTblUser(String uid) {


        return false;


    }

    public <Tbluser> Boolean addTblUser(com.ckcj.entity.Tbluser tbluser) {
        return null;
    }

    private class SqlSession {
    }
}

