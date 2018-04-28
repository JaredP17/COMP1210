/**
 * Derived from Pet class.
 *
 * @author Jared R. Porter
 * @version 11/10/2016
 */
public class Dog extends Pet {
// instance variables
   
     /*---NONE---*/

// class variables

/**
 * Constant rate for dogs.
 */
   public static final double BASE_RATE = 12;

// constructor

/** 
 * The Dog class must contain a constructor that accepts five
 * parameters representing the five instance fields in the Pet
 * class (owner, name, breed, weight, and days). Since this
 * class is a subclass of Pet, the super constructor should be
 * called with field values for Pet.
 *
 * @param owner sets owner
 * @param name sets name
 * @param breed sets breed
 * @param weight sets weight
 * @param days sets days
 */
   public Dog(String owner, String name, String breed, 
            double weight, int days) {
            
      super(owner, name, breed, weight, days);
   }
   
// methods

/**
 * Accepts no parameters and returns a double representing the boarding
 * cost for a dog calculated as follows: (BASE_RATE + weight * 0.05) * days.
 * 
 * @return cost
 */
   public double boardingCost() {
      return (BASE_RATE + weight * 0.05) * days;
   }
}