public class OnlineArticle extends OnlineTextItem {
// instance variables

   private int wordCount;

// constructor

   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      wordCount = 0;
   }
   
// methods 

   public void setWordCount(int wordCountIn) {
      wordCount = wordCountIn;
   }

}