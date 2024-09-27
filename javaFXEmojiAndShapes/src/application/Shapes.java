//KendraG23
//Psuedocode
/* Create a program that will display various shapes and emoji
 * Program 1
 *	- Create a rectangle object that will visually show the shape of a square
 *      + Width/Height will be equal
 *			+ Outline color is Black
 *			+ Color fill is Blue
 *      + Display location near upper left of window (0,0)
 *	- Create a circle object
 *			+ Determine center of circle(x,y) & radius
 *			+ Set stroke color to Red
 *			+ set fill color to red
 *			+ Display near the bottom right hand corner of rectangle object, visually in center.
 *	-	Create a cross that will made of a Line object
 *			+ Create two objects with (x1,y1)&(x2,y2) for EACH 
 *			+ setstrokewidth to show density of line
 *			+ setcolor of line to Green
 * All object should be added to getChildern() method as this mimics properties of an ArrayList
 * Display all objects once complete with code
 *Stage Title = "Shapes in Grid"
 */


package application;
	
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;




public class Shapes extends Application {
	@Override
	public void start(Stage primaryStage) {
		// Create a Square and set its properties
		Rectangle blueSquare = new Rectangle(0,0,100,100);
		blueSquare.setStroke(Color.BLACK);
		blueSquare.setFill(Color.BLUE);
		
		// Create a circle and set its properties
		Circle circle = new Circle();
		circle.setCenterX(210);
		circle.setCenterY(210);
		circle.setRadius(50);
		circle.setStroke(Color.RED);
		circle.setFill(Color.RED);
		
		// Create a cross w/ two Lines
		Line line1 = new Line(50,50,50,150);
		line1.setStrokeWidth(5);
		line1.setStroke(Color.GREEN);
		Line line2 = new Line(30,100,70,100);
		line2.setStrokeWidth(5);
		line2.setStroke(Color.GREEN);
		
		// Create a pane (container) to hold all the shapes
		GridPane pane = new GridPane();
		pane.setPadding(new Insets(15,15,15,15));
		pane.setHgap(20);
		pane.setVgap(20);
		pane.setStyle("-fx-border-color: red");
		// Add square to pane in upper left corner
		pane.add(blueSquare, 0,0);
		GridPane.setHalignment(blueSquare, HPos.CENTER);
		GridPane.setValignment(blueSquare, VPos.CENTER);
		// Add circle to pane in center
		pane.add(circle, 1, 1);
		GridPane.setHalignment(circle, HPos.CENTER);
		GridPane.setValignment(circle, VPos.CENTER);
		
		// Add cross to pane in bottom right corner
		pane.add(line1, 2, 2);
		pane.add(line2, 2, 2);
		
		
		
		// Create a scene to hold the pane and place on stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Shapes in Grid");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
