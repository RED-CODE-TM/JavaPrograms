/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cropinventorymanager;

/**
 *
 * @author uyser
 */
import java.util.Scanner;

public class CropInventoryManager {
    private static String[] crops;
    
    private static int[] quantities;
    private static Scanner sscrop = new Scanner(System.in);

    public static void main(String[] args) {
        initializingInventory();
        displayingMenu();
    }

    private static void initializingInventory() {
        // Initialize arrays with some default values
        crops = new String[]{"MAIZE", "POTATOES", "RICE"};
        quantities = new int[]{900, 450, 300};
    }

   private static void displayingMenu() {
        int choice;
        do {
            System.out.println("\nCrop Inventory Management System");
  System.out.println("1. Add New Crop");
            System.out.println("2. Update Crop Quantity");
            System.out.println("3. View Current Inventory");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sscrop.nextInt();
            switch (choice) {
                case 1:
                    addNewCrop();
                    break;
                case 2:
                    updateCropQuant();
                    break;
                case 3:
                    viewInventory();
                    break;
                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }
   private static void addNewCrop() {
        System.out.print("Enter the name of the new crop: ");
        String newCrop = sscrop.next();
        System.out.print("Enter the quantity of " + newCrop + ": ");
        int quantity = sscrop.nextInt();

        //accepting new crop
        String[] newCrops = new String[crops.length + 1];
        int[] newQuantities = new int[quantities.length + 1];
        for (int i = 0; i < crops.length; i++) {
            newCrops[i] = crops[i];
            newQuantities[i] = quantities[i];
        }
        newCrops[crops.length] = newCrop;
        newQuantities[quantities.length] = quantity;
        crops = newCrops;
        quantities = newQuantities;

        System.out.println(newCrop + " added to inventory with quantity " + quantity);
    }