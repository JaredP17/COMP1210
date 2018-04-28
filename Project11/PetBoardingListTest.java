import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;

/**
 * PetBoardingList Tests.
 *
 * @author Jared R. Porter
 * @version 11/17/2016
 */
public class PetBoardingListTest {

   private PetBoardingList pList = new PetBoardingList();
   
   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**
    * Test listName methods.
    */
   @Test public void listNameTest() {
      pList.setListName("Test List");
      Assert.assertEquals("Test List", pList.getListName());
   }
   
   /**
    * Test petList methods.
    */
   @Test public void petListTest() {
      pList.setPetList(new Pet[100]);
      Assert.assertEquals(new Pet[100], pList.getPetList());
   }
   
   /**
    * Test petCount methods.
    */
   @Test public void petCountTest() {
      pList.setPetCount(100);
      Assert.assertEquals(100, pList.getPetCount());
   }
   
   /**
    * Test excludedRecords methods.
    */
   @Test public void excludedRecordsTest() {
      pList.setExcludedRecords(new String[30]);
      Assert.assertEquals(new String[30], pList.getExcludedRecords());
   }
   
   /**
    * Test excludedCount methods.
    */
   @Test public void excludedCountTest() {
      pList.setExcludedCount(30);
      Assert.assertEquals(30, pList.getExcludedCount());
   }
   
   /**
    * Test listCount methods.
    */
   @Test public void listCountTest() {
      PetBoardingList.resetListCount();
      Assert.assertEquals(0, PetBoardingList.getListCount());
   }
   
   /**
    * Test readPetFile method.
    *
    * @throws IOException in main
    */
   @Test public void readPetFileTest() throws IOException {
      pList.readPetFile("pet_boarding_data.csv");
      pList.generateReport();
      pList.generateReportByOwner();
      pList.generateReportByPetName();
      pList.generateReportByBoardingCost();
      pList.generateExcludedRecordsReport();
   }
}
