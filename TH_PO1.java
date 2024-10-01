import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TH_PO1 extends JFrame implements ActionListener {

    private JLabel dormLabel;
    private JLabel mealPlanLabel;
    private JComboBox<String> dormBox;
    private JComboBox<String> mealBox;
    private JButton calcButton;
    private JTextField totalCost;

    // Dormitory and Meal Plan Options with costs
    String[] dormArray = {"Allen Hall ($1500)", "Pike Hall ($1600)", "Farthing Hall ($1200)", "University Suites ($1800)"};
    String[] mealArray = {"7 meals per week ($560)", "14 meals per semester ($1095)", "Unlimited meals ($51,500)"};

    public TH_PO1() {
        // Initialize components
        dormLabel = new JLabel("Select Dormitory");
        mealPlanLabel = new JLabel("Select Meal Plan");
        dormBox = new JComboBox<>(dormArray);
        mealBox = new JComboBox<>(mealArray);
        calcButton = new JButton("Total Cost$:");
        totalCost = new JTextField(10); // Set a preferred width for the text field
        totalCost.setEditable(false); // User cannot edit the total cost directly

        // Add action listener to the button
        calcButton.addActionListener(this);

        // Set layout and constraints
        setLayout(new GridBagLayout());
        GridBagConstraints layoutConst = new GridBagConstraints();

        setTitle("Cost of Semester");

        // Add Dormitory Label
        layoutConst.insets = new Insets(10, 10, 10, 1);
        layoutConst.anchor = GridBagConstraints.LINE_END;
        layoutConst.gridx = 0;
        layoutConst.gridy = 0;
        add(dormLabel, layoutConst);

        // Add Dormitory ComboBox
        layoutConst = new GridBagConstraints();
        layoutConst.insets = new Insets(10, 10, 10, 10);
        layoutConst.anchor = GridBagConstraints.LINE_START;
        layoutConst.gridx = 1;
        layoutConst.gridy = 0;
        add(dormBox, layoutConst);

        // Add Meal Plan Label
        layoutConst = new GridBagConstraints();
        layoutConst.insets = new Insets(10, 10, 10, 1);
        layoutConst.anchor = GridBagConstraints.LINE_END;
        layoutConst.gridx = 0;
        layoutConst.gridy = 1;
        add(mealPlanLabel, layoutConst);

        // Add Meal Plan ComboBox
        layoutConst = new GridBagConstraints();
        layoutConst.insets = new Insets(10, 10, 10, 10);
        layoutConst.anchor = GridBagConstraints.LINE_START;
        layoutConst.gridx = 1;
        layoutConst.gridy = 1;
        add(mealBox, layoutConst);

        // Add Calculate Button
        layoutConst = new GridBagConstraints();
        layoutConst.insets = new Insets(10, 10, 10, 10);
        layoutConst.gridx = 0;
        layoutConst.gridy = 2;
        add(calcButton, layoutConst);

        // Add Total Cost TextField
        layoutConst = new GridBagConstraints();
        layoutConst.insets = new Insets(10, 10, 10, 10);
        layoutConst.gridx = 1;
        layoutConst.gridy = 2;
        add(totalCost, layoutConst);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle the calculation logic when the button is pressed
        int dormCost = 0;
        int mealCost = 0;

        // Get the selected dormitory cost
        String selectedDorm = (String) dormBox.getSelectedItem();
        if (selectedDorm.contains("1500")) {
            dormCost = 1500;
        } else if (selectedDorm.contains("1600")) {
            dormCost = 1600;
        } else if (selectedDorm.contains("1200")) {
            dormCost = 1200;
        } else if (selectedDorm.contains("1800")) {
            dormCost = 1800;
        }

        // Get the selected meal plan cost
        String selectedMeal = (String) mealBox.getSelectedItem();
        if (selectedMeal.contains("560")) {
            mealCost = 560;
        } else if (selectedMeal.contains("1095")) {
            mealCost = 1095;
        } else if (selectedMeal.contains("51,500")) {
            mealCost = 51500;
        }

        // Calculate total cost
        int total = dormCost + mealCost;

        // Display total cost
        totalCost.setText("$" + total);
    }

    public static void main(String[] args) {
        TH_PO1 tuitionFrame = new TH_PO1();
        tuitionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tuitionFrame.pack();
        tuitionFrame.setVisible(true);
    }
}