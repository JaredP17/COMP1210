import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;

/**
 * The PetBoardingList class provides methods for reading
 * in the data file and generating reports.
 *
 * @author Jared R. Porter
 * @version 11/17/2016
 */
public class PetBoardingList {
// instance variables
   private String listName;
   private Pet[] petList;
   private int petCount;
   private String[] excludedRecords;
   private int excludedCount;
   
// class variable
   private static int listCount = 0;
   
// constructor

/**
 * The constructor has no parameters, initializes the instance
 * fields in PetBoardingList, and increments the static field 
 * listCount. The readPetFile method defined below will populate
 * the PetBoardingList object.
 */
   public PetBoardingList() {
      listName = "";
      petList = new Pet[100];
      petCount = 0;
      excludedRecords = new String[30];
      excludedCount = 0;
      listCount++;
   }
   
// methods

/**
 * Returns the String representing the listName.
 *
 * @return listName
 */
   public String getListName() {
      return listName;
   }

/**
 * Has no return value, accepts a String, and then assigns it to listName.
 *
 * @param listNameIn sets listName
 */   
   public void setListName(String listNameIn) {
      listName = listNameIn;
   }

/**
 * Returns the Pet array representing the petList.  
 *
 * @return petList 
 */
   public Pet[] getPetList() {
      return petList;
   }

/**
 * Has no return value, accepts a Pet array, and then assigns it to petList.
 *
 * @param petListIn sets petList
 */   
   public void setPetList(Pet[] petListIn) {
      petList = petListIn;
   }

/**
 * Returns the current value of petCount.
 *
 * @return petCount
 */   
   public int getPetCount() {
      return petCount;
   }

/**
 * Has no return value, accepts an int, and assigns it to petCount.
 *
 * @param petCountIn sets petCount
 */   
   public void setPetCount(int petCountIn) {
      petCount = petCountIn;
   }

/**
 * Returns the String array representing the excludedRecords.
 *
 * @return excludedRecords
 */   
   public String[] getExcludedRecords() {
      return excludedRecords;
   }

/**
 * Has no return value, accepts a String array, and then assigns it
    * to excludedRecords (used in conjunction with setExcludedCount to 
    * provide a new excluded records array and new excluded records count).
    *
    * @param excludedRecordsIn sets excludedRecords
 */   
   public void setExcludedRecords(String[] excludedRecordsIn) {
      excludedRecords = excludedRecordsIn;
   }

/**
 * Returns the current value of excludedCount.
 *
 * @return excludedCount
 */   
   public int getExcludedCount() {
      return excludedCount;
   }

/**
 * Has no return value, accepts an int, and sets excludedCount to it.
 *
 * @param excludedCountIn sets excludedCount
 */   
   public void setExcludedCount(int excludedCountIn) {
      excludedCount = excludedCountIn;
   }

/**
 * Static method that returns the current value of listCount.
 *
 * @return listCount
 */  
   public static int getListCount() {
      return listCount;
   }

/**
 * Static method that has no return value and sets listCount to 0.
 */   
   public static void resetListCount() {
      listCount = 0;
   }
/** 
 * Has no return value and accepts the data file name as a String.
 * Remember to include the throws IOException clause in the method
 * declaration. This method creates a Scanner object to read in the
 * file and then reads it in line by line. The first line contains
 * the pet list name and each of the remaining lines contains the
 * data for a pet. After reading in the list name, the “pet” lines
 * should be processed as follows. A pet line is read in, a second
 * scanner is created on the line, and the individual values for
 * the pet are read in. After the values on the line have been read
 * in, an “appropriate” Pet object is created.
 *
 * @param fileIn is the file being read
 * @throws IOException handles exceptions
 */   
   public void readPetFile(String fileIn) throws IOException {
      Scanner fileScan = new Scanner(new File(fileIn));
      listName = fileScan.nextLine();
      
      
      while (fileScan.hasNextLine()) {
         String line = fileScan.nextLine();
         Scanner scan = new Scanner(line);
         scan.useDelimiter(",");
         
         try {
            char petType = scan.next().charAt(0);
            String owner = scan.next();
            String name = scan.next();
            String breed = scan.next();
            double weight =  Double.parseDouble(scan.next());
            int daysBoarded = Integer.parseInt(scan.next());
            Pet p;
         
            switch (petType) {
            
               case 'C':
                  int livesLeft = Integer.parseInt(scan.next());
                  p = new Cat(owner, name, breed, weight, daysBoarded, livesLeft);
                  petList[petCount] = p;
                  petCount++;
                  break;
            
               case 'D':
                  p = new Dog(owner, name, breed, weight, daysBoarded);
                  petList[petCount] = p;
                  petCount++;
                  break;
            
               case 'S':
                  String service = scan.next();
                  String[] commands = new String[100];
               
                  int i = 0;
                  while (scan.hasNext()) {
                     commands[i] = scan.next();
                     i++;
                  }
               
                  commands = Arrays.copyOf(commands, i);
               
                  p = new ServiceDog(owner, name, breed, weight, 
                                    daysBoarded, service, commands);
                  petList[petCount] = p;
                  petCount++;
               
                  break;
            
               case 'H':
                  double exerciseFee = Double.parseDouble(scan.next());
                  p = new Horse(owner, name, breed, weight, 
                              daysBoarded, exerciseFee);
                  petList[petCount] = p;
                  petCount++;
                  break;
            
               default: 
                  throw new InvalidCategoryException(String.valueOf(line.charAt(0)));
            }
         }
         
         catch (InvalidCategoryException e) {
            String result = e + " in: " + line;
         
            excludedRecords[excludedCount] = result;
            excludedCount++;
         }
         
         catch (NumberFormatException e) {
            String result = e + " in: " + line;
         
            excludedRecords[excludedCount] = result;
            excludedCount++;
         }
         
         catch (NoSuchElementException e) {
            String result = e + " in: " + line;
         
            excludedRecords[excludedCount] = result;
            excludedCount++;
         }
      }
   }

/**
 * Processes the pet list array using the original order from the
 * file to produce the Pet Boarding Report which is returned as a String.
 *
 * @return report
 */   
   public String generateReport() {
      String report = "";
    
      Pet[] pList = Arrays.copyOf(petList, petCount);
      
      for (Pet p : pList) {
         report += "\n" + p.toString() + "\n";
      }
      
      return "\n---------------------------------------\n"
           + "Pet Boarding Report for " + listName + "\n"
           + "---------------------------------------\n"
           + report;
   }

/**
 * Makes a copy of the pet list array and sorts the copy using the
 * natural ordering, and processes the sorted array to produce the
 * Pet Boarding Report (by Owner) which is returned as a String.
 *
 * @return report
 */   
   public String generateReportByOwner() {
      String report = "";
      
      Pet[] pList = Arrays.copyOf(petList, petCount);
      Arrays.sort(pList);
      
      for (Pet p : pList) {
         report += "\n" + p.toString() + "\n";
      }
      
      return "\n---------------------------------------\n"
           + "Pet Boarding Report for " + listName + " (by Owner)\n"
           + "---------------------------------------\n"
           + report;
   }

/**
 * Makes a copy of the pet list array and sorts the copy by pet name,
 * and processes the sorted array to produce the Pet Boarding Report
 * (by Pet Name) which is returned as a String.
 *
 * @return report
 */    
   public String generateReportByPetName() {
      String report = "";
      
      Pet[] pList = Arrays.copyOf(petList, petCount);
      Arrays.sort(pList, new PetNameComparator());
      
      for (Pet p : pList) {
         report += "\n" + p.toString() + "\n";
      }
      
      return "\n---------------------------------------\n"
           + "Pet Boarding Report for " + listName + " (by Pet Name)\n"
           + "---------------------------------------\n"
           + report;
   }

/**
 * Makes a copy of the pet list array and sorts the copy by boarding
 * cost, and processes the sorted array to produce the Pet Boarding
 * Report (by Boarding Cost) which is returned as a String.
 *
 * @return report
 */   
   public String generateReportByBoardingCost() {
      String report = "";
      
      Pet[] pList = Arrays.copyOf(petList, petCount);
      Arrays.sort(pList, new BoardingCostComparator());
      
      for (Pet p : pList) {
         report += "\n" + p.toString() + "\n";
      }
      
      return "\n---------------------------------------\n"
           + "Pet Boarding Report for " + listName + " (by Boarding Cost)\n"
           + "---------------------------------------\n"
           + report;
   }

/**
 * Processes the excludedRecords array to produce the Excluded Records
 * Report which is returned as a String.
 *
 * @return report
 */   
   public String generateExcludedRecordsReport() {
      String report = "";
      
      String[] eList = Arrays.copyOf(excludedRecords, excludedCount);
      for (String e : eList) {
       
         report += "\n" + e;
         
      }
      
      return "\n---------------------------------------\n"
           + "Excluded Records Report\n"
           + "---------------------------------------\n"
           + report;
   }


}