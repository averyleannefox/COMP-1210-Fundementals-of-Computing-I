/**
  * Program that creates, compiles 
  * and runs a JUnit test file.
  * 
  * Activity 9.  
  * @author Avery Fox
  * @version 10-31-22
  */ 
  
public class OnlineArticle extends OnlineTextItem {

   private int wordCount;

 /**
   * Initilizes varibles.
   * @param nameIn - sets the name.
   * @param priceIn - counts number of objects.
   */

   public OnlineArticle(String nameIn, double priceIn) { 
   
      super(nameIn, priceIn);
      wordCount = 0;
   }
   
   
   /**
   * Initilizes varibles.
   *@param wordCountIn - stest wordCount.
   */
   
   public void setWordCount(int wordCountIn)
   {
      wordCount = wordCountIn;
   }
   
   
   
   
}
