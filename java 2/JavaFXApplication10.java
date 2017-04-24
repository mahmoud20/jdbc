/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication10;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Technical
 */
public class JavaFXApplication10 extends Application {
    
     RadioButton rdobase, rdosport, rdodeluxe;
  CheckBox chkextend, chkrust;
  Button btncalculate;
  Label lbltitle, lblbase, lblextra, lbltotal;
  VBox vbradio, vbcheck, vblabels;
  ToggleGroup group;
    @Override
    public void start(Stage primaryStage) {
     //make radio buttons
 rdobase=new RadioButton("Base Model $17,500");
 rdosport=new RadioButton("Sport Model $19,700");
 rdodeluxe=new RadioButton("Deluxe Model $23,100");
 //create group for radio buttons
 /*group=new ToggleGroup();
 rdobase.setToggleGroup(group);
 rdosport.setToggleGroup(group);
 rdodeluxe.setToggleGroup(group);*/
 
 
 
 //precheck 1st option
 rdobase.setSelected(true);
 //put radio buttons into vbox
 vbradio=new VBox(20, rdobase, rdosport, rdodeluxe);
 vbradio.setPadding(new Insets(10));
 
 
 
 chkextend=new CheckBox("Extended Warranty: add $500");
 chkrust=new CheckBox("Rust Undercoating: add $850");
 btncalculate=new Button("Calculate Total");
 btncalculate.setOnAction(e-> handleButtonAction(e));
 //put into vbox
 vbcheck=new VBox(20,chkextend,chkrust, btncalculate);
 vbcheck.setPadding(new Insets(10));
 

 
 lbltitle=new Label("Order Your Car Today!");
 lbltitle.setMinWidth(500);
 lbltitle.setAlignment(Pos.CENTER);
 //make column 3 labels
 lblbase=new Label("Base: \t$");
 lblextra=new Label("Extras: \t$");
 lbltotal=new Label("Total: \t$");
 lbltitle.setStyle("-fx-font-size: 36px; -fx-background-color: tan; -fx-text-fill:white;");
//add 3 labels to vbox
 vblabels=new VBox(20,lblbase, lblextra, lbltotal);
 vblabels.setPadding(new Insets(10)); 
 vblabels.setStyle("-fx-border-color: black;-fx-background-color: cornsilk;");
        
 GridPane root = new GridPane();
  //add title to top row, centered over 3 columns
  root.addRow(0, lbltitle);
  GridPane.setColumnSpan(lbltitle, 3);
  GridPane.setHalignment(lbltitle, HPos.CENTER);
  //add 2nd row of 3 vboxes
  root.addRow(1,vbradio, vbcheck, vblabels);
  //usual code - making it a 500 by 175 frame
  Scene scene = new Scene(root, 500, 175);
  primaryStage.setTitle("Car Order Form");
  primaryStage.setScene(scene);
  primaryStage.show();
    }

     private void handleButtonAction(ActionEvent event) {
    int base, extra=0, total;
    //which single radio button is selected?
    if(rdobase.isSelected()) base=17500;
    else if(rdosport.isSelected()) base=19700;
    else base=21300; //then must be third one
    //which checkbox(es) selected-if any
    if(chkrust.isSelected()) extra+=850;
    if(chkextend.isSelected()) extra+=500;
    //calculate total and display everything
    total=base+extra;
    lblbase.setText("Base: \t$" + base);
    lblextra.setText("Extras: \t$" + extra);
    lbltotal.setText("Total: \t$" + total);
 }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
