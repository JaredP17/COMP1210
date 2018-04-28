import java.util.Scanner;
import java.text.DecimalFormat;
import java.io.File;
import java.io.IOException;

/**
 * Stores the name of the list and an Array of Cone objects. 
 * It also includes methods that return the name of the list, 
 * number of Cone objects in the ConeList2, total surface area, 
 * total volume, total base perimeter, total base area, average 
 * surface area, and average volume for all Cone objects in the 
 * ConeList2. The toString method returns a String containing the 
 * name of the list followed by each Cone in the Array, and 
 * a summaryInfo method returns summary information about the list.
 *
 * @author COMP1210
 * @version 10/10/2016
 */
public class ConeList2 {

//instance variables  
   private String listName;
   private Cone[] list = new Cone[100];
   private int numberOfCones = 0;
   
// constructor

/**
 * ConeList2 constructor.
 *
 * @param listNameIn -> listName
 * @param listIn -> list
 * @param numberOfConesIn -> numberOfCones
 */
   public ConeList2(String listNameIn, Cone[] listIn, int numberOfConesIn) {
      listName = listNameIn;
      list = listIn;
      numberOfCones = numberOfConesIn;
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
      return numberOfCones;
   }
   
/**
 * Adds base perimeters of each cone in ConeList2.
 *
 * @return total base perimeter
 */
   public double totalBasePerimeter() {
      double sum = 0.0;
      
      if (this.numberOfCones() == 0) {
         return sum;
      } 
      
      else {
        
         for (int i = 0; i < this.numberOfCones(); i++) {
            sum += list[i].basePerimeter();
         }
         
         return sum;
      }
   }
   
/**
 * Adds base area of each cone in ConeList2.
 *
 * @return total base area
 */
   public double totalBaseArea() {
      double sum = 0.0;
      
      if (this.numberOfCones() == 0) {
         return sum;
      } 
      
      else {
        
         for (int i = 0; i < this.numberOfCones(); i++) {
            sum += list[i].baseArea();
         }
         
         return sum;
      }
   
   }

/**
 * Adds slant heights of each cone in ConeList2.
 *
 * @return total slant height
 */
   public double totalSlantHeight() {
      double sum = 0.0;
      
      if (this.numberOfCones() == 0) {
         return sum;
      } 
      
      else {
        
         for (int i = 0; i < this.numberOfCones(); i++) {
            sum += list[i].slantHeight();
         }
         
         return sum;
      }
   
   }
   
/**
 * Adds side areas of each cone in ConeList2.
 *
 * @return total side area
 */
   public double totalSideArea() {
      double sum = 0.0;
      
      if (this.numberOfCones() == 0) {
         return sum;
      } 
      
      else {
        
         for (int i = 0; i < this.numberOfCones(); i++) {
            sum += list[i].sideArea();
         }
         
         return sum;
      }
   
   }
   
/**
 * Adds surface areas of each cone in ConeList2.
 *
 * @return total surface area
 */
   public double totalSurfaceArea() {
      double sum = 0.0;
      
      if (this.numberOfCones() == 0) {
         return sum;
      } 
      
      else {
        
         for (int i = 0; i < this.numberOfCones(); i++) {
            sum += list[i].surfaceArea();
         }
         
         return sum;
      }
   
   }
   
/**
 * Adds volumes of each cone in ConeList2.
 *
 * @return total volume
 */
   public double totalVolume() {
      double sum = 0.0;
      
      if (this.numberOfCones() == 0) {
         return sum;
      } 
      
      else {
        
         for (int i = 0; i < this.numberOfCones(); i++) {
            sum += list[i].volume();
         }
         
         return sum;
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
 * Returns the Array of Cone objects.
 * 
 * @return Cone[]
 */
   public Cone[] getList() { 
      return list;
   }
   
/**
 * Takes a String parameter representing the file name, 
 * reads in the file, storing the list name and creating 
 * an Array of Cone objects, uses the list name and 
 * the Array to create a ConeList2 object, and then 
 * returns the ConeList2 object.
 *
 * @param filename (file to be read)
 * @throws IOException (necessary)
 * @return new ConeList2 Object
 */
   public ConeList2 readFile(String filename) throws IOException {
      Scanner scan = new Scanner(new File(filename));
      listName = scan.nextLine();
      
      String label;
      double height, radius;
      int count = 0;
      
      while (scan.hasNext()) {
         label = scan.nextLine();
         height = Double.parseDouble(scan.nextLine());
         radius = Double.parseDouble(scan.nextLine());
         
         Cone cone = new Cone(label, height, radius);
         list[count] = cone;
         count++;
      }
      
      return new ConeList2(listName, list, count);
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
      list[numberOfCones] = cone;
      numberOfCones++;
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
   
      for (int i = 0; i < numberOfCones; i++) {
         if (list[i].getLabel().equalsIgnoreCase(label)) {
            return list[i];
         }
      }
      
      return null;
   }
   
/**
 * Takes a String as a parameter that represents the label of the 
 * Cone and returns the Cone if it is found in the ConeList2 object 
 * and deleted; otherwise returns null. This method should use the 
 * String equalsIgnoreCase method when attempting to match a label 
 * in the Cone object to delete. When an element is deleted from an 
 * array, elements to the right of the deleted element must be 
 * shifted to the left. After shifting the items to the left, the 
 * last Cone element in the array should be set to null. Finally, 
 * the number of elements field must be decremented.
 *
 * @param label to compare Cone labels
 * @return Cone to be deleted
 */     
   public Cone deleteCone(String label) {
      Cone deleted;
   
      for (int i = 0; i < numberOfCones; i++) {
         if (list[i].getLabel().equalsIgnoreCase(label)) {
            deleted = list[i];
            list[i] = null;
            
            while (i < numberOfCones) {
               list[i] = list[i + 1];
               i++;
            }
            
            numberOfCones--;
            return deleted;
         }
      }
      
      return null;
   }
   
/**
 * Takes three parameters (label, height, and radius), uses the label 
 * to find the corresponding Cone object. If found, sets the height 
 * and radius to the values passed in as parameters, and returns true. 
 * If not found, simply returns false.
 *
 * @param label finds Cone
 * @param height sets new height
 * @param radius sets new radius
 * @return boolean
 */
   public boolean editCone(String label, double height, double radius) {
      for (int i = 0; i < numberOfCones; i++) {
         if (list[i].getLabel().equalsIgnoreCase(label)) {
            list[i].setHeight(height);
            list[i].setRadius(radius);
            
            return true;
         }
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
      
      for (int i = 0; i < numberOfCones; i++) {
         output += "\n" + list[i].toString() + "\n";
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