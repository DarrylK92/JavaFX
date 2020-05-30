package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
 
public class FlowPaneDemo extends Application {
 
   @Override
   public void start(Stage stage) {
	   //FlowPane
	   VBox pane = new VBox();
	   pane.setPadding(new Insets(11, 12, 13, 14));
//	   pane.setHgap(5);
//	   pane.setVgap(5);
	   
	   Label lblFName = new Label("First Name");
	   TextField txtfFName = new TextField();
	   Label lblLName = new Label("Last Name");
	   TextField txtfLName = new TextField();
	   
	   txtfFName.setMaxWidth(200);
	   txtfLName.setMaxWidth(200);
	   
//	   GridPane.setConstraints(lblFName, 0, 0);
//	   GridPane.setConstraints(txtfFName, 1, 0);
//	   GridPane.setConstraints(lblLName, 0, 1);
//	   GridPane.setConstraints(txtfLName, 1, 1);
	   
	   pane.getChildren().addAll(lblFName, txtfFName, lblLName, txtfLName);
	   //pane.getChildren().addAll(new Label("First Name"), new TextField());
	   //pane.getChildren().addAll(new Label("Last Name"), new TextField());
	   
	   //must remember these steps
       Scene scene = new Scene(pane, 800, 600, Color.BLACK);
       stage.setTitle("JavaFX Scene Graph Demo");
       stage.setScene(scene);
       stage.show();
   }
 
   public static void main(String[] args) {
       launch(args);
   }
}