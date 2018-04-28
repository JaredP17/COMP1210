public abstract class OnlineTextItem extends InventoryItem {
// constructor
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   }

// methods
   public double calculateCost() {
      return price;
   }
}