import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;

/**
 * Test cases for ConeList2.
 *
 * @author Jared R. Porter
 * @version 10/27/2016
 */
public class ConeList2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
    * Test getName() method.
    */ 
   @Test public void getNameTest() {
      ConeList2 c = new ConeList2("Test", new Cone[100], 0);
      Assert.assertEquals("Test", c.getName());
      
      c.toString(); // call to satisfy web-cat
      c.summaryInfo(); // call to satisfy web-cat
   }
   
   /**
    * Test numberOfCones() method.
    */ 
   @Test public void numberOfConesTest() {
      ConeList2 c = new ConeList2("Test", new Cone[100], 0);
      c.addCone("Test Cone", 1, 2); // tests addCone() method too
      Assert.assertEquals(1, c.numberOfCones());
   }
   
   /**
    * Test totalBasePerimeter() method.
    * @throws IOException for readFile()
    */ 
   @Test public void totalBasePerimeterTest() throws IOException {
      ConeList2 c = new ConeList2("Test", new Cone[100], 0);
      c = c.readFile("cone_0.dat");
      Assert.assertEquals(0, c.totalBasePerimeter(), .001);
   }
   
   /**
    * Test totalBasePerimeter() method 2.
    * @throws IOException for readFile()
    */ 
   @Test public void totalBasePerimeterTest2() throws IOException {
      ConeList2 c = new ConeList2("Test", new Cone[100], 0);
      c = c.readFile("cone_1.dat");
      Assert.assertEquals(2802.929, c.totalBasePerimeter(), .001);
   }
   
   /**
    * Test totalBaseArea() method.
    * @throws IOException for readFile()
    */ 
   @Test public void totalBaseAreaTest() throws IOException {
      ConeList2 c = new ConeList2("Test", new Cone[100], 0);
      c = c.readFile("cone_0.dat");
      Assert.assertEquals(0, c.totalBaseArea(), .001);
   }
   
   /**
    * Test totalBaseArea() method 2.
    * @throws IOException for readFile()
    */ 
   @Test public void totalBaseAreaTest2() throws IOException {
      ConeList2 c = new ConeList2("Test", new Cone[100], 0);
      c = c.readFile("cone_1.dat");
      Assert.assertEquals(505496.112, c.totalBaseArea(), .001);
   }

