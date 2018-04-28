import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * PetNameComparator Tests.
 *
 * @author Jared R. Porter
 * @version 11/17/2016
 */
public class PetNameComparatorTest {

   private PetNameComparator test = new PetNameComparator();
 
   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**
    * Test for negative return value.
    */
   @Test public void negativeTest() {
      Cat c = new Cat("Owner 1", "Kitty", "House Cat", 15.0, 7, 9);
      Dog d = new Dog("Owner 2", "Rex", "Boxer", 90.0, 7);
     
      int value = 0;
      
      if (test.compare(c, d) < 0) {
         value = -1;
      }
      
      Assert.assertEquals(-1, value);
   }
   
   /**
    * Test for positive return value.
    */
   @Test public void positiveTest() {
      Cat c = new Cat("Owner 1", "Kitty", "House Cat", 15.0, 7, 9);
      Dog d = new Dog("Owner 2", "Rex", "Boxer", 90.0, 7);
      
      int value = 0;
      
      if (test.compare(d, c) > 0) {
         value = 1;
      }
      
      Assert.assertEquals(1, value);
   }
   
   /**
    * Test for equal (0) return value.
    */
   @Test public void equalTest() {
      Cat c = new Cat("Owner 1", "Rex", "House Cat", 15.0, 7, 9);
      Dog d = new Dog("Owner 2", "Rex", "Boxer", 90.0, 7);
      Assert.assertEquals(0, test.compare(c, d));
   }
}
