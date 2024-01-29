import java.text.DecimalFormat;

/**
  * Program that creates, compiles 
  * and runs a JUnit test file.
  * 
  * Project 9.  
  * @author Avery Fox
  * @version 11-1-22
  */ 
  
public abstract class BakedItem {

   protected String name;
   protected String flavor;
   protected int quantity;
   protected String[] ingredients;
   protected static int count = 0;

/**
   * Initilizes varibles.
   * @param nameIn - sets the name.
   * @param flavorIn - counts number of objects.
   * @param quantityIn - counts number of objects.
   * @param ingredientsIn - counts number of objects.
   */

   public BakedItem(String nameIn, String flavorIn, 
      int quantityIn, String... ingredientsIn) { 
      
      name = nameIn;
      flavor = flavorIn;
      quantity = quantityIn;
      ingredients = ingredientsIn;
      
      count++;
      
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
    * @param nameIn - will return listName.
    *
    */
   
   public void setName(String nameIn) {
      this.name = nameIn;
   }
   
   /**
    * Initilizes varibles.
    * Gets the name of the RingTorusList
    * @return listName - will return listName.
    *
    */
   
   public String getFlavor() {
      return flavor;
   }
   
   /**
    * Initilizes varibles.
    * Gets the name of the RingTorusList
    * @param flavorIn - will return listName.
    *
    */
   
   public void setFlavor(String flavorIn) {
      this.flavor = flavorIn;
   }
   
   /**
    * Initilizes varibles.
    * Gets the name of the RingTorusList
    * @return listName - will return listName.
    *
    */
   
   public int getQuantity() {
      return quantity;
   }
   
   /**
    * Initilizes varibles.
    * Gets the name of the RingTorusList
    * @param quantityIn - will return listName.
    *
    */
   
   public void setQuantity(int quantityIn) {
      this.quantity = quantityIn;
   }
   
   /**
    * Initilizes varibles.
    * Gets the name of the RingTorusList
    * @return listName - will return listName.
    *
    */
   
   public String[] getIngredients() {
      return ingredients;
   }
   
   /**
    * Initilizes varibles.
    * Gets the name of the RingTorusList
    * @param ingredientsIn - will return listName.
    *
    */
   
   public void setIngredients(String... ingredientsIn) {
      this.ingredients = ingredientsIn;
   }
   
   /**
    * Initilizes varibles.
    * Gets the name of the RingTorusList
    * @return listName - will return listName.
    *
    */
   
   public static int getCount() {
      return count;
   }
   
   /**
    * Initilizes varibles.
    * Gets the name of the RingTorusList
    * @prarm args - will return listName.
    *
    */
   
   public static void resetCount() {
      BakedItem.count = 0;
   }
   
   /**
    * Initilizes varibles.
    * Gets the name of the RingTorusList
    * @return listName - will return listName.
    *
    */
   
   public  final String toString() {
      String ingredients1 = "";
      int i = 0;
      for (String item : ingredients) {
         if (i == 0) {
            ingredients1 += ", " + item;
         }
         else {
            ingredients1 += ", \n" + item;
         }
         i++;
      } 
      DecimalFormat fmt = new DecimalFormat("$#,##0.00");
      String result = this.getClass().toString().substring(6)
            + ": " + name + " - " + flavor + " Quantity: " + quantity
            + " Price: " + fmt.format(price()) + "\n" + "(ingredients: "
            + ingredients1 + ")";
      return result;
         
   }
   
   /**
    * Initilizes varibles.
    * Gets the name of the RingTorusList
    * @return void - will return listName.
    *
    */
   
   public abstract double price();
      
      
}
      
      
         
          

