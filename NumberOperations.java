
/**
 * Program that reads label, edge and height.
 *
 * Activity 5.  
 * Avery Fox – COMP 1210 - Module 5
 * 9-20-22
 */ 

public class NumberOperations {
   //instance varibles
   private int number;

 /**
  * Initilizes varibles.
  * @param numberIn sets input to variable.
  */ 

   public NumberOperations(int numberIn) {
   
      number = numberIn;
   
   }
   
   /**
    * Initilizes varibles.
    * @return getValue
    */ 
    
   
   public int getValue()
   {
      return number;
   }
   
   /**
    * Initilizes varibles.
    * @return oddsUnder
    */ 
   
   public String oddsUnder()
   {
      String output = "";
      
      int i = 0;
      while (i < number)
      {
         if (i % 2 != 0)
         {
            output += i + "\t";
         }
         i++;
      }
      return output;
   }
   
   /**
    * Initilizes varibles.
    * @return powersTwoUnder
    */ 
   
   public String powersTwoUnder()
   {
      String output = "";
      int powers = 1;
      
      while (powers < number)
      {
         output += powers + "\t";
         powers = powers * 2;  
      }
      return output;
   }
        
   /**
    * Initilizes varibles.
    * @param compareNumber will compare greater or equal.
    * @return 1 if num is greater.
    */ 
   
   public int isGreater(int compareNumber)
   {
      if (number > compareNumber)
      {
         return 1;
      }
      
      else if (number < compareNumber)
      {
         return -1;
      }
      else
      {
         return 0;
      }
      
   }
   
   /**
    * Initilizes varibles.
    * @return toString
    */ 
   
   public String toString()
   {
      return number + "";
   }
   
   
}
