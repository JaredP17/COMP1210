import java.text.DecimalFormat;

/**
 * Abstract Pet class that stores pet data and provides 
 * methods to access the data.
 *
 * @author Jared R. Porter
 * @version 11/10/2016
 */
public abstract class Pet { 
// instance variables
   protected String owner, name, breed;
   protected double weight;
   protected int days;

// class variables
   protected static int count = 0;

// constructor

/** 
 * The Pet class must contain a constructor that accepts five
 * parameters representing the values to be assigned to the
 * instance fields: owner, name, breed, weight, and days to be
 * boarded. Since this class is abstract, the constructor will
 * be called from the subclasses of Pet using super and the
 * parameter list. The count field should be incremented in 
 * this constructor.
 *
 * @param ownerIn sets owner
 * @param nameIn sets name
 * @param breedIn sets breed
 * @param weightIn sets weight
 * @param daysIn sets days
 */
   public Pet(String ownerIn, String nameIn, String breedIn,
                double weightIn, int daysIn) {
      owner = ownerIn;
      name = nameIn;
      breed = breedIn;
      weight = weightIn;
      days = daysIn;
      
      count++;
   }
 
// methods

/**
 * Accepts no parameters and returns a String representing the owner.
 * 
 * @return owner
 */
   public String getOwner() {
      return owner;
   }
 
/**
 * Accepts a String representing the owner, sets the field, and 
 * returns nothing.
 *
 * @param ownerIn sets owner
 */
   public void setOwner(String ownerIn) {
      owner = ownerIn;
   }
 
/**
 * Accepts no parameters and returns a String representing the name.
 *
 * @return name
 */
   public String getName() {
      return name;
   }

/**
 * Accepts a String representing the name, sets the field, and returns nothing.
 *
 * @param nameIn sets name
 */
   public void setName(String nameIn) {
      name = nameIn;
   }
 
/**
 * Accepts no parameters and returns a String representing the breed.
 *
 * @return breed
 */
   public String getBreed() {
      return breed;
   }
 
/**
 * Accepts a String representing the breed, sets the field, and returns nothing.
 * 
 * @param breedIn sets breed
 */
   public void setBreed(String breedIn) {
      breed = breedIn;
   }
 
/**
 * Accepts no parameters and returns a double representing weight.
 * 
 * @return weight
 */  
   public double getWeight() {
      return weight;
   }
 
/**
 * Accepts a double representing the weight, sets the field, and returns 
 * nothing.
 *
 * @param weightIn sets weight
 */
   public void setWeight(double weightIn) {
      weight = weightIn;
   }
 
/**
 * Accepts no parameters and returns a int representing days.
 *
 * @return days
 */
   public int getDays() {
      return days;
   }
 
/**
 * Accepts an int representing the days, sets the field, and returns nothing.
 *
 * @param daysIn sets days
 */
   public void setDays(int daysIn) {
      days = daysIn;
   }

/**
 * Accepts no parameters and returns an int representing the count.
 * Since count is static, this method should be static as well.
 * 
 * @return count
 */
   public static int getCount() {
      return count;
   }
 
/**
 * Accepts no parameters, resets count to zero, and returns nothing.
 * Since count is static, this method should be static as well.
 */
   public static void resetCount() {
      count = 0;
   }
 
/**
 * Returns a String describing the Pet object. This method will be
 * inherited by the subclasses, and a subclass may override the
 * inherited toString method as needed. Items on each line are
 * separated by three spaces. The double value for the boarding cost
 * should be formatted ("$#,##0.00"), but the other numeric values
 * do not require formatting.
 *
 * @return output
 */
   public String toString() {
      DecimalFormat fmt = new DecimalFormat("$#,##0.00");
      
      String output = "Owner: " + owner + "   Pet: " + name
                    + "   Days: " + days + "   Boarding Cost: "
                    + fmt.format(this.boardingCost()) + "\n" 
                    + this.getClass().getSimpleName() + ": " + breed
                    + "   Weight: " + weight + " lbs   ";
   
      return output;
   }
 
/**
 * An abstract method that accepts no parameters and returns a double
 * representing the boarding cost for a pet. Since this is an abstract
 * method, it has no body in Pet; however, each non-abstract subclass
 * must implement this method.
 * 
 * @return cost
 */   
   public abstract double boardingCost(); 
}