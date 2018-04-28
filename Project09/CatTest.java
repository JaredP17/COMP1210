import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Cat tests.
 *
 * @author Jared R. Porter
 * @version 11/10/2016
 */
public class CatTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /**
    * Owner methods test.
    */
   @Test public void ownerTest() {
   
      Cat c = new Cat("Barb Jones", "Callie", "Siamese", 9.0, 7, 9);
      c.toString(); // Takes care of toString() check in Web-Cat
      c.setOwner("New Owner");
      Assert.assertEquals("New Owner", c.getOwner());
   }
   
   /**
    * Name methods test.
    */
   @Test public void nameTest() {
    
      Cat c = new Cat("Barb Jones", "Callie", "Siamese", 9.0, 7, 9);
      c.setName("New Name");
      Assert.assertEquals("New Name", c.getName());
   }
   
   /**
    * Breed methods test.
    */
   @Test public void breedTest() {
    
      Cat c = new Cat("Barb Jones", "Callie", "Siamese", 9.0, 7, 9);
      c.setBreed("New Breed");
      Assert.assertEquals("New Breed", c.getBreed());
   }
   
   /**
    * Weight methods test.
    */
   @Test public void weightTest() {
    
      Cat c = new Cat("Barb Jones", "Callie", "Siamese", 9.0, 7, 9);
      c.setWeight(100);
      Assert.assertEquals(100, c.getWeight(), .001);
   }
   
   /**
    * Days methods test.
    */
   @Test public void daysTest() {
    
      Cat c = new Cat("Barb Jones", "Callie", "Siamese", 9.0, 7, 9);
      c.setDays(10);
      Assert.assertEquals(10, c.getDays());
   }
   
   /**
    * Boarding Cost test.
    */
   @Test public void boardingCostTest() {
    
      Cat c = new Cat("Barb Jones", "Callie", "Siamese", 9.0, 7, 9);
      Assert.assertEquals(76.30, c.boardingCost(), .001);
   }
   
}
