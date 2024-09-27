//KendraG23
/*Psuedocode
 * Create a program that moves a circle graphic contingent on buttons clicked
 * Create a Circle object located within a Pane Class
 * 		- Add attributes like color, stroke, position in center of pane
 * Create a Hbox to hold 4 buttons at bottom of pane
 * Each button must be clicked to perform action within Pane Class 
 * 		- Left Button
 * 		- Right Button
 * 		- Up Button
 * 		- Down Button
 * Button action will perform the following steps.
 * 	1. Locate Circle object on pane
 * 	2. If object is within pane boundaries move L,R,U or D
 *  3. Else do nothing until another button is selected
 */

package application;
	
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;


public class MoveTheBall extends Application {
	// Create a new circle pane to begin game
	private CirclePane circlePane = new CirclePane();


	
	@Override
	public void start(Stage primaryStage) {
	// Add 4 buttons to Hbox
	Button btLeft = new Button("Left");
	Button btRight = new Button("Right");
	Button btUp = new Button("Up");
	Button btDown = new Button("Down");
	HBox hbox = new HBox(btLeft, btRight, btUp, btDown);
	hbox.setSpacing(10);
	hbox.setAlignment(Pos.CENTER);
	
	// Place hbox elements at the bottom of pane
	BorderPane borderPane = new BorderPane();
	borderPane.setCenter(circlePane);
	borderPane.setBottom(hbox);
	BorderPane.setAlignment(hbox, Pos.CENTER);
	
	// Lets create a scene and place it on stage
	Scene scene = new Scene(borderPane, 400, 350);
	primaryStage.setTitle("Move The Ball");
	primaryStage.setScene(scene);
	primaryStage.show();
	
	// Process events
	btLeft.setOnAction(e -> circlePane.left());
	btRight.setOnAction(e -> circlePane.right());
	btUp.setOnAction(e -> circlePane.up());
	btDown.setOnAction(e -> circlePane.down());
	}
	
public class CirclePane extends StackPane {
	// Make a new circle object
	private Circle circle = new Circle(20);
	// Add circle to pane and include some features of object
	public CirclePane() {
		getChildren().add(circle);
		circle.setStyle("-fx-stroke: black; -fx-stroke-width: 2; -fx-fill: red");
	}
	public void down() {
		// If Y direction is greater than 0, move circle down 20 pixels or stop
		circle.setTranslateY((circle.getCenterY() + circle.getRadius()) <= getHeight() ? circle.getTranslateY() + 20 : 0);
		
	}
	public void up() {
		// If Y direction is greater than 0, move circle up 20 pixels or stop
		circle.setTranslateY((circle.getCenterY() + circle.getRadius()) <= getHeight() ? circle.getTranslateY() - 20 : 0);
		
	}
	public void right() {
		// If Y direction is greater than 0, move circle to the left 20 pixels or stop
		circle.setTranslateX((circle.getCenterX() + circle.getRadius()) <= getWidth() ? circle.getTranslateX() + 20 : 0);
	}
	
		
	public void left() {
		// If X direction is greater than 0, move circle to the left 20 pixels or stop
		circle.setTranslateX((circle.getCenterX() + circle.getRadius()) <= getWidth() ? circle.getTranslateX() - 20 : 0);	
	}
	
}


}
