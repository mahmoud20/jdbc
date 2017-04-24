/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Technical
 */
public class JavaApplication31 {
     static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
     static final String DB_URL = "jdbc:mysql://localhost/classicmodels";
     static final String USER = "root";
     static final String PASS = "123456";
     static Connection con = null;
    // static Statement stmt = null;    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        // TODO code application logic here
            Class.forName("com.mysql.jdbc.Driver");
    try {
        con = DriverManager.getConnection (DB_URL ,USER,PASS);
        PreparedStatement updateemp;

        updateemp = con.prepareStatement("insert into test (name,descr) values(?,?)");

   //     updateemp.setInt(1,23);
   
        updateemp.setString(1,"Test2");
        updateemp.setString(2, "CEO2");
        updateemp.executeUpdate();
       } catch (SQLException ex) {
        Logger.getLogger(JavaApplication31.class.getName()).log(Level.SEVERE, null, ex);
    }
      Statement stmt = null;
         try {
             stmt = con.createStatement();
         } catch (SQLException ex) {
             Logger.getLogger(JavaApplication31.class.getName()).log(Level.SEVERE, null, ex);
         }
      String query = "select * from test";
      ResultSet rs = null;
         try {
             rs = stmt.executeQuery(query);
         } catch (SQLException ex) {
             Logger.getLogger(JavaApplication31.class.getName()).log(Level.SEVERE, null, ex);
         }
      System.out.println("Id Name    Desc");
      
         try {
             while (rs.next()) {
                 int id = rs.getInt("id");
                 String name = rs.getString("name");
                 String des = rs.getString("descr");
                 System.out.println(id + "  " + name+"   "+des);
             }  } catch (SQLException ex) {
             Logger.getLogger(JavaApplication31.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         
         CallableStatement cstmt = null;
try {
   String SQL = "{call GetCustomerLevel (?,?)}";
   cstmt = con.prepareCall (SQL);
   cstmt.setInt(1,104);
   
   cstmt.registerOutParameter(2, Types.VARCHAR);
                          
   cstmt.execute();
                          
   String level = cstmt.getString(2);
             
   System.out.println(level);
   
  /* String str = cstmt.getString(2);
    System.out.println(str);*/
   
}
catch (SQLException e) {
           Logger.getLogger(JavaApplication31.class.getName()).log(Level.SEVERE, null, e);

}
finally {
                try {
                    cstmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(JavaApplication31.class.getName()).log(Level.SEVERE, null, ex);
                }
}
    }
    
    
    
}
