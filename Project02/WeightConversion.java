import java.util.Scanner;

/**
 * Program that allows the user to enter a value in ounces
 * and then displays the combination of tons, pounds, and 
 * ounces that each value is maximized in order by tons, 
 * pounds, and ounces. The input value should not exceed 
 * 500 million ounces (500,000,000).
 *
 * @author COMP1210
 * @version 9/5/2016
 *
 */
 
public class WeightConversion {
   /**
    * Main Method.
    * @param args (not used)
    */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      int weight;
      
      System.out.print("Enter weight in ounces: ");
      weight = userInput.nextInt();
      
      if (weight > 500000000) {
      
         System.out.println("Limit of 500,000,000 ounces exceeded!");
        
      }
         
      else {
         int tons = weight / 32000;
         int pounds = (weight % 32000) / 16;
         int ounces = (weight % 32000) % 16;
         
         System.out.println("Combined Number of Tons, Pounds, and Ounces:");
         System.out.println("\tTons: " + tons);
         System.out.println("\tPounds: " + pounds);
         System.out.println("\tOunces: " + ounces);
         System.out.println(weight + " ounces = " + tons + " tons + "
                           + pounds + " pounds + " + ounces + " ounces");
      }
         
   }
   
}