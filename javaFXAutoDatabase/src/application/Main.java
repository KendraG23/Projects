/*KendraG23
 * Psuedocode
 * Create a GUI that will allow users to retrieve data from product table within database example. 
 * GUI should have 4 drop down menus, a price range slider, check box options, and a display area.
 * 
 */
package application;
	
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.Slider;
import javafx.scene.control.TitledPane;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javafx.scene.layout.*;




public class Main extends Application {
	// Create control items for executing queries
	private ListView<String> lvMake;
	private ListView<String> lvModel;
	private ListView<String> lvYear;
	private ListView<String> lvColor;
	private TitledPane makePane;
	private TitledPane modelPane;
	private TitledPane yearPane;
	private TitledPane colorPane;
	
	private Slider priceSlider;
	private Label priceLabel;
	
	private CheckBox chkMake;
	private CheckBox chkModel;
	private CheckBox chkYear;
	private CheckBox chkColor;
	private CheckBox chkPrice;
	
	
	private Button btSearch;;
	
	private VBox resultsBox;
	private Connection connection;
	
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Cars for Sale");
		
											// Establish a database connection
		initializeDB();
		
											/*Add some data options for each listview category
											 *Each listview will have the ability to collapse and
											 *associated title name. 
											 */
		lvMake = createListView("Vehicle Make",  
				"Bugatti", 
				"Buick", 
				"Cadillac",
				"Chevrolet",
				"MC");
		makePane = createCollapsibleTitlePane("Select Make", lvMake);
		
		lvModel = createListView("Vehicle Model",
				"Camaro SS",
				"CTS-V Coupe",
				"Enclave",
				"Escalade",
				"Lacrosse",
				"Malibu",
				"Spark",
				"Terrain",
				"Veyron",
				"Volt");
		modelPane = createCollapsibleTitlePane("Select Model", lvModel);
		
		lvYear = createListView("Year", "2012", "2013");
		yearPane = createCollapsibleTitlePane("Select Year", lvYear);
		
		lvColor = createListView("Color",
				"Black", 
				"Blue", 
				"Green", 
				"Red", 
				"Silver", 
				"White", 
				"Yellow");
		colorPane = createCollapsibleTitlePane("Select Color", lvColor);
											/*Create a price range slider and label 
											 *Show tick marks and labels
											 */
		priceSlider = new Slider(14000, 1900000, 100000);
		priceLabel = new Label("Price Range: ");
		priceSlider.setShowTickLabels(true);
		priceSlider.setShowTickMarks(true);
		priceSlider.setMajorTickUnit(100000);
		
											/*Create button which will have an call to action
											 * to process the items selected and display the results
											 */
		btSearch = new Button("Search");
		btSearch.setOnAction(e -> searchTable());
		
		// Display properties of GUI.  Format used will be a GridPane
		resultsBox = new VBox(10);
		resultsBox.setPrefWidth(600);
		
		
		Label instructions = new Label("Hold CTRL to select multiple options");
		instructions.setStyle("-fx-font-weight: bold");
		
		chkMake = new CheckBox("Make");
		chkModel = new CheckBox("Model");
		chkYear = new CheckBox("Year");
		chkColor = new CheckBox("Color");
		chkPrice = new CheckBox("Price");
		
		GridPane gridPane = new GridPane();
		gridPane.setPadding(new Insets(10));
		gridPane.setVgap(10);;
		gridPane.setHgap(10);
		
		gridPane.add(instructions, 0, 0);
		gridPane.add(makePane, 0, 1);
		gridPane.add(modelPane, 1, 1);
		gridPane.add(yearPane, 2, 1);
		gridPane.add(colorPane, 3, 1);
        gridPane.add(priceLabel, 0, 2);
        gridPane.add(priceSlider, 1, 2);
        gridPane.add(new Label("Order By"), 0, 3);
        gridPane.add(chkMake, 1, 3);
        gridPane.add(chkModel, 2, 3);
        gridPane.add(chkYear, 3, 3);
        gridPane.add(chkColor, 4, 3);
        gridPane.add(chkPrice, 5, 3);
        gridPane.add(btSearch, 0, 4, 2, 1);
        gridPane.add(resultsBox, 0, 5, 2, 1);

