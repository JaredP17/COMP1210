import java.util.Comparator;

/**
 * The BoardingCostComparator class implements the Comparator
    * interface for Pet objects.
    *
    * @author Jared R. Porter
    * @version 11/17/2016
    */
public class BoardingCostComparator implements Comparator<Pet> {

   /**
    * Defines the ordering from highest to lowest based on the 
    * boarding cost of each pet.
    *
    * @param p1 for first compared value
    * @param p2 for second compared value
    * @return value of compared costs
    */
   public int compare(Pet p1, Pet p2) {
      if (p1.boardingCost() < p2.boardingCost()) {
         return 1;
      }
      
      else if (p1.boardingCost() > p2.boardingCost()) {
         return -1;
      }
      
      else {
         return 0;
      }
   }
}