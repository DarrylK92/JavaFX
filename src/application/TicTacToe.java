package application;

import java.util.Random;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TicTacToe extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane pane = new GridPane();
		
		Image none = new Image("none.png");
		Image o= new Image("o.png");
		Image x = new Image("x.png");
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				//Randomize image value
				Random rand = new Random();
				int r = rand.nextInt(3);
				String image = "";
				
				//Set image to be assigned
				switch(r) {
				case 0:
					image = "none.png";
					break;
					
				case 1:
					image = "o.png";
					break;
					
				case 2:
					image = "x.png";
					break;
				}
				
				//Create imageView
				ImageView imageView = new ImageView(image);
				
				//Add to pane
				GridPane.setConstraints(imageView, i, j);
				pane.getChildren().add(imageView);
			}
		}
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Tictactoe");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
