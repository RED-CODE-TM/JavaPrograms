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
