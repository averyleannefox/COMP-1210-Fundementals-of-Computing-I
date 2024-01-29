    /**
  * Program that creates, compiles 
  * and runs a JUnit test file.
  * 
  * Project 9.  
  * @author Avery Fox
  * @version 11-1-22
  */ 
  
public class Pie extends BakedItem {

/** The base rate. */

   public static final double BASE_RATE = 12.0;
   private double crustCost;

/**
   * Initilizes varibles.
   * @param nameIn - sets the name.
   * @param flavorIn - counts number of objects.
   * @param quantityIn - counts number of objects.
   * @param ingredientsIn - counts number of objects.
   * @param crustCostIn - counts crust cost.
   */

   public Pie(String nameIn, String flavorIn, int quantityIn, 
      double crustCostIn, String... ingredientsIn) { 
      
      super(nameIn, flavorIn, quantityIn, ingredientsIn); 
      crustCost = crustCostIn;
      
   }
   
   
   /**
    * Initilizes varibles.
    * Gets the name of the RingTorusList
    * @return listName - will return listName.
    *
    */
   
   public double getCrustCost() {
      return crustCost;
   }
   
   /**
    * Initilizes varibles.
    * Gets the name of the RingTorusList
    * @param crustCostIn - will return listName.
    *
    */
   
   public void setCrustCost(double crustCostIn) {
      this.crustCost = crustCostIn;
   }
  
  /**
   * Initilizes varibles.
   *@return super.calculateCost() + (SHIPPING_COST * weight);
   */
   
   public double price() {
      return (BASE_RATE + crustCost) * quantity;
   }
   
}