import java.util.ArrayList;
import java.text.DecimalFormat;

/**
 * Stores the name of the list and an ArrayList of Cone objects. 
 * It also includes methods that return the name of the list, 
 * number of Cone objects in the ConeList, total surface area, 
 * total volume, total base perimeter, total base area, average 
 * surface area, and average volume for all Cone objects in the 
 * ConeList. The toString method returns a String containing the 
 * name of the list followed by each Cone in the ArrayList, and 
 * a summaryInfo method returns summary information about the list.
 *
 * @author COMP1210
 * @version 10/3/2016
 */
public class ConeList {

//instance variables  
   private String listName;
   private ArrayList<Cone> coneList = new ArrayList<Cone>();
   
// constructor

/**
 * ConeList constructor.
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
 * Gets name of ConeList.
 *
 * @return listName
 */
   public String getName() {
      return listName;
   }
   
/**
 * Gets number of cones in ConeList.
 *
 * @return size of ConeList
 */
   public int numberOfCones() {
      return coneList.size();
   }
   
/**
 * Adds base perimeters of each cone in ConeList.
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
 * Adds base area of each cone in ConeList.
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
 * Adds slant heights of each cone in ConeList.
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
 * Adds side areas of each cone in ConeList.
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
 * Adds surface areas of each cone in ConeList.
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
 * Adds volumes of each cone in ConeList.
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
 * Calculates averages surface area of ConeList.
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
 * Calculates average volume in ConeList.
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
 * Overridden toString() method for ConeList.
 *
 * @return output of each Cone object in ConeList
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
 * Prints summary of ConeList.
 *
 * @return output of ConeList calculations
 */
   public String summaryInfo() {
      DecimalFormat fmt = new DecimalFormat("#,##0.0##");
   
      String output = "----- Summary for " + this.getName() + " -----"
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
             + fmt.format(this.averageVolume());
             
      return output;
   }
}