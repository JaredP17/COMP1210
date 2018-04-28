public class ElectronicsItem extends InventoryItem {

// instance variables
   protected double weight;
   public static final double SHIPPING_COST = 1.5;
   
// constructor
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn);
      weight = weightIn;
   }
   
// methods
   public double calculateCost() {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
}
