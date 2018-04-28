import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * PetBoardingPart1 test class.
 *
 * @author Jared R. Porter
 * @version 11/10/2016
 */
public class PetBoardingPart1Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /**
    * Count method test.
    */
   @Test public void countTest() {
   
   // covers the default constructor (Web-CAT will check for this)
      PetBoardingPart1 pbp1 = new PetBoardingPart1();
   
      // checks class variable count
      Pet.resetCount();
      PetBoardingPart1.main(null); 
      Assert.assertEquals("Pet.count should be 4. ", 4, Pet.getCount());
   }
}