        primaryStage.setScene(new Scene(gridPane, 600, 400));
        primaryStage.show();
	}
	
	private void searchTable() {
		/* Method will extract data from each ListView/Slider 
		 * and use a prepared statement to process query.
		 */
		// Get the selected item(s) and add to variable of type List and double.
		List<String> selectedMakes = getSelectedItems(lvMake);
		List<String> selectedModels = getSelectedItems(lvModel);
		List<String> selectedYears = getSelectedItems(lvYear);
		List<String> selectedColors = getSelectedItems(lvColor);
		double maxPrice = priceSlider.getValue();
		
		/*Create PreparedStatement which serves as a template.  WHERE clause will check
		 * selected item is Any or one of item options.  Price will be less than or equal
		 * to the selected amount.
		 */
		try (PreparedStatement preparedStatement = connection.prepareStatement(
				"SELECT * FROM product " +
				"WHERE (? = 'Any' OR make IN(?)) " +
				"AND (? = 'Any' OR model  IN(?)) " +
				"AND (? = 'Any' OR year  IN(?)) " +
				"AND (? = 'Any' OR color  IN(?)) " +
				"AND price <= ?")){
			// Set the parameters for the preparedStatement.  
			preparedStatement.setString(1, selectedMakes.isEmpty() ? "Any" : selectedMakes.get(0));
		    preparedStatement.setString(2, String.join(",", selectedMakes));
		    preparedStatement.setString(3, selectedModels.isEmpty() ? "Any" : selectedModels.get(0));
		    preparedStatement.setString(4, String.join(",", selectedModels));
		    preparedStatement.setString(5, selectedYears.isEmpty() ? "Any" : selectedYears.get(0));
		    preparedStatement.setString(6, String.join(",", selectedYears));
		    preparedStatement.setString(7, selectedColors.isEmpty() ? "Any" : selectedColors.get(0));
		    preparedStatement.setString(8, String.join(",", selectedColors));
		    preparedStatement.setDouble(9, maxPrice);
		    
		    StringBuilder queryBuilder = new StringBuilder(preparedStatement.toString());
		    
		    //Add ORDER BY to query IF various checkboxes are selected.  Multiple can be checked.
		    if (chkMake.isSelected()) {
		    	queryBuilder.append(" ORDER BY make,");
		    }
		    if (chkModel.isSelected()) {
		    	queryBuilder.append(" ORDER BY model,");
		    }
		    if (chkYear.isSelected()) {
		    	queryBuilder.append(" ORDER BY year,");
		    }
		    if (chkColor.isSelected()) {
		    	queryBuilder.append(" ORDER BY color,");
		    }
		    if (chkPrice.isSelected()) {
		    	queryBuilder.append(" ORDER BY price,");
		    }
		    
		    if (queryBuilder.charAt(queryBuilder.length() - 1) == ',') {
		    	queryBuilder.deleteCharAt(queryBuilder.length() - 1);
		    }
		    //Take the preparedStatement and execute Query.  Add results to variable.
		    ResultSet resultSet = preparedStatement.executeQuery();
		    
		    //Iterate through the results and display in GUI
		    boolean recordsFound = false;
		    VBox resultContainer = new VBox();
		    while (resultSet.next()) {
		    	String vin = resultSet.getString("vin");  //While vin is not directly in preparedStatement, it still has access based on SELECT *
		    	String make = resultSet.getString("make");
		    	String model = resultSet.getString("model");
		    	String year = resultSet.getString("year");
		    	String color = resultSet.getString("color");
		    	String price = resultSet.getString("price");
		    	
		    	//Display the results
		    	Label resultStatus = new Label();
		    	resultStatus.setText("VIN: " + vin + " " 
		    			+ "Make: " + make + " " 
		    			+ "Model: " + model + " " 
		    			+ "Year: " + year + " "
		    			+ "Color: " + color + " "
		    			+ "Price: " + price + " ");
		    	resultContainer.getChildren().add(resultStatus);
		    	recordsFound = true;
		    }
		    if (!recordsFound) {
		    	Label resultStatus = new Label("No record(s) found, please change search requirements");
		    	resultContainer.getChildren().add(resultStatus);
		    }
		    resultsBox.getChildren().clear();
		    resultsBox.getChildren().add(resultContainer);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	private List<String> getSelectedItems(ListView<String> listView) {
		List<String> selectedItems = new ArrayList<>(listView.getSelectionModel().getSelectedItems());
		selectedItems.remove("Any");
		return selectedItems;
		
	}

	private TitledPane createCollapsibleTitlePane(String title, Node contentType) {
		// Create a TitledPane that will need a "title" and content to display
		TitledPane titledPane = new TitledPane(title, contentType);
		titledPane.setCollapsible(true);
		return titledPane;
	}

	private ListView<String> createListView(String label, String... types) {
		// Create a array list for all the options of each field in Product table
		List<String> itemList = new ArrayList<>(List.of(types));
		itemList.add(0, "Any");  //User will have the option to select Any from field.  Any represents "All Records"
		
		// Add all those items to a ListView to be returned
		ListView<String> listView = new ListView<>(FXCollections.observableArrayList(itemList));
		listView.setPrefHeight(100);
		listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		return listView;
	}

	private void initializeDB() {
		// Connect to database at desired location, user name and password.
		// Used the following link for assistance with connecting to database. 
		//https://dev.mysql.com/doc/connector-j/8.1/en/connector-j-usagenotes-connect-drivermanager.html
		try {
			System.out.println("Attempting to connect to the database...");
	        connection = DriverManager.getConnection("jdbc:mysql://localhost/example", "root", "824Mejnl64*130");
	        System.out.println("You are connected to the database");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
