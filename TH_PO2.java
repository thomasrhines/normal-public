import  javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class TH_PO2 extends JFrame implements ActionListener  {
    private JFormattedTextField numDays;
    private JFormattedTextField costAirfare;
    private JFormattedTextField rentalFee;
    private JFormattedTextField milesDriven;
    private JFormattedTextField parkingFee;
    private JFormattedTextField taxiCharges;
    private JFormattedTextField seminarFee;
    private JFormattedTextField lodgingCosts;

    private JTextField totalCosts;
    private JTextField expensesCosts;
    private JTextField paidCosts;
    private JTextField moneySaved;

    private JButton calcButton;
    private JLabel dayLabel;
    private JLabel airLabel;
    private JLabel rentalLabel;
    private JLabel milesLabel;
    private JLabel parkingLabel;
    private JLabel taxiLabel;
    private JLabel seminarLabel;
    private JLabel lodgingLabel;
    private JLabel reimburseLabel;
    private JLabel mustPayLabel;
    private JLabel moneySavedLabel;
    private JLabel totalLabel;

    TH_PO2(){

        GridBagConstraints layoutConst = null;
        //create the needed labels to guide the user
        setTitle("Total Cost of Trip");
        dayLabel = new JLabel("Number of days on the trip");
        airLabel = new JLabel("Amount of airfare if any");
        rentalLabel = new JLabel("Amount of car rental fees if any");
        milesLabel = new JLabel("Number of miles driven if a private vehicle was used");
        parkingLabel = new JLabel("Amount of parking fees if any");
        taxiLabel = new JLabel("Amount of taxi charges if any");
        seminarLabel = new JLabel("Conference or seminar registration fees if any");
        lodgingLabel = new JLabel("Lodging charges, per night");
        reimburseLabel = new JLabel("Total allowable expenses for the trip");
        mustPayLabel = new JLabel("The excess that must be paid by the businessperson, if any");
        moneySavedLabel = new JLabel("The amount saved by the businessperson if the expenses are under the total allowed");
        totalLabel = new JLabel("Total expenses:");
        //create the claculate button
        calcButton = new JButton("Calculate Costs");
        calcButton.addActionListener(this);
        
        //create and format the needed textfields to corresond with the labels
        totalCosts = new JTextField(20);
        totalCosts.setEditable(false);

        expensesCosts = new JTextField(20);
        expensesCosts.setEditable(false);

        paidCosts = new JTextField(20);
        paidCosts.setEditable(false);

        moneySaved = new JTextField(20);
        moneySaved.setEditable(false);


        numDays = new JFormattedTextField(NumberFormat.getNumberInstance());
        numDays.setEditable(true);
        numDays.setText("");
        numDays.setColumns(15);

        costAirfare = new JFormattedTextField(NumberFormat.getNumberInstance());
        costAirfare.setEditable(true);
        costAirfare.setText("");
        costAirfare.setColumns(15);

        rentalFee = new JFormattedTextField(NumberFormat.getNumberInstance());
        rentalFee.setEditable(true);
        rentalFee.setText("");
        rentalFee.setColumns(15);

        milesDriven = new JFormattedTextField(NumberFormat.getNumberInstance());
        milesDriven.setEditable(true);
        milesDriven.setText("");
        milesDriven.setColumns(15);

        parkingFee = new JFormattedTextField(NumberFormat.getNumberInstance());
        parkingFee.setEditable(true);
        parkingFee.setText("");
        parkingFee.setColumns(15);

        taxiCharges = new JFormattedTextField(NumberFormat.getNumberInstance());
        taxiCharges.setEditable(true);
        taxiCharges.setText("");
        taxiCharges.setColumns(15);

        seminarFee  = new JFormattedTextField(NumberFormat.getNumberInstance());
        seminarFee.setEditable(true);
        seminarFee.setText("");
        seminarFee.setColumns(15);

        lodgingCosts = new JFormattedTextField(NumberFormat.getNumberInstance());
        lodgingCosts.setEditable(true);
        lodgingCosts.setText("");
        lodgingCosts.setColumns(15);

        //using the gridbaglayout to position components
        setLayout(new GridBagLayout());
        //adding labels
        layoutConst = new GridBagConstraints();
        layoutConst.insets =  new Insets(10, 10, 10, 10);
        layoutConst.gridx = 0;
        layoutConst.gridy = 0;
        add(dayLabel, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets =  new Insets(10, 10, 10, 10);
        layoutConst.gridx = 0;
        layoutConst.gridy = 1;
        add(airLabel, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets =  new Insets(10, 10, 10, 10);
        layoutConst.gridx = 0;
        layoutConst.gridy = 2;
        add(rentalLabel, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets =  new Insets(10, 10, 10, 10);
        layoutConst.gridx = 0;
        layoutConst.gridy = 3;
        add(milesLabel, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets =  new Insets(10, 10, 10, 10);
        layoutConst.gridx = 0;
        layoutConst.gridy = 4;
        add(parkingLabel, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets =  new Insets(10, 10, 10, 10);
        layoutConst.gridx = 0;
        layoutConst.gridy = 5;
        add(taxiLabel, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets =  new Insets(10, 10, 10, 10);
        layoutConst.gridx = 0;
        layoutConst.gridy = 6;
        add(seminarLabel, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets =  new Insets(10, 10, 10, 10);
        layoutConst.gridx = 0;
        layoutConst.gridy = 7;
        add(lodgingLabel, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets =  new Insets(10, 10, 10, 10);
        layoutConst.gridx = 0;
        layoutConst.gridy = 8;
        add(totalLabel, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets =  new Insets(10, 10, 10, 10);
        layoutConst.gridx = 0;
        layoutConst.gridy = 9;
        add(reimburseLabel, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets =  new Insets(10, 10, 10, 10);
        layoutConst.gridx = 0;
        layoutConst.gridy = 10;
        add(mustPayLabel, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets =  new Insets(10, 10, 10, 10);
        layoutConst.gridx = 0;
        layoutConst.gridy = 11;
        add(moneySavedLabel, layoutConst);



        
        // adding the formatted textfields

        layoutConst = new GridBagConstraints();
        layoutConst.insets =  new Insets(10, 10, 10, 10);
        layoutConst.gridx = 2;
        layoutConst.gridy = 0;
        add(numDays, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets =  new Insets(10, 10, 10, 10);
        layoutConst.gridx = 2;
        layoutConst.gridy = 1;
        add(costAirfare, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets =  new Insets(10, 10, 10, 10);
        layoutConst.gridx = 2;
        layoutConst.gridy = 2;
        add(rentalFee, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets =  new Insets(10, 10, 10, 10);
        layoutConst.gridx = 2;
        layoutConst.gridy = 3;
        add(milesDriven, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets =  new Insets(10, 10, 10, 10);
        layoutConst.gridx = 2;
        layoutConst.gridy = 4;
        add(parkingFee, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets =  new Insets(10, 10, 10, 10);
        layoutConst.gridx = 2;
        layoutConst.gridy = 5;
        add(taxiCharges, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets =  new Insets(10, 10, 10, 10);
        layoutConst.gridx = 2;
        layoutConst.gridy = 6;
        add(seminarFee, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets =  new Insets(10, 10, 10, 10);
        layoutConst.gridx = 2;
        layoutConst.gridy = 7;
        add(lodgingCosts, layoutConst);
        //adding the calculate button
        layoutConst = new GridBagConstraints();
        layoutConst.insets =  new Insets(10, 10, 10, 10);
        layoutConst.gridx = 1;
        layoutConst.gridy = 13;
        add(calcButton, layoutConst);
        //addding the totalCosts textField to display the expenses
        layoutConst = new GridBagConstraints();
        layoutConst.insets =  new Insets(10, 10, 10, 10);
        layoutConst.gridx = 2;
        layoutConst.gridy = 8;
        add(totalCosts, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets =  new Insets(10, 10, 10, 10);
        layoutConst.gridx = 2;
        layoutConst.gridy = 9;
        add(expensesCosts, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets =  new Insets(10, 10, 10, 10);
        layoutConst.gridx = 2;
        layoutConst.gridy = 10;
        add(paidCosts, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets =  new Insets(10, 10, 10, 10);
        layoutConst.gridx = 2;
        layoutConst.gridy = 11;
        add(moneySaved, layoutConst);

    }

    //use formatted fields getValue method store for calculation
    @Override
    
    public void actionPerformed(ActionEvent e) {
        double day = ((Number) numDays.getValue()).doubleValue();
        double air = ((Number) costAirfare.getValue()).doubleValue();
        double rental = ((Number) rentalFee.getValue()).doubleValue();
        double miles = ((Number) milesDriven.getValue()).doubleValue();
        double parking = ((Number) parkingFee.getValue()).doubleValue();
        double taxi = ((Number) taxiCharges.getValue()).doubleValue();
        double seminar = ((Number) seminarFee.getValue()).doubleValue();
        double lodging = ((Number) lodgingCosts.getValue()).doubleValue();
        //calculates the reimbursement and max cost
        double allowableParking = Math.min(parking, day * 10);
        double allowableTaxi = Math.min(taxi, day * 20);
        double allowableLodge = Math.min(lodging, day * 95.40);
        double allowableMeals = day * 37;

        double reimbursementCost = (allowableParking + allowableLodge + allowableMeals + allowableTaxi + (miles * 0.27));
        double maxCost = (air + rental + (miles * 0.27) + parking + taxi + seminar +  (lodging * day));           

        
        if (maxCost > reimbursementCost){
                totalCosts.setText(Double.toString(maxCost));
                expensesCosts.setText(Double.toString(reimbursementCost));
                paidCosts.setText(Double.toString(maxCost - reimbursementCost));
                
            }
        if(reimbursementCost > maxCost){
                totalCosts.setText(Double.toString(maxCost));
                expensesCosts.setText(Double.toString(reimbursementCost));
                paidCosts.setText(Double.toString(maxCost - reimbursementCost));
                moneySaved.setText(Double.toString(reimbursementCost - maxCost));
            }
          
         if(day < 0 || air < 0 || rental < 0 || miles < 0 || parking < 0 || taxi < 0 || seminar < 0 || lodging < 0){
            JOptionPane.showMessageDialog(this, "Please fill out all fields with a positive number!");
         } 
    
         
         
  }
    //creates frame, enables visibility, automatic sizing, and exit operation
     public static void main(String[] args){
        TH_PO2 tripFrame  =new TH_PO2();
        tripFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tripFrame.pack();
        tripFrame.setVisible(true);
    } 
}
