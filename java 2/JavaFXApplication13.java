import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class JavaFXApplication13 extends Application {

  //Rectangle rect = new Rectangle(150, 30);
   Label label = new Label("Hello");

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage stage) {
    Scene scene = new Scene(new Group());
    //scene.setFill(Color.GREY);
    stage.setScene(scene);
    stage.show();

    stage.setWidth(300);
    stage.setHeight(200);

  /*  label.setStyle("-fx-font: 25 arial;");
    label.setLayoutX(40);

   rect.setStroke(Color.BLUE);
    rect.setStrokeWidth(3);
    rect.setFill(Color.WHITE);*/

     String[] greetings = new String[] { "A", "B", "C", "D", "E" };
     ChoiceBox<String> cb = new ChoiceBox<String>(
        FXCollections.observableArrayList("a", "b", "c", "d", "e")
     );

    
    cb.getSelectionModel().selectedIndexProperty()
        .addListener(new ChangeListener<Number>() {
          public void changed(ObservableValue ov, Number value, Number new_value) {
         //   label.setText(greetings[new_value.intValue()]);
         label.setText("hello "+new_value.intValue());
         
          }
        });

    cb.setTooltip(new Tooltip("Select the language"));
    cb.setValue("English");
    HBox hb = new HBox();
    hb.getChildren().addAll(cb, label);
    hb.setSpacing(30);
    hb.setAlignment(Pos.CENTER);
    hb.setPadding(new Insets(10, 0, 0, 10));

    ((Group) scene.getRoot()).getChildren().add(hb);

  }
}