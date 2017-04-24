/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Technical
 */
public class JavaFXApplication25 extends Application {
    
    
  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    
    
     static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
     static final String DB_URL = "jdbc:mysql://localhost/classicmodels";
     static final String USER = "root";
     static final String PASS = "123456";
     static Connection conn = null;
     static Statement stmt = null;    
    
    
    
    @Override
    public void start(Stage primaryStage) {
        
    
       
        
    GridPane grid = new GridPane();
    grid.setPadding(new Insets(10, 10, 10, 10));
    grid.setMinSize(300, 300);
    grid.setVgap(5);
    grid.setHgap(5);
    


    //grid.setStyle("-fx-background-color: #D8BFD8;");
   
       
        
 try{
      
      Class.forName(JDBC_DRIVER);

      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL,USER,PASS);

      System.out.println("Creating statement...");
      stmt = conn.createStatement();
      String sql;
      sql = "SELECT * FROM customers limit 10";
      ResultSet rs = stmt.executeQuery(sql);

      //STEP 5: Extract data from result set
      int row =0;
      while(rs.next()){
         
    //   int id  = rs.getInt("customerNumber");
     //   int age = rs.getInt("age");
         String customerName = rs.getString("customerName");
    //     String last = rs.getString("last");
         
         //Display values
         System.out.print("Name: " + customerName);
       /*  System.out.print(", Age: " + age);
         System.out.print(", First: " + first);
         System.out.println(", Last: " + last);*/
         
         Text username = new Text(customerName);
        grid.add(username, 0, row);
        
        row++;
   
      }
      rs.close();
      stmt.close();
      conn.close();
   }catch(SQLException se){
      se.printStackTrace();
   }catch(Exception e){
      e.printStackTrace();
   }finally{
      try{
         if(stmt!=null)
            stmt.close();
      }catch(SQLException se2){
      }
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
        
        Scene scene = new Scene(grid, 300, 250);
        
        primaryStage.setTitle("DB results");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // connectDB();
        launch(args);
    }
    


    
}
