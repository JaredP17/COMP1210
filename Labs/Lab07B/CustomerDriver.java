/**
 * Lab 7B: Comparable Interface Driver.
 *
 * @author Jared R. Porter
 * @version 10/24/2016
 */

public class CustomerDriver {
/**
 * Main method.
 * @param args (unused)
 */
   public static void main(String[] args) {
      Customer cstmr1 = new Customer("John");
      cstmr1.changeBalance(10);
      cstmr1.setLocation("Boston, MA");
      System.out.println(cstmr1);
   
      Customer cstmr2 = new Customer("JoAnn");
      cstmr2.changeBalance(73);
      cstmr2.setLocation("Auburn, AL");
      System.out.println(cstmr2 + "\r\n");
   
      if (cstmr1.compareTo(cstmr2) == 1) {
         System.out.println("Higher Balance: " + cstmr1);
      }
      
      else if (cstmr1.compareTo(cstmr2) == -1) {
         System.out.println("Higher Balance: " + cstmr2);
      }
      
      else {
         System.out.println("Balances are equal.");
      }
   }

}