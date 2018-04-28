import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for Dog class.
 *
 * @author Jared R. Porter
 * @version 11/17/2016
 */
public class DogTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** 
    * Boarding Cost test.
    */
   @Test public void boardingCostTest() {
      Dog d = new Dog("Jake Smith", "Honey", "Great Dane", 60, 7);
      Assert.assertEquals(105.00, d.boardingCost(), .001);
   }
}
