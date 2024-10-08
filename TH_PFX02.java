package javafxtesting;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.geometry.Insets;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;


public class TH_PFX02 extends Application {
   private Label commLabel;     // Label for food cost
   private Label webLabel;      // Label for yearly salary
   private Label javaLabel;
   private Label networkLabel;
   private Label dinLabel;
   private TextField costField;
   
   private Button calcButton;   // Triggers salary calculation
   
   
   @Override
   public void start(Stage applicationStage) {
      Scene scene = null;         // Scene contains all content
      GridPane gridPane = null;   // Positions components within scene
      
      gridPane = new GridPane();   // Create an empty pane
      scene = new Scene(gridPane); // Create scene containing the grid pane
      
      // Set hourly and yearly salary
      commLabel = new Label("Introduction to E-commerce:");
      webLabel = new Label("The Future of the Web:");
      javaLabel = new Label("Advanced Java Programming");
      networkLabel = new Label("Network Security:");
      dinLabel = new Label("optional opening night dinner with a keynote speech ");

      costField =new TextField();
      costField.setEditable(false);
      costField.setPrefColumnCount(10);

      CheckBox dinBox = new CheckBox("$30");
      CheckBox commBox = new CheckBox("$295");
      CheckBox webBox = new CheckBox("$295");
      CheckBox javaBox = new CheckBox("$395");
      CheckBox netBox = new CheckBox("$395");

      RadioButton studentButton = new RadioButton("Student Registration");
      RadioButton generalButton = new RadioButton("General Registration"); 

      ToggleGroup regGroup = new ToggleGroup();
      studentButton.setToggleGroup(regGroup);
      generalButton.setToggleGroup(regGroup);

      // Create a "Calculate" button
      calcButton = new Button("Calculate");
      
      gridPane.setPadding(new Insets(10, 10, 10, 10));
      gridPane.setHgap(10);                            
      gridPane.setVgap(10);                           
      
      gridPane.add(generalButton, 0, 0);
      gridPane.add(studentButton, 1, 0);
      gridPane.add(dinLabel, 0, 6);
      gridPane.add(dinBox, 1, 6);
      gridPane.add(commLabel, 0, 2);  
      gridPane.add(commBox, 1, 2); 
      gridPane.add(webLabel, 0, 3);  
      gridPane.add(webBox, 1, 3);  
      gridPane.add(javaLabel, 0, 4);
      gridPane.add(javaBox, 1, 4);    
      gridPane.add(networkLabel, 0, 5);
      gridPane.add(netBox,1, 5 );
      
      gridPane.add(costField, 1, 7);
    

      gridPane.add(calcButton, 0, 7); 
      
      // Set an event handler to handle button presses
      calcButton.setOnAction(new EventHandler<ActionEvent>() {
         /* Method is automatically called when an event 
            occurs (e.g, button is pressed) */
         @Override
         public void handle(ActionEvent event) {

            double totalCost =  0;

            RadioButton selectedRadioButton =(RadioButton) regGroup.getSelectedToggle();
            if(selectedRadioButton  == generalButton){
                totalCost  += 895;
            }else if(selectedRadioButton == studentButton){
                totalCost += 495;
            }
            if(dinBox.isSelected()){
                totalCost += 30;
            }


            if(commBox.isSelected()){
                totalCost += 295;
            }
            if(webBox.isSelected()){
                totalCost += 295;
            }          
            if(javaBox.isSelected()){
                totalCost += 395;
            }
            if(netBox.isSelected()){
                totalCost += 395;
            }

          costField.setText(String.format("$%.2f", totalCost));
            
         } 
      });

      applicationStage.setScene(scene);    // Set window's scene  
      applicationStage.setTitle("Registration"); // Set window's title
      applicationStage.show();             // Display window
   }
   
   public static void main(String [] args) {
      launch(args); // Launch application
   }
}

