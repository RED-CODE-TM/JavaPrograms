
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
        
        //1
        
        add(viewMenuButton);

       
        placeOrderButton = new Button("Place Order");
         placeOrderButton.setForeground(Color.GREEN);
        placeOrderButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openPlaceOrderWindow();
            }
        });
        add(placeOrderButton);

       
        setLocationRelativeTo(null);

       
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    
    private void openMenuWindow() {
        MenuWindow menuWindow = new MenuWindow(this);
        menuWindow.setVisible(true);
    }

  
    private void openPlaceOrderWindow() {
        PlaceOrderWindow placeOrderWindow = new PlaceOrderWindow(this);
        placeOrderWindow.setVisible(true);
    }

    public static void main(String[] args) {
       QuickFoodOrderManagement mainFrame = new QuickFoodOrderManagement();
        mainFrame.setVisible(true);
    }
}

//24  
class MenuWindow extends Frame {
    public MenuWindow(Frame parent) {
     
        setTitle("Menu");
        setSize(300, 200);

        
        setLocation(parent.getX() + parent.getWidth() / 2 - getWidth() / 2,
                parent.getY() + parent.getHeight() / 2 - getHeight() / 2);

       
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

       
        setLayout(new FlowLayout());
       // Label l5=new Label("List Of Items:");
       add(new Label("List Of Items:"));
        add(new Label("Pizza"));
        add(new Label("Burger"));
        add(new Label("Sushi"));
        

      
        Button backButton = new Button("Close");
        backButton.setForeground(Color.pink);
        backButton .setBounds(150, 100, 50, 20);
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
       
        add(backButton);
    }
}
 //3
