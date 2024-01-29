/**
  * Program that creates, compiles 
  * and runs a JUnit test file.
  * 
  * Activity 9.  
  * @author Avery Fox
  * @version 10-31-22
  */ 
  
public class OnlineBook extends OnlineTextItem {

   protected String author;
   
/**
   * Initilizes varibles.
   * @param nameIn - sets the name.
   * @param priceIn - counts number of objects.
   */

   public OnlineBook(String nameIn, double priceIn) { 
   
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }
   
   /**
   * Initilizes varibles.
   *@return name + " - " + author + ": $" + price;
   */

   public String toString() { 
   
      return name + " - " + author + ": $" + price;
   }
   
   /**
   * Initilizes varibles.
   *@param authorIn - sets author.
   */

   public void setAuthor(String authorIn) { 
   
      author = authorIn;
   }
   
}
   
   
   
   
   
