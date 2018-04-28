import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * BoardingCostComparator Tests.
 *
 * @author Jared R. Porter
 * @version 11/17/2016
 */
public class BoardingCostComparatorTest {

   private BoardingCostComparator test = new BoardingCostComparator();

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
      Assert.assertEquals(-1, test.compare(d, c));
   }
   
   /**
    * Test for positive return value.
    */
   @Test public void positiveTest() {
      Cat c = new Cat("Owner 1", "Kitty", "House Cat", 15.0, 7, 9);
      Dog d = new Dog("Owner 2", "Rex", "Boxer", 90.0, 7);
      Assert.assertEquals(1, test.compare(c, d));
   }
   
   /**
    * Test for equal (0) return value.
    */
   @Test public void equalTest() {
      Dog d = new Dog("Owner 1", "Rex", "Boxer", 90.0, 7);
      Dog d2 = new Dog("Owner 2", "Spot", "Pit Bull", 90.0, 7);
      Assert.assertEquals(0, test.compare(d, d2));
   }
}
