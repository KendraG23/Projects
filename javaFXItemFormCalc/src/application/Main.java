//KendraG23
/*Psuedocode
 *Create a program that will allow users to input item / price information
 *and calculate a final total within a form.
 *Visual Description
 *
 * -Form title "orinoco.com"
 * -Form made up of 2 columns (0 1) and 10 rows(0 1 2 3 4 5 6 7 8 9)
 * -Form made up of 1 check box location (1 3) & label title "Taxable?"
 * -Form made up of 3 radio buttons location:
 *			- (1 5) label title "$20"
 *			- (1 6) label title "$12"
 *			- (1 7) label title "$5"
 * -Form made up of 2 buttons location:
 *			- (0 9) "Process"
 *			- (1 9) "Reset"
 *
 * Calculation Process
 * "Process" button will perform calculation ON ACTION
 * 		-"Taxable" check box, IF True ADD 0.07 to Price * Quantity & store result
 * 		-"Shipping Rate" IF True ADD rate to total
 *
 * "Reset" button will clear form
 *
 * Form Template Design:
 * Item				[]
 * Price 			[]
 * Quantity			[]
 *					[]Taxable?
 * Shipping
 * Next Day		[] $20
 * This Week	[] $12
 * Some Day		[] $5
 * Total Due	$______
 * {Process}	{Reset}
 *
 */

package application;
	
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;


public class Main extends Application {
	// Create some private data fields
	 	private TextField tfItem = new TextField();
	 	private TextField tfPrice = new TextField();
	 	private TextField tfQuantity = new TextField();
	 	private CheckBox chkTaxable = new CheckBox("Taxable?");
	 	private RadioButton rbTwenty = new RadioButton("$20");
	 	private RadioButton rbTwelve = new RadioButton("$12");
	 	private RadioButton rbFive = new RadioButton("$5");
	 	private Button btProcess = new Button("Process");
	 	private Button btReset = new Button("Reset");
	 	
	// Create variables as they will be used based on the selection of check box and radio button.  Beginning values should be blank
	 	private double taxRate = 0.0;
	 	private double shippingRate = 0.0;
	 	private Label totalDueLabel = new Label(); //While this is a label object, we will treat like a variable as this amount will change per process
	 		
	// Create a grid pane and format 
	 	protected GridPane formPane(){
	 		GridPane gridPane = new GridPane();
	 		gridPane.setPadding(new Insets(5, 5, 5, 5));
	 		gridPane.setHgap(5);
	 		gridPane.setVgap(5);
	 		gridPane.add(new Label("Item"), 0, 0);
	 		gridPane.add(tfItem, 1, 0);
	 		gridPane.add(new Label("Price"), 0, 1);
	 		gridPane.add(tfPrice, 1, 1);
	 		gridPane.add(new Label("Quantity"), 0, 2);
	 		gridPane.add(tfQuantity, 1, 2);
	 		gridPane.add(chkTaxable, 1, 3);
	 		gridPane.add(new Label("Shipping"), 0, 4);
	 			
	 		gridPane.add(new Label("Next Day"), 0, 5);
	 		gridPane.add(rbTwenty, 1, 5);
	 		gridPane.add(new Label("This Week"), 0, 6);
	 		gridPane.add(rbTwelve, 1, 6);
	 		gridPane.add(new Label("Some Day"), 0, 7);
	 		gridPane.add(rbFive, 1, 7);
	 		gridPane.add(new Label("Total Due"), 0, 8);
	 		gridPane.add(totalDueLabel,1, 8);
	 		gridPane.add(btProcess, 0, 9);
	 		gridPane.add(btReset, 1, 9);
	 			
	 // Set some properties of various elements in the grid
	 		tfItem.setAlignment(Pos.BOTTOM_LEFT);
	 		tfPrice.setAlignment(Pos.BOTTOM_LEFT);
	 		tfQuantity.setAlignment(Pos.BOTTOM_LEFT);
	 		GridPane.setHalignment(btProcess, HPos.LEFT);
	 		GridPane.setHalignment(btReset, HPos.LEFT);
	 // Group radio buttons so only one can be selected at a time
	 		ToggleGroup shippingGroup = new ToggleGroup();
	 		rbTwenty.setToggleGroup(shippingGroup);
	 		rbTwelve.setToggleGroup(shippingGroup);
	 		rbFive.setToggleGroup(shippingGroup);
	 		
	 // Process event items, will reference the calculatePayment method
	 		chkTaxable.setOnAction(e -> { 
	 			if (chkTaxable.isSelected()) { 
	 				taxRate = 0.07;}
	 			else {
	 				taxRate = 0.0;
	 			}
	 		});
	 		rbTwenty.setOnAction(e ->  shippingRate = 20.0);
	 		rbTwelve.setOnAction(e -> shippingRate = 12.0);
	 		rbFive.setOnAction(e -> shippingRate = 5.0);
	 		
	 		btProcess.setOnAction(e -> calculateTotalPayment()); //Once Process button is selected call calculation method
	 		btReset.setOnAction(e -> clearForm());//Once Reset button is selected clear form and start over
	 		
	 		return gridPane;
 		}
	 			
	
	 		private void calculateTotalPayment(){
	 		// Set constants/VARIABLES that will interact with various events
		 		double price = Double.parseDouble(tfPrice.getText());
	 			int quantity = Integer.parseInt(tfQuantity.getText());
		 		
	 		// Process calculation
	 			double total = (price * quantity *(1.0 + taxRate)) + shippingRate;
	 		
	 		// Return result back to the label so amount can be displayed.
	 			totalDueLabel.setText(String.format("$%.2f", total));
	 			
	 	}
	 		private void clearForm() {
	 			// Reset all the elements of the form
	 			tfItem.setText("");
	 			tfPrice.setText("");
	 			tfQuantity.setText("");
	 			
	 			chkTaxable.setSelected(false);
	 			rbTwenty.setSelected(false);
	 			rbTwelve.setSelected(false);
	 			rbFive.setSelected(false);
	 			
	 			totalDueLabel.setText("");
	 			
	 			taxRate = 0.0;
	 			shippingRate = 0.0;
	 		}
	
	
	@Override
	public void start(Stage primaryStage) {
		Scene scene = new Scene(formPane(), 250, 300);
		primaryStage.setTitle("orinoco.com");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
