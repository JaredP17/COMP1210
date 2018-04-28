public class OnlineBook extends OnlineTextItem {
// instance variables

   protected String author;

// constructor

   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }

// methods 

   public void setAuthor(String authorIn) {
      author = authorIn;
   }
   
   public String toString() {
      return name + " - " + author + ": $" + calculateCost();
   }
}