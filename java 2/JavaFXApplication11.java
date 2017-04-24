import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class JavaFXApplication11 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("Text checks");
        stage.setWidth(300);
        stage.setHeight(150);
         CheckBox cb = new CheckBox("checkBox");
         Tooltip tooltip = new Tooltip("tooltip to explain info");
        tooltip.setFont(new Font("Arial", 16));
        scene.setFill(Color.BLANCHEDALMOND);
        cb.setTooltip(tooltip);
        cb.selectedProperty().addListener(new ChangeListener<Boolean>() {
           public void changed(ObservableValue ov,
             Boolean old_val, Boolean new_val) {
             System.out.println(cb.isSelected());
          }
        });

        ((Group) scene.getRoot()).getChildren().add(cb);

        stage.setScene(scene);
        stage.show();
    }
}