/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Product;

/**
 *
 * @author uyser
 */
public abstract class Item {
    private String productName;
    private double price;

    // Constructor
    public Item(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    // Abstract method
    public abstract void displayDetails();
}