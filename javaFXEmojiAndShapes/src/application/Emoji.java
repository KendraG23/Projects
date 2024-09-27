//KendraG23
/*Psuedocode
 * Create a program that will manually create a
 * smiley face emoji with glasses.
 * Shapes:
 * 		Yellow filled Circle X 1 (x,y) & Radius
 * 		Brown filled Ellipse x 2
 * 			Positioned: Starting from center move L/R along radius
 * 						and up Y, to determine center of ellipse add
 * 						radius size
 * 		Brown filled Arc X 1
 * 			Positioned: Starting from center move down Y, extend L/R
 * 						for radius Y.  Arc should open in the up direction.  Think
 * 						bottom of an ellipse/circle.
 * 		Black non-filled Circle X 2 
 * 			Positioned: Centered from the outer edge of brown filled
 * 						ellipse. Also connected with 1 black line.
 * 
 */

package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Ellipse;




public class Emoji extends Application {

	@Override
	public void start(Stage primaryStage) {
		// Create a pane to hold all elements of emoji
		Pane pane = new Pane();
		
		// Create Yellow circle which represents face of emoji
		Circle face = new Circle(100,100,50);
		face.setFill(Color.YELLOW);
		
		// Create 2 Brown circles which represent eyes of emoji
		Ellipse lefteye = new Ellipse(87.5, 80, 5, 8);
		Ellipse rightEye = new Ellipse(112.5, 80, 5, 8);
		lefteye.setFill(Color.BROWN);
		rightEye.setFill(Color.BROWN);
		
		/* Create 2 transparent circles which represent eye glass lens
		 * Group all elements into one set of eyeglasses
		 */
		Circle leftLens = new Circle (82, 80,15);
		leftLens.setStyle("-fx-stroke: black; -fx-stroke-width: 2; -fx-fill: transparent");
		
		Circle rightLens = new Circle (118, 80, 15);
		rightLens.setStyle("-fx-stroke: black; -fx-stroke-width: 2; -fx-fill: transparent");
		
		Line bridge = new Line (97, 80, 103, 80);
		bridge.setStyle("-fx-stroke: black; -fx-stroke-width: 2");
		
			Group eyeGlasses = new Group();
			eyeGlasses.getChildren().addAll(leftLens, rightLens, bridge);	
		
		// Create open upward arc for smiley face
		Arc smile = new Arc(100, 115, 12.5, 10 ,0, -180);
		smile.setType(ArcType.OPEN);
		smile.setStyle("-fx-stroke: brown; -fx-fill: transparent; -fx-stroke-width: 2");
		
		
		
		// Add elements of emoji to pane
		pane.getChildren().addAll(face, lefteye, rightEye, eyeGlasses, smile);
		
		// Create a scene and place it on stage
		Scene scene = new Scene(pane,200, 200);
		primaryStage.setTitle("Emoji");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
