import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;


/**
  * Program that creates, compiles 
  * and runs a JUnit test file.
  * 
  * Activity 8.  
  * @author Avery Fox
  * @version 10-22-22
  */ 

public class RingTorusListTest {

   private String listName = "List Test Name";
   private static int sizeOfArrTest = 0;
   private RingTorus[] rtObjListTest = new RingTorus[20];
   private RingTorus[] rtObjListNull = new RingTorus[20];


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
      sizeOfArrTest = 0;
   }


   /** A test that always fails. **/
   // @Test public void defaultTest() {
      // Assert.assertEquals("Default test added by jGRASP. Delete "
         //     + "this test once you have added your own.", 0, 1);
   // }
   
   /**
    * gets name test.
    * @throws Exception
    *
    */
   @Test
    public void getNameTest() throws Exception {
      RingTorusList ellTest2 = new RingTorusList(listName, 
         rtObjListTest, sizeOfArrTest);
      Assert.assertEquals("", "List Test Name", ellTest2.getName());
   }
   
   /**
    * counts num of RingTorus.
    *@throws Exception contains. 
    */
   @Test
    public void numberOfRingTorusesTest() throws Exception {
      setUp();
      for (int i = 0; i < 5; i++) {
         RingTorus ellObj = new RingTorus("test" + i, i + 0.12, i + 0.34);
         rtObjListTest[i] = ellObj;
         sizeOfArrTest++;
      }
      RingTorusList ellTest2 = new RingTorusList(listName, 
         rtObjListTest, sizeOfArrTest);
      Assert.assertEquals("", 5, ellTest2.numberOfRingToruses());
      RingTorusList ellNullTest2 = new RingTorusList(listName, 
         rtObjListNull, 1);
      Assert.assertEquals("", 0, ellNullTest2.numberOfRingToruses());
   }
   
   /**
    * Total surfce area.
    *@throws Exception contains.
    */
   @Test
    public void totalSurfaceAreaTest() throws Exception {
      setUp();
      for (int i = 0; i < 5; i++) {
         RingTorus ellObj = new RingTorus("test" + i, i + 0.12, i + 0.34);
         rtObjListTest[i] = ellObj;
         sizeOfArrTest++;
      }
      RingTorusList ellTest2 = new RingTorusList(listName, 
         rtObjListTest, sizeOfArrTest);
      double total = 0;
      for (int i = 0; i < sizeOfArrTest; i++) {
         total += rtObjListTest[i].surfaceArea();
      }
      
      Assert.assertEquals("", total, ellTest2.totalSurfaceArea(), .001);
   } 
    
    /**
    * Total Volume Test. 
    *@throws Exception contains. 
    */
    
   @Test
    public void totalVolumeTest() throws Exception {
      setUp();
      for (int i = 0; i < 5; i++) {
         RingTorus ellObj = new RingTorus("test" + i, i + 0.12, i + 0.34);
         rtObjListTest[i] = ellObj;
         sizeOfArrTest++;
      }
      RingTorusList ellTest2 = new RingTorusList(listName, 
         rtObjListTest, sizeOfArrTest);
      double total = 0;
      for (int i = 0; i < sizeOfArrTest; i++) {
         total += rtObjListTest[i].volume();
      }
      
      Assert.assertEquals("", total, ellTest2.totalVolume(), .001);
   } 
   
   /**
    * Toatl diameter Test. 
    *@throws Exception contains.
    */
   @Test
    public void totalDiameterTest() throws Exception {
      setUp();
      for (int i = 0; i < 5; i++) {
         RingTorus ellObj = new RingTorus("test" + i, i + 0.12, i + 0.34);
         rtObjListTest[i] = ellObj;
         sizeOfArrTest++;
      }
      RingTorusList ellTest2 = new RingTorusList(listName, 
         rtObjListTest, sizeOfArrTest);
      double total = 0;
      for (int i = 0; i < sizeOfArrTest; i++) {
         total += rtObjListTest[i].diameter();
      }
      
      Assert.assertEquals("", total, ellTest2.totalDiameter(), .001);
   } 
    
    
    /**
    * Average Surface Area Test.
    *@throws Exception contains.
    */
   @Test
    public void averageSurfaceAreaTest() throws Exception {
      setUp();
      for (int i = 0; i < 5; i++) {
         RingTorus ellObj = new RingTorus("test" + i, i + 0.12, i + 0.34);
         rtObjListTest[i] = ellObj;
         sizeOfArrTest++;
      }
      RingTorusList ellTest2 = new RingTorusList(listName, 
         rtObjListTest, sizeOfArrTest);
      double total = 0;
      for (int i = 0; i < sizeOfArrTest; i++) {
         total += (rtObjListTest[i].surfaceArea()) / sizeOfArrTest;
      }
      
      Assert.assertEquals("", total, ellTest2.averageSurfaceArea(), .001);
   } 
    
    /**
    * Average volume test.
    *@throws Exception contains.
    */
   @Test
    public void averageVolumeTest() throws Exception {
      setUp();
      for (int i = 0; i < 5; i++) {
         RingTorus ellObj = new RingTorus("test" + i, i + 0.12, i + 0.34);
         rtObjListTest[i] = ellObj;
         sizeOfArrTest++;
      }
      RingTorusList ellTest2 = new RingTorusList(listName, 
         rtObjListTest, sizeOfArrTest);
      double total = 0;
      for (int i = 0; i < sizeOfArrTest; i++) {
         total += (rtObjListTest[i].volume()) / sizeOfArrTest;
      }
      
      Assert.assertEquals("", total, ellTest2.averageVolume(), .001);
   } 
   
   /**
    * Average diameter test. 
    *@throws Exception contains.
    */
   @Test public void averageDiameterTest() throws Exception {
      setUp();
      for (int i = 0; i < 5; i++) {
         RingTorus ellObj = new RingTorus("test" + i, i + 0.12, i + 0.34);
         rtObjListTest[i] = ellObj;
         sizeOfArrTest++;
      }
      RingTorusList ellTest2 = new RingTorusList(listName, 
         rtObjListTest, sizeOfArrTest);
      double total = 0;
      for (int i = 0; i < sizeOfArrTest; i++) {
         total += (rtObjListTest[i].diameter()) / sizeOfArrTest;
      }
      
      Assert.assertEquals("", total, ellTest2.averageDiameter(), .001);
   } 
    
    /**
    *
    *@throws Exception.
    */
   // @Test public void toStringTest() throws Exception {
      // RingTorus[] el = new RingTorus[100];
      // el[0] = new RingTorus("Ex 1", 1.0, 2.0); 
      // el[1] = new RingTorus("Ex 2", 1.1, 2.1); 
      // el[2] = new RingTorus("Ex 3", 1.2, 2.2); 
   //     
      // RingTorusList eList = new RingTorusList("Test List", el, 3);
   //     
      // Assert.assertEquals("toString test", true, 
         //eList.toString().contains("123,456 square units"));
   // }
   
   /**
   *Test for toString method.*/
   
   @Test public void toStringTest() {
   
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
         
      Assert.assertEquals("toStringTest", true,
            ex1.toString().contains("units"));
   
   
   }
      
