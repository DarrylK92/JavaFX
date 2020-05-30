package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
 
public class BasicFX extends Application {
 
   @Override
   public void start(Stage stage) {
       Group root = new Group();
       Scene scene = new Scene(root, 600, 600, Color.BLACK);
       
       Button button = new Button("OK");
       button.setLayoutX(100);
       button.setLayoutY(100);
       button.setScaleX(2);
       button.setScaleY(2);
       root.getChildren().add(button);
       
       Button button2 = new Button("TWO");
       button2.setLayoutX(5);
       button2.setLayoutY(100);
       root.getChildren().add(button2);
       
       Circle circle = new Circle();
       circle.setCenterX(200.0f);
       circle.setCenterY(200.0f);
       circle.setRadius(50.0f);
       circle.setFill(Color.GREY);
       root.getChildren().add(circle);
       
       Rectangle r = new Rectangle(300, 100, 400, 200);
       r.setX(200);
       r.setY(50);
       r.setWidth(100);
       r.setHeight(50);
       r.setFill(Color.BLUE);
       r.setArcWidth(20);
       r.setArcHeight(20);
       root.getChildren().add(r);
       
       Polygon polygon = new Polygon();
       polygon.getPoints().addAll(new Double[]{
           50.0, 20.0,
           70.0, 30.0,
           60.0, 40.0,
           40.0, 35.0,
           40.0, 25.0});
       polygon.setFill(Color.RED);
       root.getChildren().add(polygon);
       
       
       stage.setTitle("JavaFX Scene Graph Demo");
       stage.setScene(scene);
       stage.show();
       
       Stage secondStage = new Stage();
       secondStage.setTitle("Second Stage");
       secondStage.setScene(new Scene(new Button("New Stage"), 200, 250));
       secondStage.show();
   }
 
   public static void main(String[] args) {
       launch(args);
   }
}