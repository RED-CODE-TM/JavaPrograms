package assignement;
import java.util.Scanner;
abstract class InventorySystem {
    private String productName;
    private double price;

    public InventorySystem(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }
    public abstract void displayDetails();
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName){
        this.productName = productName;
    }
    public double getProductPrice(){
        return price;
    }

    public void setProductPrice(double price) {
        this.price = price;
    }
      public static void main(String[] args) {
        Product electronicProduct = new Product("television", 1200.0, 101, 50);
        Product clothingProduct = new Product("skirt", 50.0, 205, 200);
        System.out.println("Current Inventory Details:"); 
        InventorySystem  obj1=new Product("shoes",14,1,12);
        obj1.displayDetails();
    }
}
class Product extends InventorySystem  {
    private int productId;
    private int StockQuantity;
    public Product(String productName, double price, int productId, int quantity) {
        super(productName, price);
        this.productId = productId;
        this.StockQuantity= quantity;
    }

    
    
        }
