/**
 * Derived from Pet class.
 *
 * @author Jared R. Porter
 * @version 11/17/2016
 */
public class Cat extends Pet {
// instance variables
   private int livesLeft;

// class variables

/**
 * Constant rate for cats.
 */
   public static final double BASE_RATE = 10;

// constructor

/**
 * The Cat class must contain a constructor that accepts six parameters
 * representing the five instance fields in the Pet class (owner, name,
 * breed, weight, and days) and the one instance field liveLeft declared
 * in Cat. Since this class is a subclass of Pet, the super constructor
 * should be called with field values for Pet. The instance variable
 * livesLeft should be set with the last parameter.
 * 
 * @param owner sets owner
 * @param name sets name
 * @param breed sets breed
 * @param weight sets weight
 * @param days sets days
 * @param livesLeftIn sets livesLeft
 */
   public Cat(String owner, String name, String breed, 
               double weight, int days, int livesLeftIn) {
            
      super(owner, name, breed, weight, days);
      livesLeft = livesLeftIn;            
   }
            
// methods

/**
 * Accepts no parameters and returns an int representing livesLeft.
 * 
 * @return livesLeft
 */
   public int getLives() {
      return livesLeft;
   }
   
/**
 * Accepts an int for livesLeft, sets the field, and returns nothing.
 *
 * @param livesLeftIn sets livesLeft
 */
   public void setLives(int livesLeftIn) {
      livesLeft = livesLeftIn;
   }
 
/** 
 * Accepts no parameters and returns a double representing the boarding
 * cost for the cat calculated as follows (note, that boarding cost for
 * a cat increases significantly as livesLeft decreases below 9; e.g.,
 * the cost triples if livesLeft is only 3):
 * (BASE_RATE + weight * 0.10) * days * (9.0 / livesLeft).
 * 
 * @return cost
 */
   public double boardingCost() {
      return (BASE_RATE + weight * 0.10) * days * (9.0 / livesLeft);
   }
   
/**
 * Calls the toString method in the parent, super.toString(),
 * and then appends the livesLeft info to it. Below is an example
 * of the toString result for Cat c as it is declared above. Note
 * that “Cat” at the beginning of second line should be determined
 * by calling this.getClass() in the toString method in Pet.
 *
 * @return output
 */   
   public String toString() {
      String output = super.toString() + "Lives Left: " + livesLeft;
   
      return output;
   }
}