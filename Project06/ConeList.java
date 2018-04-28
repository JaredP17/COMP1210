import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;
import java.io.File;
import java.io.IOException;

/**
 * Stores the name of the list and an ArrayList of Cone objects. 
 * It also includes methods that return the name of the list, 
 * number of Cone objects in the ConeList2, total surface area, 
 * total volume, total base perimeter, total base area, average 
 * surface area, and average volume for all Cone objects in the 
 * ConeList2. The toString method returns a String containing the 
 * name of the list followed by each Cone in the ArrayList, and 
 * a summaryInfo method returns summary information about the list.
 *
 * @author COMP1210
 * @version 10/10/2016
 */
public class ConeList {

//instance variables  
   private String listName;
   private ArrayList<Cone> coneList = new ArrayList<Cone>();
   
// constructor

/**
 * ConeList2 constructor.
 *
 * @param listNameIn -> listName
 * @param coneListIn -> coneList
 */
   public ConeList(String listNameIn, ArrayList<Cone> coneListIn) {
      listName = listNameIn;
      coneList = coneListIn;
   }

// methods

/**
 * Gets name of ConeList2.
 *
 * @return listName
 */
   public String getName() {
      return listName;
   }
   
/**
 * Gets number of cones in ConeList2.
 *
 * @return size of ConeList2
 */
   public int numberOfCones() {
      return coneList.size();
   }
   
/**
 * Adds base perimeters of each cone in ConeList2.
 *
 * @return total base perimeter
 */
   public double totalBasePerimeter() {
      if (this.numberOfCones() == 0) {
         return 0.0;
      } 
      
      else {
         double totalBP = 0.0;
         int i = 0;
         
         while (i < this.numberOfCones()) {
            totalBP += coneList.get(i).basePerimeter();
         
            i++;
         }
         
         return totalBP;
      }
   }
   
/**
 * Adds base area of each cone in ConeList2.
 *
 * @return total base area
 */
   public double totalBaseArea() {
      if (this.numberOfCones() == 0) {
         return 0.0;
      } 
      
      else {
         double totalBA = 0.0;
         int i = 0;
         
         while (i < this.numberOfCones()) {
            totalBA += coneList.get(i).baseArea();
         
            i++;
         }
         
         return totalBA;
      }
   }

/**
 * Adds slant heights of each cone in ConeList2.
 *
 * @return total slant height
 */
   public double totalSlantHeight() {
      if (this.numberOfCones() == 0) {
         return 0.0;
      } 
      
      else {
         double totalSH = 0.0;
         int i = 0;
         
         while (i < this.numberOfCones()) {
            totalSH += coneList.get(i).slantHeight();
         
            i++;
         }
         
         return totalSH;
      }
   }
   
/**
 * Adds side areas of each cone in ConeList2.
 *
 * @return total side area
 */
   public double totalSideArea() {
      if (this.numberOfCones() == 0) {
         return 0.0;
      } 
      
      else {
         double totalSA = 0.0;
         int i = 0;
         
         while (i < this.numberOfCones()) {
            totalSA += coneList.get(i).sideArea();
         
            i++;
         }
         
         return totalSA;
      }
   }
   
/**
 * Adds surface areas of each cone in ConeList2.
 *
 * @return total surface area
 */
   public double totalSurfaceArea() {
      if (this.numberOfCones() == 0) {
         return 0.0;
      } 
      
      else {
         double totalSFA = 0.0;
         int i = 0;
         
         while (i < this.numberOfCones()) {
            totalSFA += coneList.get(i).surfaceArea();
         
            i++;
         }
         
         return totalSFA;
      }
   }
   
/**
 * Adds volumes of each cone in ConeList2.
 *
 * @return total volume
 */
   public double totalVolume() {
      if (this.numberOfCones() == 0) {
         return 0.0;
      } 
      
      else {
         double totalVol = 0.0;
         int i = 0;
         
         while (i < this.numberOfCones()) {
            totalVol += coneList.get(i).volume();
         
            i++;
         }
         
         return totalVol;
      }
   }
   
/**
 * Calculates averages surface area of ConeList2.
 *
 * @return average surface area
 */
   public double averageSurfaceArea() {
      if (this.numberOfCones() > 0) {
         return this.totalSurfaceArea() / this.numberOfCones();
      }
      
      else {
         return 0.0;
      }
   }
   
/**
 * Calculates average volume in ConeList2.
 *
 * @return average volume
 */
   public double averageVolume() {
      if (this.numberOfCones() > 0) { 
         return this.totalVolume() / this.numberOfCones();
      }
      
      else {
         return 0.0;
      }
   }
   
/**
 * Returns the ArrayList of Cone objects.
 * 
 * @return ArrayList<Cone>
 */
   public ArrayList<Cone> getList() { 
      return coneList;
   }
   
/**
 * Takes a String parameter representing the file name, 
 * reads in the file, storing the list name and creating 
 * an ArrayList of Cone objects, uses the list name and 
 * the ArrayList to create a ConeList2 object, and then 
 * returns the ConeList2 object.
 *
 * @param filename (file to be read)
 * @throws IOException (necessary)
 * @return new ConeList2 Object
 */
   public ConeList readFile(String filename) throws IOException {
      Scanner scan = new Scanner(new File(filename));
      listName = scan.nextLine();
      
      String label;
      double height, radius;
      
      while (scan.hasNext()) {
         label = scan.nextLine();
         height = Double.parseDouble(scan.nextLine());
         radius = Double.parseDouble(scan.nextLine());
         
         Cone cone = new Cone(label, height, radius);
         coneList.add(cone);
      }
      
      return new ConeList(listName, coneList);
   }

/**
 * Returns nothing but takes three parameters 
 * (label, height, and radius), creates a new Cone 
 * object, and adds it to the ConeList2 object.
 *
 * @param label sets Cone label
 * @param height sets Cone height
 * @param radius sets Cone radius
 */
   public void addCone(String label, double height, double radius) {
      Cone cone = new Cone(label, height, radius);
      coneList.add(cone);
   }
 
/**
 * Takes a label of a Cone as the String parameter and 
 * returns the corresponding Cone object if found in the 
 * ConeList2 object; otherwise returns null. This method 
 * should ignore case when attempting to match the label.
 *
 * @param label to compare Cone labels
 * @return matching labeled Cone
 */
   public Cone findCone(String label) {
      
      for (Cone target : coneList) {
         if (label.equalsIgnoreCase(target.getLabel())) {
            return target;
         }
      }
      
      return null;
   }
   
/**
 * Takes a String as a parameter that represents the label of the 
 * Cone and returns the Cone if it is found in the ConeList2 object 
 * and deleted; otherwise returns null. This method should use the 
 * String equalsIgnoreCase method when attempting to match a label 
 * in the Cone object to delete.
 *
 * @param label to compare Cone labels
 * @return Cone to be deleted
 */     
   public Cone deleteCone(String label) {
      Cone rm = this.findCone(label);
      
      if (rm != null) {
         coneList.remove(rm);
         return rm;
      }
      
      return null;
   }
   
/**
 * Takes three parameters (label, height, and radius), uses the label 
 * to find the corresponding the Cone object. If found, sets the height 
 * and radius to the values passed in as parameters, and returns true. 
 * If not found, simply returns false.
 *
 * @param label finds Cone
 * @param height sets new height
 * @param radius sets new radius
 * @return boolean
 */
   public boolean editCone(String label, double height, double radius) {
      Cone edit = this.findCone(label);
      
      if (edit != null) {
         edit.setHeight(height);
         edit.setRadius(radius);
      
         return true;
      }
   
      return false;
   }

/**
 * Overridden toString() method for ConeList2.
 *
 * @return output of each Cone object in ConeList2
 */
   public String toString() {
      String output = "\n" + this.getName() + "\n"; 
      int i = 0;
      
      while (i < this.numberOfCones()) {
         output += "\n" + coneList.get(i).toString() + "\n";
      
         i++;
      }
      
      return output;
   }
   
/**
 * Prints summary of ConeList2.
 *
 * @return output of ConeList2 calculations
 */
   public String summaryInfo() {
      DecimalFormat fmt = new DecimalFormat("#,##0.0##");
   
      String output = "\n----- Summary for " + this.getName() + " -----"
             + "\nNumber of Cones: " + this.numberOfCones()
             + "\nTotal Base Perimeter: " 
             + fmt.format(this.totalBasePerimeter())
             + "\nTotal Base Area: " 
             + fmt.format(this.totalBaseArea())
             + "\nTotal Slant Height: " 
             + fmt.format(this.totalSlantHeight())
             + "\nTotal Side Area: " 
             + fmt.format(this.totalSideArea())
             + "\nTotal Surface Area: " 
             + fmt.format(this.totalSurfaceArea())
             + "\nTotal Volume: " 
             + fmt.format(this.totalVolume())
             + "\nAverage Surface Area: " 
             + fmt.format(this.averageSurfaceArea())
             + "\nAverage Volume: " 
             + fmt.format(this.averageVolume()) + "\n";
             
      return output;
   }
}