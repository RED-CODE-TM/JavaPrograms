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
// Layout planning window class
class LayoutPlanningWindow extends JFrame {
    // Components
    private JTextField lengthField;
    private JTextField widthField;

    public LayoutPlanningWindow(JFrame parent) {
        // Set title and size
        setTitle("Plan Layout");
        setSize(300, 200);

        // Set layout
        setLayout(new FlowLayout());

        // Label and text fields for dimensions
        JLabel lengthLabel = new JLabel("Length:");
        add(lengthLabel);
        lengthField = new JTextField(10);
        lengthLabel.setForeground(Color.blue);
        add(lengthField);

        JLabel widthLabel = new JLabel("Width:");
        add(widthLabel);
        widthField = new JTextField(10);
        widthLabel.setForeground(Color.blue);
        add(widthField);
        // Draw Layout button
        JButton drawLayoutButton = new JButton("Draw Layout");
        drawLayoutButton.setForeground(Color.magenta);
        drawLayoutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int length = Integer.parseInt(lengthField.getText());
                int width = Integer.parseInt(widthField.getText());

                // Simulate drawing layout
                JOptionPane.showMessageDialog(null, "Layout drawn with dimensions: " + length + " x " + width);
            }
        });
         add(drawLayoutButton);

        // Back button
        JButton backButton = new JButton("Close");
        backButton.setForeground(Color.magenta);
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        add(backButton);

        // Center the window relative to the parent
        setLocationRelativeTo(parent);
    }
}

// Plant selection window class
class PlantSelectionWindow extends JFrame {
    // Components
    private JComboBox<String> plantList;

    public PlantSelectionWindow(JFrame parent) {
        // Set title and size
        setTitle("Select Plants");
        setSize(300, 200);

        // Set layout
        setLayout(new FlowLayout());

        // Plant list
        String[] plants = {"Tomato", "Cucumber", "Roses", "Lavender", "Sunflower"};
        plantList = new JComboBox<>(plants);
        plantList.setForeground(Color.BLUE);
        add(plantList);
         // Add to Garden button
        JButton addToGardenButton = new JButton("Add to Garden");
        addToGardenButton.setForeground(Color.magenta);
        addToGardenButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedPlant = (String) plantList.getSelectedItem();
                JOptionPane.showMessageDialog(null, selectedPlant + " added to garden!");
            }
        });
        
        add(addToGardenButton);

        // Back button
        JButton backButton = new JButton("Close");
        backButton.setForeground(Color.magenta);
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        add(backButton);

        // Center the window relative to the parent
        setLocationRelativeTo(parent);
    }
}
