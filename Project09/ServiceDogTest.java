import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** 
 * Test ServiceDog class.
 *
 * @author Jared R. Porter
 * @version 11/10/2016
 */
public class ServiceDogTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** 
    * Service methods test.
    */
   @Test public void serviceTest() {
      ServiceDog d2 = new ServiceDog("Jen Baker", "Pepper", "Sheppard",
          60, 7, "guide dog", "sit", "down", "stay", "come", "around",
          "forward", "right", "left");
          
      d2.toString(); // Takes care of toString() check in Web-Cat
          
      d2.setService("New Service");
          
      Assert.assertEquals("New Service", d2.getService());
      
   }
   
   /** 
    * Commands methods test.
    */
   @Test public void commandsTest() {
      ServiceDog d2 = new ServiceDog("Jen Baker", "Pepper", "Sheppard",
          60, 7, "guide dog", "sit", "down", "stay", "come", "around",
          "forward", "right", "left");
          
      d2.setCommands("play dead", "roll over", "speak", "spin");
          
      Assert.assertEquals(new String[]{"play dead", "roll over",
                                       "speak", "spin"}, d2.getCommands());
   }
}
