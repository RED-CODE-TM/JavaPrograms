import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GardenPlanner extends JFrame {
    // Components for the main window
    private JButton LayoutButton;
    private JButton PlantsButton;

    // Constructor
    public GardenPlanner() {
        // Set title and size
        setTitle("GreenThumb Garden Planner");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set layout
        setLayout(new FlowLayout());
       
        // Welcome message
        JLabel welcomeLabel = new JLabel("Welcome to GreenThumb Garden Planner!");
        add(welcomeLabel);
        welcomeLabel.setForeground(Color.blue);

        // Plan Layout button
       LayoutButton = new JButton("Plan Layout");
       LayoutButton.setForeground(Color.magenta);
       LayoutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openLayoutPlanningWindow();
            }
        });
        add(LayoutButton);

        // Select Plants button
        PlantsButton = new JButton("Select Plants");
        PlantsButton.setForeground(Color.magenta);
        PlantsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openPlantSelectionWindow();
            }
        });