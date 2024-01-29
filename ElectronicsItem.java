/**
  * Program that creates, compiles 
  * and runs a JUnit test file.
  * 
  * Activity 9.  
  * @author Avery Fox
  * @version 10-31-22
  */ 
  
public class ElectronicsItem extends InventoryItem {



   protected double weight;
   
   /** The base rate. */
   public static final double SHIPPING_COST = 1.5;

  /**
   * Initilizes varibles.
   * @param nameIn - sets the name.
   * @param priceIn - counts number of objects.
   * @param weightIn - counts number of objects.
   */

   public ElectronicsItem(String nameIn, double priceIn, double weightIn) { 
      
      super(nameIn, priceIn); 
      name = nameIn;
      price = priceIn;
      weight = weightIn;
      
   }
   
   /**
   * Initilizes varibles.
   *@return super.calculateCost() + (SHIPPING_COST * weight);
   */
   
   public double calculateCost() {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
   
   
}