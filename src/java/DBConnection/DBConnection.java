/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author nayan
 */
public class DBConnection implements DBProperties{
  static Connection con;
  public static Connection getConnection()
  {
      try{
      Class.forName(driver);
      con=DriverManager.getConnection(conn,unm,ps);
      }catch(Exception tt)
      {
       System.out.print(tt);
      }
      return con;
  }
}
