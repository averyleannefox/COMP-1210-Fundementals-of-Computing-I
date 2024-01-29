/**
  * Program that creates, compiles 
  * and runs a JUnit test file.
  * 
  * Project 9.  
  * @author Avery Fox
  * @version 11-1-22
  */ 
  
  
  
public class WeddingCake extends Cake {

/** The base rate. */

   public static final double BASE_RATE = 15.0;
   private int tiers;

/**
   * Initilizes varibles.
   * @param nameIn - sets the name.
   * @param flavorIn - counts number of objects.
   * @param quantityIn - counts number of objects.
   * @param ingredientsIn - counts number of objects.
   * @param layersIn - counts num of layers.
   * @param tiersIn - counts num of tiers.
   */

   public WeddingCake(String nameIn, String flavorIn, int quantityIn, 
      int layersIn, int tiersIn, String... ingredientsIn) { 
      
      super(nameIn, flavorIn, quantityIn, layersIn, ingredientsIn); 
      tiers = tiersIn;
      
   }
   
   /**
    * Initilizes varibles.
    * Gets the name of the RingTorusList
    * @return listName - will return listName.
    *
    */
   
   public int getTiers() {
      return tiers;
   }
   
   /**
    * Initilizes varibles.
    * Gets the name of the RingTorusList
    * @param tiersIn - will return listName.
    *
    */
   
   public void setTiers(int tiersIn) {
      this.tiers = tiersIn;
   }
  
  /**
   * Initilizes varibles.
   *@return super.calculateCost() + (SHIPPING_COST * weight);
   */
   
   public double price() {
      return (BASE_RATE * layers * tiers) * quantity;
   }
   
}