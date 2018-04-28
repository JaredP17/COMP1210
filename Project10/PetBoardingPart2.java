import java.io.IOException;

/**
 * Driver program for project 10.
 *
 * @author Jared R. Porter
 * @version 11/17/2016
 */
public class PetBoardingPart2 {

/** 
 * Reads in the file name as the first argument, args[0], of the command
 * line arguments, creates an instance of PetBoardingList, and then calls
 * the readPetFile method in the PetBoardingList class to read in the data
 * file and generate the five reports as shown in the output examples
 * beginning on page 7. If no command line argument is provided, the
 * program should indicate this and end as shown in the first example output
 * on page 7.
 *
 * @param args (is used)
 * @throws IOException to handle exceptions
 */
   public static void main(String[] args) throws IOException {
      
      if (args.length > 0) {
         PetBoardingList list = new PetBoardingList();
         list.readPetFile(args[0]);
         System.out.println(list.generateReport());
         System.out.println(list.generateReportByOwner());
         System.out.println(list.generateReportByPetName());
         System.out.println(list.generateReportByBoardingCost());
         System.out.println(list.generateExcludedRecordsReport());
      }
      
      else {
         System.out.println("File name expected as command line argument.\n"
                          + "Program ending.");   
      }
   }

}