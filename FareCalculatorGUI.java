
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FareCalculatorGUI {
    public static void main(String[] args) {

        // Create one fixed boda-boda object
        BodaBoda bike =
            new BodaBoda("UBB123X", "Nakato Faith", 1500);

        JFrame frame = new JFrame("BodaBoda Fare Calculator");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel distanceLabel =
            new JLabel("Enter distance in km:");

        JTextField distanceField = new JTextField(10);

        JButton calculateButton = new JButton("Calculate Fare");

        JLabel resultLabel = new JLabel("Fare will appear here.");

        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double distance = Double.parseDouble(
                        distanceField.getText()
                    );

                    if (distance < 0) {
                        resultLabel.setText(
                            "Distance cannot be negative."
                        );
                    } else {
                        double fare = bike.computeFare(distance);

                        resultLabel.setText(
                            "Total fare: UGX " + fare
                        );
                    }
                } catch (NumberFormatException ex) {
                    resultLabel.setText(
                        "Please enter a valid number."
                    );
                }
            }
        });

        frame.add(distanceLabel);
        frame.add(distanceField);
        frame.add(calculateButton);
        frame.add(resultLabel);

        frame.setVisible(true);
    }
}
