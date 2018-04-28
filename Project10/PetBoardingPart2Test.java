import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;

/**
 * PetBoardingPart2 Tests.
 *
 * @author Jared R. Porter
 * @version 11/17/2016
 */
public class PetBoardingPart2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**
    *No command line arguments test. 
    */
   @Test public void noArgsTest() {
   
   // You should be checking for args.length == 0
       // in PetBoardingPart2, and the following should exercise 
       // the code for true.
      PetBoardingList.resetListCount();
      String[] args1 = {}; // an empty String[] PetBoardingPart2.main(args1);
      Assert.assertEquals("Pet Boarding List count should be 0. ",
         0, PetBoardingList.getListCount());
   }
   
   /**
    * Test main method arguments.
    *
    * @throws IOException in main
    */
   @Test public void mainTest() throws IOException {
      PetBoardingList.resetListCount();
      String[] args2 = {"pet_boarding_data.csv"};
   // element args2[0] is the file name
      PetBoardingPart2.main(args2);
      Assert.assertEquals("Pet Boarding List count should be 1. ",
         1, PetBoardingList.getListCount());
         
   // to exercise the default constructor
      PetBoardingPart2 app = new PetBoardingPart2();
   }
}
