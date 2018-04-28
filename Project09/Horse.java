import java.text.DecimalFormat;

/**
 * Derived from Pet class.
 *
 * @author Jared R. Porter
 * @version 11/10/2016
 */
public class Horse extends Pet {
// instance variables
   private double exerciseFee;

// class variables

/**
 * Constant rate for horses.
 */
   public static final double BASE_RATE = 15;
   
// constructor

/**
 * The Horse class must contain a constructor that accepts six parameters
 * representing the five values for the instance fields in the Pet class
 * (owner, name, breed, weight, and days) and one for the instance variable
 * exerciseFee in Horse. Since this class is a subclass of Pet, the super
 * constructor should be called with five values for the Pet constructor.
 * The instance variable exerciseFee should be set with the last parameter.
 *
 * @param owner sets owner
 * @param name sets name
 * @param breed sets breed
 * @param weight sets weight
 * @param days sets days
 * @param exerciseFeeIn sets exerciseFee    
 */
   public Horse(String owner, String name, String breed,
             double weight, int days, double exerciseFeeIn) {
   
      super(owner, name, breed, weight, days);
   
      exerciseFee = exerciseFeeIn;
   }

// methods

/**
 * Accepts no parameters and returns a double representing exerciseFee.
 *
 * @return exerciseFee
 */
   public double getExerciseFee() {
      return exerciseFee;
   }

/**
 * Accepts a double representing exerciseFee, sets the field, and
 * returns nothing.
 *
 * @param exerciseFeeIn sets exerciseFee
 */
   public void setExerciseFee(double exerciseFeeIn) {
      exerciseFee = exerciseFeeIn;
   }

/**
 * Accepts no parameters and returns a double representing the boarding
 * cost for the horse calculated as follows:
 * (BASE_RATE + weight * 0.01 + exerciseFee) * days.
 *
 * @return cost
 */
   public double boardingCost() { 
      return (BASE_RATE + weight * 0.01 + exerciseFee) * days;
   }

/**
 * Calls the toString method in the parent, super.toString(), and then
 * appends the exerciseFee info to it. Below is an example of the
 * toString result for Horse h as it is declared above.
 *
 * @return output
 */
   public String toString() {
      DecimalFormat fmt = new DecimalFormat("$#,##0.00");
   
      String output = super.toString() + "Exercise Fee: " 
                    + fmt.format(exerciseFee);
   
      return output;
   }
}