//    /**
//     *
//     *@throws Exception.
//     */
   // @Test public void summaryInfoTest() throws Exception {
      // setUp();
      // for (int i = 0; i < 5; i++) {
         // RingTorus ellObj = new RingTorus("test" + i, i + 0.12, i + 0.34);
         // rtObjListTest[i] = ellObj;
      //  
      // }
      // RingTorusList ellTest2 = new RingTorusList(listName, 
         //rtObjListTest, sizeOfArrTest);
   //     
      // Assert.assertEquals("", true, 
         //ellTest2.summaryInfo().contains("Total Volume: "));
   // } 
    
    /**
    * Gets list test.
    *@throws Exception contains.
    */
   @Test public void getListTest() throws Exception {
      setUp();
      RingTorusList ellTest2 = new RingTorusList(listName, 
         rtObjListTest, sizeOfArrTest);
      
      Assert.assertArrayEquals("", rtObjListTest, ellTest2.getList());
   }
      
   /**
    * Adds ring torus. 
    *@throws Exception contains.
    */
   // @Test public void addRingTorusTest() throws Exception {
      // setUp();
      // for (int i = 0; i < 5; i++) {
         // RingTorus ellObj = new RingTorus("test" + i, i + 0.12, i + 0.34);
         // rtObjListTest[i] = ellObj;
         // sizeOfArrTest++;
      // }
      // RingTorusList ellTest2 = new RingTorusList(listName, 
         // rtObjListTest, sizeOfArrTest);
   //     
      // RingTorus dTrue = new RingTorus("test", 1.2, 2.2);
      // ellTest2.addRingTorus("test", 1.1, 2.2);
   //     
      // Assert.assertEquals("", dTrue, rtObjListTest[sizeOfArrTest]);
   // } 
    
    /**
    * Finds ring torus. 
    *@throws Exception contains.
    */
   @Test public void findRingTorusTest() throws Exception {
      // RingTorus[] el = new RingTorus[100];
      // el[0] = new RingTorus("Ex 1", 1.0, 2.0); 
      // el[1] = new RingTorus("Ex 2", 1.1, 2.1); 
      // el[2] = new RingTorus("Ex 3", 1.2, 2.2); 
   //     
      // RingTorusList eList = new RingTorusList("Test List", el, 3);
   //     
      // Assert.assertEquals("find RingTorus Test", el[0], 
         // eList.findRingTorus("Ex1"));
      // Assert.assertEquals("find RingTorus Test", el[1], 
         // eList.findRingTorus("Ex2"));
      // Assert.assertEquals("find RingTorus Test", el[2], 
         // eList.findRingTorus("Ex3"));
   //     
      // RingTorusList eList2 = new RingTorusList("Test List", null, 0);
      // Assert.assertEquals("find RingTorus Test", 
         // null, eList2.findRingTorus("Ex1"));
       
     
   }
      
      /**
    * Delates ring torus. 
    *@throws Exception contains.
    */
   // @Test public void deleteRingTorusTest() throws Exception {
      // RingTorus[] el = new RingTorus[100];
      // el[0] = new RingTorus("Ex 1", 1.0, 2.0); 
      // el[1] = new RingTorus("Ex 2", 1.1, 2.1); 
      // el[2] = new RingTorus("Ex 3", 1.2, 2.2); 
   //     
      // RingTorusList eList = new RingTorusList("Test List", el, 3);
   //     
      // eList.deleteRingTorus("Ex2");
      // Assert.assertEquals("delete RingTorus Test", el[1], 
         // eList.findRingTorus("Ex3"));
   //     
      // eList.deleteRingTorus("Ex3");
      // Assert.assertEquals("delete RingTorus Test", null, 
         // eList.findRingTorus("Ex3"));
   //     
      // eList.deleteRingTorus("Ex5");
      // Assert.assertEquals("delete RingTorus Test", null, 
         // eList.findRingTorus("Ex5"));
   //     
   //  
   // }
      
      /**
    * Edits ring torus.
    *@throws Exception contains.
    */
   // @Test public void editRingTorusTest() throws Exception {
      // RingTorus[] el = new RingTorus[100];
      // el[0] = new RingTorus("Ex 1", 1.0, 2.0); 
      // el[1] = new RingTorus("Ex 2", 1.1, 2.1); 
      // el[2] = new RingTorus("Ex 3", 1.2, 2.2); 
   //     
      // RingTorusList eList = new RingTorusList("Test List", el, 3);
   //     
      // RingTorus e = new RingTorus("Ex 1", 1, 2);
      // RingTorus e2 = new RingTorus("Ex 1", 3, 4);
      // RingTorus e3 = new RingTorus("Ex 1", 5, 6);
   //     
      // eList.editRingTorus("Ex1", 1, 2);
      // Assert.assertEquals("edit RingTorus Test", e, el[0]);
   //     
      // eList.editRingTorus("Ex2", 3, 4);
      // Assert.assertEquals("edit RingTorus Test", e2, el[1]);
   //     
      // eList.editRingTorus("Ex3", 5, 6);
      // Assert.assertEquals("edit RingTorus Test", e3, el[2]);
   //     
      // eList.editRingTorus("Ex4", 7, 8);
      // Assert.assertEquals("edit RingTorus Test", null, el[3]);
   //              
   // }
      
      /**
    * Finds ring torus. 
    *@throws Exception contains.
    */
    
   // @Test public void findRingTorusWithLargestVolumeTest() throws Exception {
      // setUp();
      // for (int i = 0; i < 5; i++) {
         // RingTorus ellObj = new RingTorus("test" + i, i + 0.12, i + 0.34);
         // rtObjListTest[i] = ellObj;
         // sizeOfArrTest++;
      // }
      // RingTorusList ellTest2 = new RingTorusList(listName, 
         // rtObjListTest, sizeOfArrTest);
   //     
      // RingTorus dTrue = new RingTorus("test4", 1.2, 2.2);
      // Assert.assertEquals("", dTrue, ellTest2.findRingTorusWithLargestVolume());
   //   
   //   
   //   
   // }
   
   /**
   *Test for volume method.
   */
   
   
}
   

