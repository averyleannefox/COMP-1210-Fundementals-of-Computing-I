/**
 * Program that creates, compiles 
 * and runs a JUnit test file.
 * 
 * Activity 9.  
 * @author Avery Fox
 * @version 10-31-22
 */ 
 
public class InventoryApp {

/**
   * Initilizes varibles.
   * @param args - sets the name.
   */

   public static void main(String[] args) {
      InventoryItem.setTaxRate(0.05);
      
      InventoryItem item1 = new InventoryItem("Oil change kit", 39.00);
      
      
      InventoryItem item2 = new ElectronicsItem("Cordless phone", 80.00, 1.8);
      
      
      OnlineArticle item3 = new OnlineArticle("Java News", 8.50);
      
      item3.setWordCount(700);
      
      OnlineBook item4 = new OnlineBook("Java for Noobs", 
         13.37);
      
      item4.setAuthor("L. G. Jones");
      
    
   
   } 
}