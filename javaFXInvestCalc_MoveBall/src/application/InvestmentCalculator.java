//KendraG23
/*Psuedocode
 * Create an investment calculator that will accept user input
 * and perform a defined calculation based on inputs
 * 2 Columns X 5 Rows
 * Cells 01,02,03,04 will be description labels, aligned left
 * Cells 11,12,13,14 will be text fields, aligned right
 * 		- Cell 13 double value type
 * 		- Cell 14 formating should be $%.2f
 * Button located at Cell 15 will perform the below calculation
 * and return result to 14 text field
 * 		- Cell 14 = Cell 11 * (1 + (Cell 13 / 12 months))^ Cell 12 * 12
 * TEMPLATE
 * [Interest Amount:]      [  ]
 * [Number of Years:]	   [  ]
 * [Annual Interest Rate:] [  ]
 * [Future Value:]         [  ]
 * 						   [Button]
 */

package application;
	
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;


public class InvestmentCalculator extends Application {
	// Create new Control objects of the TextField type.  Important to be referenced during
	// calculation process
	private TextField tfInvestmentAmount = new TextField();
	private TextField tfNumberOfYears = new TextField();
	private TextField tfAnnualRate = new TextField();
	private TextField tfFutureValue = new TextField();
	private Button btCalculate = new Button("Calculate");
	
	@Override
	public void start(Stage primaryStage) {
	// Create GUI (Graphical User Interface aka Visual design)
	// Create a grid type layout comprised of 2 columns and 5 rows.  
	GridPane gridPane = new GridPane();
		//{Blank space between objects}
		gridPane.setHgap(5);
		gridPane.setVgap(5);
			// Add label descriptions and private text fields to desired locations of grid
			gridPane.add(new Label("Investment Amount:"), 0, 0);
			gridPane.add(tfInvestmentAmount, 1, 0);
			gridPane.add(new Label("Number of Years:"), 0, 1);
			gridPane.add(tfNumberOfYears, 1, 1);
			gridPane.add(new Label("Annual Interest Rate:"), 0, 2);
			gridPane.add(tfAnnualRate, 1, 2);
			gridPane.add(new Label("Future Value:"), 0, 3);
			gridPane.add(tfFutureValue, 1, 3);
			gridPane.add(btCalculate, 1, 4);
	
			// Set the properties of the GUI
			gridPane.setAlignment(Pos.CENTER);
			tfInvestmentAmount.setAlignment(Pos.BOTTOM_RIGHT);
			tfNumberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
			tfAnnualRate.setAlignment(Pos.BOTTOM_RIGHT);
			tfFutureValue.setAlignment(Pos.BOTTOM_RIGHT);
			tfFutureValue.setEditable(false); // Protect the final result from users adjusting result
			GridPane.setHalignment(btCalculate, HPos.RIGHT);
			
			// Once button is clicked perform calculation action
			btCalculate.setOnAction(e -> calculateFutureValue());
			
			// Lets set the scene and place on stage
			
			Scene scene = new Scene(gridPane, 400, 250);
			primaryStage.setTitle("Investment Calculator");
			primaryStage.setScene(scene);
			primaryStage.show();
			
	}
	
	private void calculateFutureValue() {
		// Get the values from text fields to use in calculation
		double investmentAmount = Double.parseDouble(tfInvestmentAmount.getText());
		double monthlyInterestRate = Double.parseDouble(tfAnnualRate.getText())/100/12; // Convert % to decimal then monthly
		int years = Integer.parseInt(tfNumberOfYears.getText());
		
		double futureValueResult = investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
		
		tfFutureValue.setText(String.format("$%,.2f", futureValueResult));
	}

	public static void main(String[] args) {
		launch(args);
	}
}
