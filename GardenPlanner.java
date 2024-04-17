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
          add(PlantsButton);
    }

    // Method to open the layout planning window
    private void openLayoutPlanningWindow() {
        LayoutPlanningWindow layoutWindow = new LayoutPlanningWindow(this);
        layoutWindow.setVisible(true);
    }

    // Method to open the plant selection window
    private void openPlantSelectionWindow() {
        PlantSelectionWindow plantWindow = new PlantSelectionWindow(this);
        plantWindow.setVisible(true);
    }

    public static void main(String[] args) {
        // Set custom look and feel
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        GardenPlanner mainFrame = new GardenPlanner();
        mainFrame.setVisible(true);
    }
}