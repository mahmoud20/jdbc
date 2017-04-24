/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication5;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Technical
 */
public class JavaFXApplication5 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
//        Button btn = new Button();
//        btn.setText("Say 'Hello World'");
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//            
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("Hello World!");
//            }
//        });
        
//        StackPane root = new StackPane();
//        root.getChildren().add(btn);
        
       // Scene scene = new Scene(root, 300, 250);
       
       GridPane grid = new GridPane();
grid.setPadding(new Insets(10, 10, 10, 10));
grid.setMinSize(300, 300);
grid.setVgap(5);
grid.setHgap(5);
Text username = new Text("Username:");
//grid.add(username, 0, 0);
   HBox g2 = new HBox(8); // spacing = 8
                         Text t2 = new Text ("fff");
                          Text t = new Text ("aaa");
                           g2.getChildren().add(t);
                           g2.getChildren().add(t2);
                          
                          
                          
grid.add(g2, 0, 0);

TextField text = new TextField();
//text.setPrefColumnCount(10);
grid.add(text, 1, 0);
Text password = new Text("Password:");
grid.add(password, 0, 1);
//TextField text2 = new TextField();
Button btn = new Button("My color");
TextField pval = new TextField();


/*FlowPane flow = new FlowPane();
flow.setPadding(new Insets(10, 10, 10, 10));
flow.setStyle("-fx-background-color: DAE6F3;");
flow.setHgap(5);
flow.getChildren().addAll(btn, password,pval);*/
//text2.setPrefColumnCount(10);
//grid.add(btn, 1, 1);
//grid.setStyle("-fx-background-color: #D8BFD8;");
//Scene scene = new Scene(grid, 300, 250);

StackPane sp = new StackPane();


 AnchorPane anchorpane = new AnchorPane();
Button buttonSave = new Button("Save");
Button buttonCancel = new Button("Cancel");
anchorpane.setStyle("-fx-background-color: #A9A9A9;");
HBox hb = new HBox();
hb.getChildren().addAll(buttonSave, buttonCancel);
anchorpane.getChildren().addAll(hb);
anchorpane.setMinSize(300, 100);
AnchorPane.setRightAnchor(hb, 30.0);

//AnchorPane.setTopAnchor(grid, Double.NaN);

Scene scene = new Scene(anchorpane, 300, 250);


 /*BorderPane bpane = new BorderPane();
bpane.setLeft(anchorpane);
bpane.setCenter(sp);
bpane.setRight(grid);
bpane.setTop(sp);
bpane.setBottom(sp);
Scene scene = new Scene(bpane, 300, 250);
*/
Scene scene2 = new Scene(sp, 300, 250);
       btn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                 // System.out.println("Hello World!");
                  grid.setStyle("-fx-background-color: #D8BFD8;");
                  //password.setStyle("-fx-color: rgb(255,0,0);");
                          password.setFill(Color.rgb(255, 0, 0, .99));
                         HBox g = new HBox(8); // spacing = 8
                         Text t2 = new Text ("fff");
                          Text t = new Text (pval.getText());
                           g.getChildren().add(t);
                           g.getChildren().add(t2);
                          sp.getChildren().add(g);
                          primaryStage.setScene(scene2);
                          primaryStage.show();    



                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
           
           });
/*TilePane tile = new TilePane();
tile.setPadding(new Insets(10, 10, 10, 10));
//tile.setPrefColumns(2);
tile.setStyle("-fx-background-color: #CD5C5C;");
HBox hbox2 = new HBox(8); // spacing = 8
Text password2 = new Text("Password:");
Text password3= new Text("Password:");
Text password4 = new Text("Password:");
Text password5 = new Text("Password:");
hbox2.getChildren().addAll(btn, password, password2,password3, password4,password5);
tile.getChildren().add(hbox2);
        Scene scene = new Scene(tile, 500, 500);*/
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setResizable(false);
       /* try {
            TimeUnit.SECONDS.sleep(7);
        } catch (InterruptedException ex) {
            Logger.getLogger(JavaFXApplication5.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        primaryStage.close();*/
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

   
    
}
