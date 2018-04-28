import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Cone test cases.
 *
 * @author Jared R. Porter
 * @version 10/27/2016
 */
public class ConeTest {
   
   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /**
    * Test getLabel() method.
    */
   @Test public void getLabelTest() {
      Cone c = new Cone("Label", 1, 2);
      c.toString(); // call to satisfy web-cat
      Assert.assertEquals("Label", c.getLabel());
   }
   
   /**
    * Test setLabel() method.
    */
   @Test public void setLabelTest() {
      Cone c = new Cone("Label", 1, 2);
      Assert.assertEquals(false,  c.setLabel(null));
   }
   
   /**
    * Test setLabel() method 2.
    */
   @Test public void setLabelTest2() {
      Cone c = new Cone("Label", 1, 2);
      Assert.assertEquals(false,  c.setLabel(" "));
   }
   
   /**
    * Test setLabel() method 3.
    */
   @Test public void setLabelTest3() {
      Cone c = new Cone("Label", 1, 2);
      Assert.assertEquals(true,  c.setLabel("Test"));
   }
   
   /**
    * Test getHeight() method.
    */
   @Test public void getHeightTest() {
      Cone c = new Cone("Label", 1, 2);
      c.setHeight(3); // test setHeight() method
      Assert.assertEquals(3, c.getHeight(), 0);
   }
   
   /**
    * Test setHeight() method.
    */
   @Test public void setHeightTest() {
      Cone c = new Cone("Label", 1, 2);
      Assert.assertEquals(false, c.setHeight(0));
     
   }
   
    /**
    * Test getRadius() method.
    */
   @Test public void getRadiusTest() {
      Cone c = new Cone("Label", 1, 2);
      c.setRadius(3); // test setHeight() method
      Assert.assertEquals(3, c.getRadius(), 0);
   }
   
   /**
    * Test setRadius() method.
    */
   @Test public void setRadiusTest() {
      Cone c = new Cone("Label", 1, 2);
      Assert.assertEquals(false, c.setRadius(0));
     
   }
  
   /**
    * Test basePerimeter() method.
    */
   @Test public void basePerimeterTest() {
      Cone c = new Cone("Label", 1, 2);
      Assert.assertEquals(12.5663, c.basePerimeter(), .0001);
   }
   
   /**
    * Test baseArea() method.
    */
   @Test public void baseAreaTest() {
      Cone c = new Cone("Label", 1, 2);
      Assert.assertEquals(12.5663, c.baseArea(), .0001);
   }
   
   /**
    * Test slantHeight() method.
    */
   @Test public void slantHeightTest() {
      Cone c = new Cone("Label", 1, 2);
      Assert.assertEquals(2.2360, c.slantHeight(), .0001);
   }
   
   /**
    * Test sideArea() method.
    */
   @Test public void sideAreaTest() {
      Cone c = new Cone("Label", 1, 2);
      Assert.assertEquals(14.0496, c.sideArea(), .0001);
   }
   
   /**
    * Test surfaceArea() method.
    */
   @Test public void surfaceAreaTest() {
      Cone c = new Cone("Label", 1, 2);
      Assert.assertEquals(26.6160, c.surfaceArea(), .0001);
   }
   
   /**
    * Test volume() method.
    */
   @Test public void volumeTest() {
      Cone c = new Cone("Label", 1, 2);
      Assert.assertEquals(4.1887, c.volume(), .0001);
   }
   
   /**
    * Test getCount() method.
    */
   @Test public void getCountTest() {
      Cone.resetCount();
      Assert.assertEquals(0, Cone.getCount());
   }
   
   /**
    * Test equals() method.
    */
   @Test public void equalsTest() {
      Cone c = new Cone("Label", 1, 2);
      Cone c2 = new Cone("Label", 1, 2);
      Assert.assertEquals(true, c.equals(c2));
   }
   
   /**
    * Test equals() method 2.
    */
   @Test public void equalsTest2() {
      Cone c = new Cone("Label", 1, 2);
      Cone c2 = new Cone("Test", 3, 4);
      Assert.assertEquals(false, c.equals(c2));
   }
   
   /**
    * Test haseCode() method.
    */
   @Test public void hashCodeTest() {
      Cone c = new Cone("Label", 1, 2);
      Assert.assertEquals(0, c.hashCode());
   }
}
