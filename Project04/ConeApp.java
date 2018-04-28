import java.util.Scanner;

/**
 * Cone driver class.
 *
 * @author COMP1210
 * @version 9/22/2016
 */
public class ConeApp {

/**
 * Main Method.
 * @param args (unused)
 */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      String label;
      double height, radius;
      
      System.out.println("Enter label, height, and radius for a cone.");
      
      System.out.print("\tlabel: ");
      label = userInput.nextLine();
      
      System.out.print("\theight: ");
      height = Double.parseDouble(userInput.nextLine());
      
      if (height <= 0) { // invalid height
         System.out.println("Error: height must be greater than 0.");
      }
      
      else { 
         System.out.print("\tradius: ");
         radius = Double.parseDouble(userInput.nextLine());
         
         if (radius <= 0) { // invalid radius
            System.out.println("Error: radius must be greater than 0.");
         }
         
         else { // Creat cone object
            Cone c = new Cone(label, height, radius);
            System.out.println(c);
         }
      }
   }

}