/**
  * Program that creates, compiles 
  * and runs a JUnit test file.
  * 
  * Activity 9.  
  * @author Avery Fox
  * @version 10-31-22
  */ 
  
public class InventoryItem {

   protected String name;
   protected double price;
   private static double taxRate = 0;

/**
   * Initilizes varibles.
   * @param nameIn - sets the name.
   * @param priceIn - counts number of objects.
   */

   public InventoryItem(String nameIn, double priceIn) { 
      
      name = nameIn;
      price = priceIn;
      
   }
   
   /**
    * Initilizes varibles.
    * Gets the name of the RingTorusList
    * @return listName - will return listName.
    *
    */
   
   public String getName() {
      return name;
   }
   
   /**
    * Initilizes varibles.
    * Gets the name of the RingTorusList
    * @return listName - will return listName.
    *
    */
   
   public double calculateCost() {
      return price * (1 + taxRate);
   }
   
   /**
    * Initilizes varibles.
    * Gets the name of the RingTorus List
    * @param taxRateIn - sets tax rate.
    *
    */
   
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }
   
   /**
    * Initilizes varibles.
    * Gets the name of the RingTorusList
    * @return listName - will return listName.
    *
    */
   
   public String toString() {
      return name + ": $" + calculateCost();
   }
   
}