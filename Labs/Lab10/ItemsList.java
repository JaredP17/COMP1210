public class ItemsList {

// instance variables
   private InventoryItem[] inventory;
   private int count;
   
// constructor
   public ItemsList() {
   
      inventory = new InventoryItem[20];
      count = 0;
   }  
   
// methods
   public void addItem(InventoryItem itemIn) {
      inventory[count] = itemIn;
      count++;
   }
   
   public double calculateTotal(double electronicSurcharge) {
      double total = 0;
      
      for (int i = 0; i < count; i++) {
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicSurcharge;
         }
         
         else {
            total += inventory[i].calculateCost();
         }
      }
      
      return total;
   }
   
   public String toString() {
      String output = "All inventory:\n\n";
    
      for (int i = 0; i < count; i++) {
         output += inventory[i] + "\n";
      }
      
      return output;
   }
}