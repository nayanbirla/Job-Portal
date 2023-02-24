/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.entity.Jobs;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nayan
 */
public class Jobdao {
    private static Connection con;
    public Jobdao(Connection con)
    {
        this.con=con;
    }
    public boolean addjobs(Jobs j)
    {
        boolean result=false;
        try{
            PreparedStatement ps=con.prepareStatement("insert into jobs(title,descr,category,status,location) values(?,?,?,?,?)");
            ps.setString(1,j.getTitle());
            ps.setString(2,j.getDescription());
            ps.setString(3,j.getCategory());
            ps.setString(4,j.getStatus());
            ps.setString(5,j.getLocation());
            int i=ps.executeUpdate();
            if(i==1)
            {
                result=true;
            }
        }catch(Exception tt)
        {
            tt.printStackTrace();
        }
        return result;
    }
    public static List<Jobs> getAllJobs()
    {
       List<Jobs> list=new ArrayList<Jobs>();
       Jobs j=null;
       try{
           Statement stm=con.createStatement();
           ResultSet rs=stm.executeQuery("select * from jobs");
           while(rs.next())
           {
               j =new Jobs();
               j.setId(rs.getInt(1));
               j.setTitle(rs.getString(2));
               j.setCategory(rs.getString(4));
               j.setDescription(rs.getString(3));
               j.setStatus(rs.getString(5));
               j.setLocation(rs.getString(6));
               j.setPdate(rs.getTimestamp(7)+"");
               list.add(j);
               
           }
           
       }catch(Exception tt)
       {
           
       }
       return list;
    }
    
    public static Jobs getEditJobs(int id)
    {
       
       Jobs j=null;
       try{
           Statement stm=con.createStatement();
           ResultSet rs=stm.executeQuery("select * from jobs where jid="+id);
           while(rs.next())
           {
               j =new Jobs();
               j.setId(rs.getInt(1));
               j.setTitle(rs.getString(2));
               j.setCategory(rs.getString(4));
               j.setDescription(rs.getString(3));
               j.setStatus(rs.getString(5));
               j.setLocation(rs.getString(6));
               j.setPdate(rs.getTimestamp(7)+"");
            
               
           }
           
       }catch(Exception tt)
       {
           
       }
       return j;
    }
    
    public List<Jobs> getJobscl(String category,String location)
    {
        List<Jobs> list=new ArrayList<Jobs>();
        Jobs j=null;
        try{
            String sql="select * from jobs where category=? or location=? order by jid desc";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,category);
            ps.setString(2,location);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                j=new Jobs();
                j.setId(rs.getInt(1));
                j.setTitle(rs.getString(2));
                j.setDescription(rs.getString(3));
                j.setCategory(rs.getString(4));
                j.setLocation(rs.getString(6));
                j.setStatus(rs.getString(5));
                j.setPdate(rs.getString(7));
                list.add(j);
            }
        }catch(Exception tt)
        {
            System.out.println(tt);
        }
        return list;
    }
    
    public List<Jobs> getJobsclboth(String category,String location)
    {
        List<Jobs> list=new ArrayList<Jobs>();
        Jobs j=null;
        try{
            String sql="select * from jobs where category=? and location=? order by jid desc";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,category);
            ps.setString(2,location);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                j=new Jobs();
                j.setId(rs.getInt(1));
                j.setTitle(rs.getString(2));
                j.setDescription(rs.getString(3));
                j.setCategory(rs.getString(4));
                j.setLocation(rs.getString(6));
                j.setStatus(rs.getString(5));
                j.setPdate(rs.getString(7));
                list.add(j);
            }
        }catch(Exception tt)
        {
            System.out.println(tt);
        }
        return list;
    }
public boolean updatejob(Jobs j)
{boolean result=false;
        try{
            PreparedStatement ps=con.prepareStatement("update jobs set title=?,descr=?,category=?,status=?,location=? where jid=?");
            ps.setString(1,j.getTitle());
            ps.setString(2,j.getDescription());
            ps.setString(3,j.getCategory());
            ps.setString(4,j.getStatus());
            ps.setString(5,j.getLocation());
            ps.setInt(6,j.getId());
            int i=ps.executeUpdate();
            if(i==1)
            {
                result=true;
            }
        }catch(Exception tt)
        {
            tt.printStackTrace();
        }
        return result;
}


   public boolean deleteJobs(int id)
   {
       boolean b=false;
       try{
           PreparedStatement ps=con.prepareStatement("delete from jobs where jid=?");
           ps.setInt(1,id);
           int i=ps.executeUpdate();
           if(i==1)
           {
               b=true;
           }
       }catch(Exception tt)
       {
         System.out.println(tt);
       }
       
       return b;
   }
   
   public static List<Jobs> getAllJobsuser()
    {
       List<Jobs> list=new ArrayList<Jobs>();
       Jobs j=null;
       try{
           Statement stm=con.createStatement();
           ResultSet rs=stm.executeQuery("select * from jobs where status='Active' order by jid desc");
           
           while(rs.next())
           {
               j =new Jobs();
               j.setId(rs.getInt(1));
               j.setTitle(rs.getString(2));
               j.setCategory(rs.getString(4));
               j.setDescription(rs.getString(3));
               j.setStatus(rs.getString(5));
               j.setLocation(rs.getString(6));
               j.setPdate(rs.getTimestamp(7)+"");
               list.add(j);
               
           }
           
       }catch(Exception tt)
       {
           System.out.print(tt);
       }
       return list;
    }
}
