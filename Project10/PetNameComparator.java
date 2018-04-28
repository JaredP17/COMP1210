import java.util.Comparator;

/**
 * mplements the Comparator interface for Pet objects. 
 * 
 * @author Jared R. Porter
 * @version 11/17/2016
 */
public class PetNameComparator implements Comparator<Pet> {

   /**
    * Implements the Comparator interface for Pet objects.
    *
    * @param p1 for first comparison
    * @param p2 for second comparison
    * @return value of comparison
    */
   public int compare(Pet p1, Pet p2) {
      
      return p1.getName().compareTo(p2.getName());
   }
}