/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author nayan
 */
public class Userdao {
 
       private Connection con;

    public Userdao(Connection con) {
        this.con = con;
    }
    public boolean adduser(User u)
    {
        boolean b=false;
        try{
            PreparedStatement ps=con.prepareStatement("insert into users(uname,email,pass,qualification,roles) values(?,?,?,?,?)");
            ps.setString(1,u.getName());
            ps.setString(2,u.getEmail());
            ps.setString(3,u.getPassword());
            ps.setString(4,u.getQualification());
            ps.setString(5,"user");
            int a=ps.executeUpdate();
            if(a==1)
            {
                b=true;
            }
        }catch(Exception tt)
        {
            System.out.println(tt);
        }
        return b;
    }
       
    public User login(String em,String ps)
    {
        User u=null;
        try{
            PreparedStatement psa=con.prepareStatement("select * from users where email=? and pass=?");
            psa.setString(1,em);
            psa.setString(2,ps);
            ResultSet rs=psa.executeQuery();
            while(rs.next())
            {
                u=new User();
                u.setId(rs.getInt(1));
                u.setName(rs.getString(2));
                u.setQualification(rs.getString(5));
                u.setEmail(rs.getString(3));
                u.setPassword(rs.getString(4));
                u.setRole(rs.getString(6));
            }
        }catch(Exception tt)
        {
            tt.printStackTrace();
        }
        return u;
    }

    public boolean updateuser(User u) {
       boolean f=false;
       try{
           String sql="update users set uname=?,qualification=?,email=?,pass=? where id=?";
           PreparedStatement ps=con.prepareStatement(sql);
           ps.setString(1,u.getName());
           ps.setString(2,u.getQualification());
           ps.setString(3,u.getEmail());
           ps.setString(4,u.getPassword());
           ps.setInt(5,u.getId());
           int i=ps.executeUpdate();
           if(i==1)
           {
               f=true;
           }
       }catch(Exception tt)
       {
           System.out.print(tt);
           tt.printStackTrace();
       }
       return f;
    }
}
