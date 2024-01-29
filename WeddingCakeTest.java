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


public class WeddingCakeTest {

   private WeddingCake cake1 = new WeddingCake("3-Level/1 Tier", 
      "Red Velvet", 1, 3, 1, "flour", "sugar", "buttermilk", 
      "coffee", "eggs", "butter", "baking soda", "baking powder", 
      "salt");
   private WeddingCake cake2 = new WeddingCake("3-Level/2 Tier", 
      "Chocolate", 1, 3, 2, "flour", "sugar", "buttermilk", 
      "coffee", "eggs", "butter", "baking soda", "baking powder", 
      "salt");
   private WeddingCake cake3 = new WeddingCake("3-Level/3 Tier", 
      "Vanilla", 1, 3, 3, "flour", "sugar", "buttermilk", "coffee", 
      "eggs", "butter", "baking soda", "baking powder", "salt");

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. **/
   @Test public void getTiersTest() {
      int result1 = cake1.getTiers();
      Assert.assertEquals("", 1, result1);
      int result2 = cake2.getTiers();
      Assert.assertFalse("", 0 == result2);
      int result3 = cake3.getTiers();
      Assert.assertTrue("", 3 == result3);
   }
   
   /** A test that always fails. **/
   @Test public void setTiersTest() {
      cake1.setTiers(4);
      int result1 = cake1.getTiers();
      Assert.assertEquals("", 4, result1);
      cake2.setTiers(1);
      int result2 = cake2.getTiers();
      Assert.assertFalse("", 0 == result2);
      cake3.setTiers(3);
      int result3 = cake3.getTiers();
      Assert.assertTrue("", 3 == result3);
   }
   
   /** A test that always fails. **/
   @Test public void priceTest() {
      Assert.assertEquals("", 45, cake1.price(), 0.001);
      Assert.assertFalse("", 12 == cake2.price());
      Assert.assertTrue("", 135 == cake3.price());
   }
}
