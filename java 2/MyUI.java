/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyUI;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;

/**
 *
 * @author Technical
 */
public class MyUI extends Application implements EventHandler<ActionEvent>{
    Button button;
    TextField name;
    
    Button newVal;

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Title of Window");
        button = new Button();
        button.setText("Hello");
        
         newVal = new Button("Set New Val");
      
        
        name = new TextField();
        VBox vb = new VBox(9);
        vb.getChildren().addAll(name, button, newVal);

        button.setOnAction(this);
        newVal.setOnAction(this);

        StackPane layout = new StackPane();
      //  layout.getChildren().add(button);
        layout.getChildren().add(vb);
        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //When button is clicked, handle() gets called
    //Button click is an ActionEvent (also MouseEvents, TouchEvents, etc...)   
    public void handle(ActionEvent event) {
       
        if (event.getSource() == button) 
            name.setText("Maha"); 
        
        if (event.getSource() == newVal) 
            name.setText("Ali"); 
        
    }
    
    
    public static void main(String[] args) {
        launch(args);
    }
    }
   
  
   
    

