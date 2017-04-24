/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mouseev;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class MouseEv extends Application {
  public static void main(String[] args) {
    Application.launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    Group root = new Group();
    Scene scene = new Scene(root, 300, 250);
    Button btn = new Button();
    btn.setText("Detect Mouse");

    btn.setOnMouseEntered(new EventHandler<MouseEvent>() {
      public void handle(MouseEvent me) {
        System.out.println("Mouse entered");
      }
    });

    btn.setOnMouseExited(new EventHandler<MouseEvent>() {
      public void handle(MouseEvent me) {
        System.out.println("Mouse exited");
      }
    });

    btn.setOnMousePressed(new EventHandler<MouseEvent>() {
      public void handle(MouseEvent me) {
        System.out.println("Mouse pressed");
      }
    });

    root.getChildren().add(btn);
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}