package com.ckcj.entity;

public class Tbltype {
       private long tid;
       private String tname;
       private long pid;

       public long getTid()
      {
          return tid;
      }
       public void setTid(
            long tid
          )
       {
          this.tid=tid;
    }
    public String gettnme(){
            return tname;
      }
    public void settname(
            long tname){
    this.tname = String.valueOf(tname);
      }
    public long getpid(){
            return pid;
                       }
    public void setpid(long pid){

           this.pid=pid;
                        }
    }
