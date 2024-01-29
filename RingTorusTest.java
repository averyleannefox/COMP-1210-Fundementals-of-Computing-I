import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
  * Program that creates, compiles 
  * and runs a JUnit test file.
  * 
  * Activity 7A.  
  * @author Avery Fox
  * @version 10-10-22
  */ 


public class RingTorusTest {


 /** Fixture initialization (common initialization
      * for all tests). **/
   @Before public void setUp() {
   }
    
    
   /** A test that always fails. **/
   @Test public void getMethodTest() {
   
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
   
      Assert.assertEquals("Small Example", ex1.getLabel());
      Assert.assertEquals("getLargeRadiusTest", 
         9.5, ex1.getLargeRadius(), 0.0001);
   }

   /**
    *Test for surface area method.*/
   @Test public void surfaceAreaTest() {
   
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
   
      Assert.assertEquals("surfaceAreaTest",
         468.8062090517445, ex1.surfaceArea(), 0.000001);
   }
   
   
  /**
   *Test for volume method.
   */
   
   @Test public void volumeTest() {
   
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
   
      Assert.assertEquals("volumeTest",
         293.0038806573403, ex1.volume(), 0.000001);
   }
   
  /**
   *Test for toString method.*/
   
   @Test public void toStringTest() {
   
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
         
      Assert.assertEquals("toStringTest", true,
            ex1.toString().contains("units"));
   
   
   }
   
   /**
    *Test for setLabelMethod.
    */    
   @Test public void setLabelTest() {
   
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
   
      Assert.assertEquals("setLabelTest",
         true, ex1.setLabel("Small Example"));
    
    //test that is intended to fails
    
      Assert.assertEquals("setLabelTestFail",
         false, ex1.setLabel(null));
   }
    
   /**
    *Test for setSmallRadius method.
    */
    
   @Test public void setLargeRadiusTest() {
   
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
   
      Assert.assertEquals("setLargeRadius", true, ex1.setLargeRadius(9.5));
      Assert.assertEquals("setLargeRadiusTestFail", 
         false, ex1.setLargeRadius(-5));
   
   }
   
   /**
    *Test for setSmallRadius method.
    */
    
   @Test public void setSmallRadiusTest() {
   
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
   
      Assert.assertEquals("setSmallRadius", true, ex1.setSmallRadius(1.25));
      Assert.assertEquals("setSmallRadiusTestFail", 
         false, ex1.setSmallRadius(-5));
   
   }
    
   /**
    *Test for getting count of Ring Torus.
    */
    
   @Test public void countTest() {
   
      RingTorus.resetCount();
   
      Assert.assertEquals("resetCountTest", 0, RingTorus.getCount());
   
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25); 
      RingTorus ex2 = new RingTorus(" Medium Example ", 35.1, 10.4);
   
      Assert.assertEquals("getCountTest", 2, RingTorus.getCount());
   }
    
    
   /**
    *Test for hashCode method.
    */
    
   @Test public void hashCodeTest() {
   
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25); 
   
      Assert.assertEquals("getHashCodeTest", 0, ex1.hashCode());
   }
    
    /**
     *Tests the equals method.
     */
     
   @Test public void equalsTest() {
   
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25); 
      RingTorus ex2 = new RingTorus(" Medium Example ", 35.1, 10.4); 
      RingTorus ex3 = new RingTorus("Large Example", 134.28, 32.46); 
    
      String ex4 = "RingTorus";
    
      Assert.assertEquals("equalsTest", true, ex1.equals(ex1));
      Assert.assertEquals("equalsTestFail", false, ex1.equals(ex2));
      Assert.assertEquals("equalsTestFail", false, equals(ex4));
      Assert.assertEquals("equalsTestFail", false, ex1.equals(ex3));
    //Assert.assertEquals("equalsTestFail", false, ex1.equals(ex4));
      Assert.assertEquals("equalsTestFail", false, ex1.equals(ex4));
   }
   
   
   /**
     *Tests the compare method.
     */
     
   @Test public void comparingTest1() {
     
      RingTorus ex1 = new RingTorus("ex1", 2.0, 1);
      RingTorus ex2 = new RingTorus("ex2", 2.0, 1);
       
      Assert.assertTrue(ex1.compareTo(ex2) == 0);
   }
     
     /**
     *Tests the compare method.
     */
     
   @Test public void comparingTest2() {
     
      RingTorus ex1 = new RingTorus("ex1", 2.0, 1);
      RingTorus ex2 = new RingTorus("ex2", 2.0, 1);
       
      Assert.assertTrue(ex1.compareTo(ex2) == 0);
   }
     
     /**
     *Tests the compare method.
     */
     
   @Test public void comparingTest3() {
     
      RingTorus ex1 = new RingTorus("ex1", 2.0, 1);
      RingTorus ex2 = new RingTorus("ex2", 2.0, 1);
       
      Assert.assertTrue(ex1.compareTo(ex2) == 0);
   }
     
     /**
     *Tests the compare method.
     */
     
   @Test public void comparingTest4() {
     
      RingTorus ex1 = new RingTorus("ex1", 2.0, 1);
      RingTorus ex2 = new RingTorus("ex2", 2.0, 1);
       
      Assert.assertTrue(ex1.compareTo(ex2) == 0);
   }
      
   
}



