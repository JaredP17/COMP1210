import java.util.ArrayList;

/**
 * Holds a set of integer values representing daily temperatures.
 *
 * @author COMP1210
 * @version 10/3/2016
 */
public class Temperatures {

// instance variables
   private ArrayList<Integer> temperatures = new ArrayList<Integer>();

// constructor

/**
 * Temperatures constructor.
 * 
 * @param temperaturesIn -> temperatures
 */
   public Temperatures(ArrayList<Integer> temperaturesIn) {
      temperatures = temperaturesIn;
   }

// methods

/**
 * Get temperature's low.
 *
 * @return lowest temperature
 */
   public int getLowTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      
      int low = temperatures.get(0);
      
      for (int i = 1; i < temperatures.size(); i++) { // normal for loop
         if (temperatures.get(i) < low) {
            low = temperatures.get(i);
         }
      }
      
      return low;
   }
 
/**
 * Get temperature's high.
 *
 * @return highest temperature
 */
   public int getHighTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      
      int high = temperatures.get(0);
      
      for (Integer temp : temperatures) { // for-each loop
         if (temp > high) {
            high = temp;
         }
      }
      
      return high;
   }
   
/**
 * Takes an int value and returns the parameter if it is lower 
 * than the value returned by getLowTemp. Otherwise, it returns 
 * the return of getLowTemp.
 *
 * @param lowIn compares to low
 * @return value
 */
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
 
/**
 * Takes an int value and returns the parameter if it is greater 
 * than than the value returned by getHighTemp. Otherwise, it 
 * returns the return of getHighTemp.
 *
 * @param highIn compares to high
 * @return value
 */
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
   
/**
 * Temperatures to string method.
 * 
 * @return output
 */
   public String toString() {
      return "\tTemperatures: " + temperatures
             + "\n\tLow: " + getLowTemp()
             + "\n\tHigh: " + getHighTemp();
   }
  
}