
 /**
  * Program that creates, compiles 
  * and runs a JUnit test file.
  * 
  * Activity 8.  
  * @author Avery Fox
  * @version 10-24-22
  */ 
  
public class Scores {

   private int[] numbers;
   
   /**
       * Construsctor.
       * @param numbersIn equals numbers
       */


   public Scores(int[] numbersIn) {
      numbers = numbersIn;
   }
   
   /**
       * Finds evens.
       * @return the even nums.
       */
   
   
   public int[] findEvens() {
      int numberEvens = 0;
     
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            numberEvens++;
         }
      }
      
      int [] evens = new int [numberEvens];
      int count = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            evens[count] = numbers[i];
            count++;
         }
      }
      return evens;
   }
   
   /**
       * Finds odds.
       * @return the odd nums.
       */
   
   
   public int[] findOdds() {
      int numbersOdds = 0;
     
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            numbersOdds++;
         }
      }
      
      int [] odds = new int [numbersOdds];
      int count = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            odds[count] = numbers[i];
            count++;
         }
      }
      return odds;
   }
   
   /**
       * Calculates average.
       * @return the avg num.
       */
   
   public double calculateAverage() {
      int sum = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         sum += numbers[i];
      }
      return (double) sum / (double) numbers.length;
   }
   
      /**
       * Prints to screen.
       * @return num info.
       */

   
   public String toString() {
      String result = "";
      for (int i = 0; i < numbers.length; i++) {
         result += numbers[i] + "\t";
      } 
      return result;
   }
   
   /**
       * Prints to screen.
       * @return num info in reverse
       
       */
    
   public String toStringInReverse() {
      String result = "";
      for (int i = numbers.length - 1; i > -1; i--) {
         result += numbers[i] + "\t"; 
      } 
      return result;
   }
    
}
   
