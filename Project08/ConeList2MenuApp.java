import java.util.Scanner;
import java.io.IOException;

/**
 * Driver app for ConeList.
 *
 * @author COMP1210
 * @version 10/10/2016
 */
public class ConeList2MenuApp {

/**
 * Main method.
 *
 * @param args (unused)
 * @throws IOException (necessary)
 */
   public static void main(String[] args) throws IOException {
      String listName = "*** no list name assigned ***";
      Cone[] list = new Cone[100];
      ConeList2 c = new ConeList2(listName, list, 0);
      String label;
      double height, radius;
      Scanner userInput = new Scanner(System.in);
    
      System.out.println("Cone List System Menu"
                     + "\nR - Read File and Create Cone List"
                     + "\nP - Print Cone List"
                     + "\nS - Print Summary"
                     + "\nA - Add Cone"
                     + "\nD - Delete Cone"
                     + "\nF - Find Cone"
                     + "\nE - Edit Cone"
                     + "\nQ - Quit");
                              
      char choice;
      
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         choice = userInput.nextLine().toUpperCase().charAt(0);
         
         switch (choice) {
            case 'R':
               System.out.print("\tFile name: ");
               String filename = userInput.nextLine();
               c = c.readFile(filename);
               System.out.println("\tFile read in and Cone List created\n");
               break;
               
            case 'P':
               System.out.println(c);
               break;
            
            case 'S':
               System.out.println(c.summaryInfo());
               break;
               
            case 'A':
               System.out.print("\tLabel: ");
               label = userInput.nextLine();
               System.out.print("\tHeight: ");
               height = Double.parseDouble(userInput.nextLine());
               System.out.print("\tRadius: ");
               radius = Double.parseDouble(userInput.nextLine());
               
               c.addCone(label, height, radius);
               System.out.println("\t*** Cone added ***\n");
               break;
               
            case 'D':
               System.out.print("\tLabel: ");
               label = userInput.nextLine();
               
               if (c.findCone(label) == null) {
                  System.out.println("\t\"" + label + "\" not found\n"); 
               }
               
               else {
                  c.deleteCone(label);
                  System.out.println("\t\"" + label + "\" deleted\n");
               }
               
               break;
               
            case 'F':
               System.out.print("\tLabel: ");
               label = userInput.nextLine();
               
               if (c.findCone(label) == null) {
                  System.out.println("\t\"" + label + "\" not found\n"); 
               }
               
               else {
                  System.out.println(c.findCone(label) + "\n");
               }
               
               break;
         
            case 'E':
               System.out.print("\tLabel: ");
               label = userInput.nextLine();
               System.out.print("\tHeight: ");
               height = Double.parseDouble(userInput.nextLine());
               System.out.print("\tRadius: ");
               radius = Double.parseDouble(userInput.nextLine());
               
               if (c.findCone(label) == null) {
                  System.out.println("\t\"" + label + "\" not found\n"); 
               }
               
               else {
                  c.editCone(label, height, radius);
                  System.out.println("\t\"" + label 
                                    + "\" successfully edited\n");
               }
               
               break;
         
            case 'Q':
               break;
            
            default:  
               System.out.println("\t*** invalid code ***\n");   
               
         }
      } while (choice != 'Q');
   }

}