import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

/** 
 * ConeList Driver application.
 *
 * @author COMP1210
 * @version 10/3/2016
 */
public class ConeListApp {

/**
 * Main method.
 *
 * @param args (unused)
 * @throws IOException (necessary)
 */
   public static void main(String[] args) throws IOException {
      String filename = "", listName = "";
      Scanner userInput = new Scanner(System.in);
      ArrayList<Cone> list = new ArrayList<Cone>();
   
      System.out.print("Enter file name: ");
      filename = userInput.nextLine();
      
      Scanner scan = new Scanner(new File(filename)); // open file
      listName = scan.nextLine(); // first line is name of the cone list
      
      String label = "";
      double height = 0.0;
      double radius = 0.0;
      
      while (scan.hasNext()) { // scan entire file
         label = scan.nextLine(); // assign cone label
         height = Double.parseDouble(scan.nextLine()); // assign cone height
         radius = Double.parseDouble(scan.nextLine()); // assign cone radius
      
         Cone cone = new Cone(label, height, radius); // create new Cone object
         
         list.add(cone); // add cone to ArrayList
      }
      
      ConeList cList = new ConeList(listName, list); // create ConeList object
      System.out.println(cList); // print toString()
      System.out.println(cList.summaryInfo()); // print cone list summary
   }

}