import java.util.Scanner;

/** 
 * The goal of this activity is to create a program 
 * that displays someone’s name, their age, and 
 * calculations based on their age.
 * 
 * @author COMP1210
 * @version 8/29/2016
 */
public class AgeStatistics {
   /**
    * Main method.
    * @param args (not used)
    */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int ageInYears = 0;
      int gender = 0;
      double maxHeartRate = 0;
      
      // Prompt user for their name
      System.out.print("Enter your name: ");
      name = userInput.nextLine();
      
      // Prompt user for their age
      System.out.print("Enter your age in years: ");
      ageInYears = userInput.nextInt();
      
      // Prompt user for gender
      System.out.print("Enter your gender (1 for female and 0 for male): ");
      gender = userInput.nextInt();
      
      // Convert age
      System.out.println("\tYour age in minutes is " + ageInYears * 525600
                         + " minutes.");
                         
      System.out.println("\tYour age in centuries is " + (double) ageInYears / 100
                         + " centuries.");
                         
      // Display max heart rate
      System.out.print("Your max heart rate is ");
      
      if (gender == 1) { // calculate female MHR
         maxHeartRate = 209 - (0.7 * ageInYears);
      }
      
      else { // calculate male MHR
         maxHeartRate = 214 - (0.8 * ageInYears);
      }
      
      System.out.println(maxHeartRate + " beats per minute.");
   }
  
}