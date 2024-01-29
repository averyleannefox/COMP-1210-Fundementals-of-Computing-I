    /**
  * Program that creates, compiles 
  * and runs a JUnit test file.
  * 
  * Project 9.  
  * @author Avery Fox
  * @version 11-1-22
  */ 
  
public class Cookie extends BakedItem {

/** The base rate. */

   public static final double BASE_RATE = 0.35;
   
   /**
   * Initilizes varibles.
   * @param nameIn - sets the name.
   * @param flavorIn - counts number of objects.
   * @param quantityIn - counts number of objects.
   * @param ingredientsIn - counts number of objects.
   */

   public Cookie(String nameIn, String flavorIn, 
      int quantityIn, String... ingredientsIn) { 
      
      super(nameIn, flavorIn, quantityIn, ingredientsIn); 
   }
   
   /**
   * Initilizes varibles.
   *@return super.calculateCost() + (SHIPPING_COST * weight);
   */
   
   public double price() {
      return BASE_RATE * quantity;
   }
   
}
   
