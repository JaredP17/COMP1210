import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests Horse class.
 *
 * @author Jared R. Porter
 * @version 11/17/2016
 */
public class HorseTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**
    * Exercise Fee methods test.
    */
   @Test public void exerciseFeeTest() {
      Horse h = new Horse("Jessie Rider", "King", "Quarter Horse",
                           1000, 7, 10.0);
      h.toString(); // Takes care of toString() check in Web-Cat
      h.setExerciseFee(20);
      Assert.assertEquals(20, h.getExerciseFee(), .001); 
   }
   
   
   /**
    * Boarding Cost method test.
    */
   @Test public void boardingCostTest() {
      Horse h = new Horse("Jessie Rider", "King", "Quarter Horse",
                           1000, 7, 10.0);
   
      Assert.assertEquals(245, h.boardingCost(), .001); 
   }
}
