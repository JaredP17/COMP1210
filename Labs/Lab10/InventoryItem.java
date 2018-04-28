/**
 * For this assignment, you will need to create a class called 
 * InventoryItem that represents an inventory item in a store.
 *
 * @author Jared R. Porter
 * @version 10/31/2016
 */
public class InventoryItem {

// instance variables
   protected String name;
   protected double price;
   private static double taxRate = 0;

// constructor

/**
 * InventoryItem constructor.
 * @param nameIn sets name
 * @param priceIn sets price
 */
   public InventoryItem(String nameIn, double priceIn) {
   
      name = nameIn;
      price = priceIn;
   }
   
// methods

   public String getName() {
      return name;
   }

   public double calculateCost() {
      return price * (1 + taxRate);
   }
   
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }
   
   public String toString() {
   
      return name + ": $" + calculateCost();
   }
}