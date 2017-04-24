/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication27;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Technical
 */
public class JavaFXApplication27 extends Application {
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
    
    TextField edittext = new TextField();
    
    grid.add(edittext, 0, 0);

    Button btn  = new Button("Edit");
       
    grid.add(btn, 0, 1);
    
    try{
      
      
   //   String sql;
      
      //sql = "Update customers set customerName='Alpha Cognac 2' where customerName like 'Alpha%' ";
      
      btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
         //     String  upd = "Update customers set customerName='Alpha Cognac new' where customerName like 'Alpha%' ";
         
                try {
                  try {
                      Class.forName(JDBC_DRIVER);
                  } catch (ClassNotFoundException ex) {
                      Logger.getLogger(JavaFXApplication27.class.getName()).log(Level.SEVERE, null, ex);
                  }
                    String  upd = "Update customers set customerName='"+edittext.getText()+"' where customerName like 'Alpha%' ";

                    conn = DriverManager.getConnection(DB_URL,USER,PASS);

                    System.out.println("Creating statement...");
                    stmt = conn.createStatement();                
                    stmt.executeUpdate(upd);
                    stmt.close();
                    conn.close();
                    
                } catch (SQLException ex) {
                    Logger.getLogger(JavaFXApplication27.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
      
      
       

      
    
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
        
        primaryStage.setTitle("DB Update Record");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
