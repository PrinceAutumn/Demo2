package com.ckcj.tools;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MybatisDbHelper {
    private static Object SqlSession;

    //得到鏈接方法
       public static <SqlSessionFactoryBuilder> SqlSession getSession(){
            SqlSession sqlSession=null;
        try {
            //1.創建一個鏈接工廠的構建器
            SqlSessionFactoryBuilder sfb = new SqlSessionFactoryBuilder();
            //2.拿到工廠實例
            String fpath = "mybatis-config.xml";
            //SqlSessionFactory sf=sfb.build(new FileInputSteam(new File(fpath)));
            InputStream inputStream= Resources.getResourceAsStream(fpath);
            SqlSessionFactory sf = sfb.build(inputStream);
            //3.由工厂实例获得一个链
            sqlSession =sf.openSession();
            System.out.println((sqlSession));
        }catch (Exception e){
            e.printStackTrace();
        }
        return sqlSession;
    }


    private static void getResourceAsSteam(String fpath) {
    }

//关闭连接方法
  public void closeSession(SqlSession sqlSession){
     try{
        if (SqlSession !=null){
            sqlSession.close();
        }
     }catch (Exception e){
         e.printStackTrace();
     }

  }
      public static void main(String[] args) {
         MybatisDbHelper.getSession();
        }
}
