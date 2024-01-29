/**
 * Program that creates, compiles 
 * and runs a JUnit test file.
 * 
 * Activity 9.  
 * @author Avery Fox
 * @version 10-31-22
 */ 
  
public abstract class OnlineTextItem extends InventoryItem {

  /**
   * Initilizes varibles.
   * @param nameIn - sets the name.
   * @param priceIn - counts number of objects.
   */

   public OnlineTextItem(String nameIn, double priceIn) { 
      
      super(nameIn, priceIn); 
      
   }
   
   /**
   * Initilizes varibles.
   *@return price 
   */

   public double calculateCost() { 
      
      return price;
      
   }
   
}
