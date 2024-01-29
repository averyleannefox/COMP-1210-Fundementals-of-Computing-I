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


public class CookieTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. **/
   @Test public void priceTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, 
         "flour", "sugar", "dark chocolate chips", 
            "butter", "baking soda", "salt");
      Assert.assertEquals("", 4.199, c.price(), .001);
   }
   
   /** Method. **/
   
   @Test public void getNameTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, "flour", 
         "sugar", "dark chocolate chips", "butter", "baking soda", "salt");
      Assert.assertEquals("", "Chips Delight", c.getName());
   }
   
   /** Method. **/
   
   @Test public void getFlavorTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, "flour", 
         "sugar", "dark chocolate chips", "butter", "baking soda", "salt");
      Assert.assertEquals("", "Chocolate Chip", c.getFlavor());
   }
   
   /** Method. **/
   
   @Test public void getQuantity() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, "flour", 
         "sugar", "dark chocolate chips", "butter", "baking soda", "salt");
      Assert.assertEquals("", 12, c.getQuantity());
   }
   
   /** Method. **/
   
   @Test public void getIngredientsTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, "flour", 
         "sugar", "dark chocolate chips", "butter", "baking soda", "salt");
      String result = c.getIngredients()[1];
      Assert.assertEquals("", "sugar", result);
   }
   
   
   /** Method. **/
   
   @Test public void getCountTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 1, "flour", 
         "sugar", "dark chocolate chips", "butter", "baking soda", "salt");
      Assert.assertEquals("", 12, c.getCount());
   }
   
   /** Method. **/
   
   @Test public void setNameTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, "flour", 
         "sugar", "dark chocolate chips", "butter", "baking soda", "salt");
      Assert.assertEquals("", "Chips Delight", c.getName());
      c.setName("Test");
      Assert.assertEquals("", "Test", c.getName());
   }
   
   /** Method. **/
   
   @Test public void setFlavorTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, "flour", 
         "sugar", "dark chocolate chips", "butter", "baking soda", "salt");
      Assert.assertEquals("", "Chocolate Chip", c.getFlavor());
      c.setFlavor("Test");
      Assert.assertEquals("", "Test", c.getFlavor());
   }
   
   /** Method. **/
   
   @Test public void setQuantityTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 1, "flour", 
         "sugar", "dark chocolate chips", "butter", "baking soda", "salt");
      Assert.assertTrue("", 1 == c.getQuantity());
      c.setQuantity(12);
      Assert.assertTrue("", 12 == c.getQuantity());
   }
   
   /** Method. **/
   
   @Test public void setIngredientsTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, "flour");
      String[] ingredientsIn = {"butter", "baking soda", "salt", 
         "cream filling", "baking powder", "mint", 
         "peanut butter", "vanilla extract"};
      c.setIngredients(ingredientsIn);
      Assert.assertEquals("", "cream filling", c.getIngredients()[3]);
   }
   
   /** Method. **/
   
   @Test public void resetCountTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, "flour", 
         "sugar", "dark chocolate chips", "butter", "baking soda", "salt");
      Assert.assertEquals("", "Chips Delight", c.getName());
      BakedItem.resetCount();
      Assert.assertEquals("", 0, c.getCount());
   }
   
   /** Method. **/
   
   @Test public void toString1() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, "flour", 
         "sugar", "dark chocolate chips", "butter", "baking soda", "salt");
      boolean option1 = c.toString().contains("baking soda,");
      boolean option2 = c.toString().contains("salt)");
      Assert.assertTrue("", option1 && option2);
   }
   
   /** Method. **/
   
   @Test public void toString2() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, "flour", 
         "sugar", "dark chocolate chips", "butter", "baking soda", "salt");
      boolean option1 = c.toString().contains("baking soda,");
      boolean option2 = c.toString().contains("salt)");
      Assert.assertTrue("", option1 && option2);
   }
   
   /** Method. **/
   
   @Test public void toString3() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, "flour", 
         "sugar", "dark chocolate chips", "butter", "baking soda", "salt");
      boolean option1 = c.toString().contains("baking soda,");
      boolean option2 = c.toString().contains("salt)");
      Assert.assertTrue("", option1 && option2);
   }
   
   /** Method. **/
   
   
   
}
   
   

