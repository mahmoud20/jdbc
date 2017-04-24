/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Technical
 */
public class JavaFXApplication2 extends Application {
    
   
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Hello there");
        btn.setStyle("-fx-background-color: #FF0000");
        DropShadow shadow = new DropShadow();
        btn.setEffect(shadow);
        try {
            FileInputStream input = new FileInputStream("C:\\NH.jpg");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JavaFXApplication2.class.getName()).log(Level.SEVERE, null, ex);
        }

        
                
        btn.setOnAction(new EventHandler<ActionEvent>() { 
            
         
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        int x = 10;
        int y = 10;
        int red = 30;
        int green = 40;
        int blue = 50;
         Text text = new Text(x, y, "Hello");

        text.setFill(Color.rgb(red, green, blue, .99));
        text.setRotate(60);
        
        
        
        StackPane root = new StackPane();
        
    //    root.getChildren().add(text);
     //   root.getChildren().add(btn);
     
     root.getChildren().addAll(text,btn);
     root.setStyle("-fx-background-color: #87CEFA;");
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch();
    }
    
}
