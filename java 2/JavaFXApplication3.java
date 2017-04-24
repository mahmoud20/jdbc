/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication3;

import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Technical
 */
public class JavaFXApplication3 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       TextField btn = new TextField("");
           Button btn1= new Button("next");
           StackPane root = new StackPane();
           Scene scene1=new Scene(root, 300, 250);
              
               root.getChildren().add(btn);
                TextField name=new TextField ("");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(scene1);
                btn.setText(name.getText());
                
            }
        });
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setMinSize(300, 300);
        grid.setVgap(5);
        grid.setHgap(5);
       
        name.getText();
     
        grid.add(name, 0, 0);
         grid.add(btn1, 0, 1);
        
      
       
        
        Scene scene = new Scene(grid, 300, 250);
       
        primaryStage.setTitle("Hello World!");
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
