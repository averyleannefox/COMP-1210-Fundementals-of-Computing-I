import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
  * Program that creates, compiles 
  * and runs a JUnit test file.
  * 
  * Project 9.  
  * @author Avery Fox
  * @version 11-1-22
  */ 


public class PieTest {

   private Pie pie1 = new Pie("Weekly Special", "Apple", 1, 0, "flour", 
      "sugar", "cinnamon", "butter", "baking soda", "salt");
   private Pie pie2 = new Pie("Summer Special", "Key Lime", 1, 2.0, "flour",
      "sugar", "lime juice", "graham crackers", "butter", 
      "baking soda", "salt");

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. **/
   @Test public void getCrustCost() {
      double result1 = pie1.getCrustCost();
      Assert.assertEquals("", 0.0, result1, .001);
      
      double result2 = pie2.getCrustCost();
      Assert.assertFalse("", 0.0 == result2);
   }
   
   /** A test that always fails. **/
   @Test public void setCrustCost() {
      pie1.setCrustCost(2);
      double result = pie1.getCrustCost();
      Assert.assertEquals("", 2.0, result, 0.001);
   }
   
   /** A test that always fails. **/
   @Test public void priceTest() {
      Assert.assertEquals("", 12, pie1.price(), 0.001);
      Assert.assertFalse("", 12 == pie2.price());
   }
}
