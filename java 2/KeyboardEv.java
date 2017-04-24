/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keyboardev;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class KeyboardEv extends Application {
  public static void main(String[] args) {
    Application.launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    Group root = new Group();
    Scene scene = new Scene(root, 300, 250);

    TextField textBox = new TextField();
    textBox.setPromptText("Write here");

    textBox.setOnKeyPressed(new EventHandler<KeyEvent>() {
        public void handle(KeyEvent ke) {
            System.out.println("Key Pressed: " + ke.getText());
        }
    });

    textBox.setOnKeyReleased(new EventHandler<KeyEvent>() {
        @Override
        public void handle(KeyEvent ke) {
            System.out.println("Key Released: " + ke.getText());
        }
    });


    root.getChildren().add(textBox);
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}