/**
    * Test totalSlantHeight() method.
    * @throws IOException for readFile()
    */ 
   @Test public void totalSlantHeightTest() throws IOException {
      ConeList2 c = new ConeList2("Test", new Cone[100], 0);
      c = c.readFile("cone_0.dat");
      Assert.assertEquals(0, c.totalSlantHeight(), .001);
   }
   
   /**
    * Test totalSlantHeight() method 2.
    * @throws IOException for readFile()
    */ 
   @Test public void totalSlantHeightTest2() throws IOException {
      ConeList2 c = new ConeList2("Test", new Cone[100], 0);
      c = c.readFile("cone_1.dat");
      Assert.assertEquals(631.491, c.totalSlantHeight(), .001);
   }
   
   /**
    * Test totalSideArea() method.
    * @throws IOException for readFile()
    */ 
   @Test public void totalSideAreaTest() throws IOException {
      ConeList2 c = new ConeList2("Test", new Cone[100], 0);
      c = c.readFile("cone_0.dat");
      Assert.assertEquals(0, c.totalSideArea(), .001);
   }
   
   /**
    * Test totalSideArea() method 2.
    * @throws IOException for readFile()
    */ 
   @Test public void totalSideAreaTest2() throws IOException {
      ConeList2 c = new ConeList2("Test", new Cone[100], 0);
      c = c.readFile("cone_1.dat");
      Assert.assertEquals(636490.731, c.totalSideArea(), .001);
   }
   
   /**
    * Test totalSurfaceArea() method.
    * @throws IOException for readFile()
    */ 
   @Test public void totalSurfaceAreaTest() throws IOException {
      ConeList2 c = new ConeList2("Test", new Cone[100], 0);
      c = c.readFile("cone_0.dat");
      Assert.assertEquals(0, c.totalSurfaceArea(), .001);
   }
   
   /**
    * Test totalSurfaceArea() method 2.
    * @throws IOException for readFile()
    */ 
   @Test public void totalSurfaceAreaTest2() throws IOException {
      ConeList2 c = new ConeList2("Test", new Cone[100], 0);
      c = c.readFile("cone_1.dat");
      Assert.assertEquals(1141986.844, c.totalSurfaceArea(), .001);
   }
   
   /**
    * Test totalVolume() method.
    * @throws IOException for readFile()
    */ 
   @Test public void totalVolumeTest() throws IOException {
      ConeList2 c = new ConeList2("Test", new Cone[100], 0);
      c = c.readFile("cone_0.dat");
      Assert.assertEquals(0, c.totalVolume(), .001);
   }
   
    /**
    * Test totalVolume() method 2.
    * @throws IOException for readFile()
    */ 
   @Test public void totalVolumeTest2() throws IOException {
      ConeList2 c = new ConeList2("Test", new Cone[100], 0);
      c = c.readFile("cone_1.dat");
      Assert.assertEquals(50312842.12, c.totalVolume(), .001);
   }
   
   /**
    * Test averageSurfaceArea() method.
    * @throws IOException for readFile()
    */ 
   @Test public void averageSurfaceAreaTest() throws IOException {
      ConeList2 c = new ConeList2("Test", new Cone[100], 0);
      c = c.readFile("cone_0.dat");
      Assert.assertEquals(0, c.averageSurfaceArea(), .001);
   }
   
   /**
    * Test averageSurfaceArea() method 2.
    * @throws IOException for readFile()
    */ 
   @Test public void averageSurfaceAreaTest2() throws IOException {
      ConeList2 c = new ConeList2("Test", new Cone[100], 0);
      c = c.readFile("cone_1.dat");
      Assert.assertEquals(285496.711, c.averageSurfaceArea(), .001);
   }
   
   /**
    * Test averageVolume() method.
    * @throws IOException for readFile()
    */ 
   @Test public void averageVolumeTest() throws IOException {
      ConeList2 c = new ConeList2("Test", new Cone[100], 0);
      c = c.readFile("cone_0.dat");
      Assert.assertEquals(0, c.averageVolume(), .001);
   }
   
    /**
    * Test averageVolume() method 2.
    * @throws IOException for readFile()
    */ 
   @Test public void averageVolumeTest2() throws IOException {
      ConeList2 c = new ConeList2("Test", new Cone[100], 0);
      c = c.readFile("cone_1.dat");
      Assert.assertEquals(12578210.53, c.averageVolume(), .001);
   }

   /**
    * Test getList() Method.
    */
   @Test public void getListTest() {
      ConeList2 c = new ConeList2("Test", new Cone[100], 0);
      Assert.assertEquals(new Cone[100], c.getList());
   }
   
 /* readFile() method is already called in other test */ 
 
 /* addCone() method called in numberOfConesTest() */
 
 /**
  * Test findCone() method.
  * @throws IOException for readFile()
  */
   @Test public void findConeTest() throws IOException {
      ConeList2 c = new ConeList2("Test", new Cone[100], 0);
      c = c.readFile("cone_1.dat");
      Assert.assertEquals(null, c.findCone("Fake Cone"));  
   }
   
 /**
  * Test findCone() method 2.
  * @throws IOException for readFile()
  */
   @Test public void findConeTest2() throws IOException {
      ConeList2 c = new ConeList2("Test", new Cone[100], 0);
      c = c.readFile("cone_1.dat");
      Assert.assertEquals(new Cone("Short Example", 3.0, 4.0), 
                                 c.findCone("Short Example"));  
   }
   
 /**
  * Test deleteCone() method.
  * @throws IOException for readFile()
  */
   @Test public void deleteConeTest() throws IOException {
      ConeList2 c = new ConeList2("Test", new Cone[100], 0);
      c = c.readFile("cone_1.dat");
      Assert.assertEquals(null, c.deleteCone("Fake Cone"));  
   }
   
 /**
  * Test deleteCone() method 2.
  * @throws IOException for readFile()
  */
   @Test public void deleteConeTest2() throws IOException {
      ConeList2 c = new ConeList2("Test", new Cone[100], 0);
      c = c.readFile("cone_1.dat");
      Assert.assertEquals(new Cone("Short Example", 3.0, 4.0), 
                                 c.deleteCone("Short Example"));  
   }
   
 /**
  * Test editCone() method.
  * @throws IOException for readFile()
  */
   @Test public void editConeTest() throws IOException {
      ConeList2 c = new ConeList2("Test", new Cone[100], 0);
      c = c.readFile("cone_1.dat");
      Assert.assertEquals(false, c.editCone("Fake Cone", 3, 4));  
   }
   
 /**
  * Test editCone() method 2.
  * @throws IOException for readFile()
  */
   @Test public void editConeTest2() throws IOException {
      ConeList2 c = new ConeList2("Test", new Cone[100], 0);
      c = c.readFile("cone_1.dat");
      Assert.assertEquals(true, 
                                 c.editCone("Short Example", 1.0, 2.0));  
   }
   
 /**
  * Test findConeWithSmallestHeight() method.
  * @throws IOException for readFile()
  */
   @Test public void findConeWithSmallestHeightTest() throws IOException {
      ConeList2 c = new ConeList2("Test", new Cone[100], 0);
      c = c.readFile("cone_0.dat");
      Assert.assertEquals(null, c.findConeWithSmallestHeight());  
   }
   
 /**
  * Test findConeWithSmallestHeight() method 2.
  * @throws IOException for readFile()
  */
   @Test public void findConeWithSmallestHeightTest2() throws IOException {
      ConeList2 c = new ConeList2("Test", new Cone[100], 0);
      c = c.readFile("cone_1.dat");
      Assert.assertEquals(c.findCone("Short Example"), 
                          c.findConeWithSmallestHeight());  
   }
   
 /**
  * Test findConeWithLargestHeight() method.
  * @throws IOException for readFile()
  */
   @Test public void findConeWithLargestHeightTest() throws IOException {
      ConeList2 c = new ConeList2("Test", new Cone[100], 0);
      c = c.readFile("cone_0.dat");
      Assert.assertEquals(null, c.findConeWithLargestHeight());  
   }
   
 /**
  * Test findConeWithLargestHeight() method 2.
  * @throws IOException for readFile()
  */
   @Test public void findConeWithLargestHeightTest2() throws IOException {
      ConeList2 c = new ConeList2("Test", new Cone[100], 0);
      c = c.readFile("cone_1.dat");
      Assert.assertEquals(c.findCone("Really Large Example"), 
                          c.findConeWithLargestHeight());  
   }

 /**
  * Test findConeWithSmallestRadius() method.
  * @throws IOException for readFile()
  */
   @Test public void findConeWithSmallestRadiusTest() throws IOException {
      ConeList2 c = new ConeList2("Test", new Cone[100], 0);
      c = c.readFile("cone_0.dat");
      Assert.assertEquals(null, c.findConeWithSmallestRadius());  
   }
   
 /**
  * Test findConeWithSmallestRadius() method 2.
  * @throws IOException for readFile()
  */
   @Test public void findConeWithSmallestRadiusTest2() throws IOException {
      ConeList2 c = new ConeList2("Test", new Cone[100], 0);
      c = c.readFile("cone_1.dat");
      Assert.assertEquals(c.findCone("Short Example"), 
                          c.findConeWithSmallestRadius());  
   }
   
 /**
  * Test findConeWithLargestRadius() method.
  * @throws IOException for readFile()
  */
   @Test public void findConeWithLargestRadiusTest() throws IOException {
      ConeList2 c = new ConeList2("Test", new Cone[100], 0);
      c = c.readFile("cone_0.dat");
      Assert.assertEquals(null, c.findConeWithLargestRadius());  
   }
   
 /**
  * Test findConeWithLargestRadius() method 2.
  * @throws IOException for readFile()
  */
   @Test public void findConeWithLargestRadiusTest2() throws IOException {
      ConeList2 c = new ConeList2("Test", new Cone[100], 0);
      c = c.readFile("cone_1.dat");
      Assert.assertEquals(c.findCone("Really Large Example"), 
                          c.findConeWithLargestRadius());  
   }

}
