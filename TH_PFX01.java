package javafxtesting;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.geometry.Insets;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class TH_PFX01 extends Application {
   private Label foodLabel;     // 
   private Label tipLabel;      //
   private Label taxLabel;
   private Label totalLabel;

   private TextField tipField;  // 
   private TextField foodField; // 
   private TextField taxField;
   private TextField totalField;
   private Button calcButton;   // Triggers calculation
   
   
   @Override
   public void start(Stage applicationStage) {
      Scene scene = null;         // Scene contains all content
      GridPane gridPane = null;   // Positions components within scene
      
      gridPane = new GridPane();   // Create an empty pane
      scene = new Scene(gridPane); // Create scene containing the grid pane
      
      // Set hourly and yearly salary
      foodLabel = new Label("Food Charge:");
      tipLabel = new Label("18% tip:");
      taxLabel = new Label("7% sales tax:");
      totalLabel = new Label("Total charge:");
      
      foodField = new TextField(); 
      foodField.setPrefColumnCount(15);
      foodField.setEditable(true);
      foodField.setText("0");
      
      tipField = new TextField(); 
      tipField.setPrefColumnCount(15);
      tipField.setEditable(false);

      taxField = new TextField(); 
      taxField.setPrefColumnCount(15);
      taxField.setEditable(false);

      totalField = new TextField(); 
      totalField.setPrefColumnCount(15);
      totalField.setEditable(false);
      
      // Create a "Calculate" button
      calcButton = new Button("Calculate");
      
      gridPane.setPadding(new Insets(10, 10, 10, 10)); // Padding around  grid
      gridPane.setHgap(10);                            // Spacing between columns
      gridPane.setVgap(10);                            // Spacing between rows
      
      gridPane.add(foodLabel, 0, 0);  // Add wage label to location (0, 0)
      gridPane.add(foodField, 1, 0);  // Add wage text field to location (1, 0)
      gridPane.add(tipLabel, 0, 1);   // Add salary label to location (0, 1)
      gridPane.add(tipField, 1, 1);   // Add salary text field to location (1, 1)
      gridPane.add(taxLabel, 0, 2);
      gridPane.add(taxField, 1, 2);
      gridPane.add(totalLabel, 0, 3);
      gridPane.add(totalField, 1, 3);



      gridPane.add(calcButton, 0, 5); // Add calculate button to location (0, 2)
      
      // Set an event handler to handle button presses
      calcButton.setOnAction(new EventHandler<ActionEvent>() {
         /* Method is automatically called when an event 
            occurs (e.g, button is pressed) */
         @Override
         public void handle(ActionEvent event) {
            String userInput; 
            double foodCharge;    
            double tipCharge;
            double taxCharge;
            double totalCharge;    

            // Get user's wage input and calculate yearly salary
            userInput = foodField.getText();            
            foodCharge = Double.parseDouble(userInput);
            tipCharge = foodCharge * .18;
            taxCharge = foodCharge * .07;
            totalCharge = foodCharge  + tipCharge  + taxCharge;

            // Display calculated salary
            tipField.setText(Double.toString(tipCharge));
            taxField.setText(Double.toString(taxCharge));
            totalField.setText(Double.toString(totalCharge));
         } 
      });

      applicationStage.setScene(scene);    // Set window's scene  
      applicationStage.setTitle("Total Food Charge"); // Set window's title
      applicationStage.show();             // Display window
   }
   
   public static void main(String [] args) {
      launch(args); // Launch application
   }
}