package quickfoodordermanagement;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class QuickFoodOrderManagement extends Frame {
   
    private Label welcomeLabel;
    private Button viewMenuButton;
    private Button placeOrderButton;

   
    public QuickFoodOrderManagement() {
       
        setTitle("QuickFood Order Management");
        setSize(600, 400);

      
        setLayout(new FlowLayout());

       
        welcomeLabel = new Label("Welcome to QuickFood!!");
         welcomeLabel.setForeground(Color.blue);
        add(welcomeLabel);

       
        viewMenuButton = new Button("View Menu");
         viewMenuButton.setForeground(Color.GREEN);
        viewMenuButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openMenuWindow();
            }
        });