/**
 * Division class that catches and handles exceptions.
 *
 * @author Jared R. Porter
 * @version 11/14/2016
 */
public class Division {

/**
 * Integer division.
 *
 * @param num for numerator
 * @param denom for denominator
 * @return quotient
 */
   public static int intDivide(int num, int denom) {
      try {
         return num / denom;
      }
      
      catch (ArithmeticException e) {
         return 0;
      }
   }
  
/** 
 * Floting point division.
 *
 * @param num for numerator
 * @param denom for denominator
 * @return quotient
 */ 
   public static double decimalDivide(int num, int denom) {
      if (denom == 0) {
         throw new IllegalArgumentException("The denominator "
            + "cannot be zero.");
      }
      return (double) num / denom;
   }
}