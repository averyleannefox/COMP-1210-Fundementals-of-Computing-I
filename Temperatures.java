import java.util.ArrayList; 

/**
 * Program that stores temperatures.
 * 
 * Activity 6.  
 * @author Avery Fox
 * @version 9-26-22
 */ 

public class Temperatures
{

// instance varibles

   private ArrayList<Integer> temperatures = new ArrayList<Integer>();
   private int lowTemp = 0;
   private int highTemp = 0;
   private int lowerMin = 0;
   private int higherMax = 0; 
   private String output = "";
   
   //constructor
   
   /**
    * Initilizes varibles.
    * @param tempertureIn - Unused.
    */ 
   
   public Temperatures(ArrayList<Integer> temperaturesIn)
   {
      temperatures = temperaturesIn;
   }
   
   //methods
   
   /**
    * Gets low temp.
    * @return low.
    */
   
   public int getLowTemp()
   {
      if (temperatures.isEmpty())
      {
         return 0;
      }
        
      int low = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++)
      {
         if (temperatures.get(i) < low)
         {
            low = temperatures.get(i);
         }
      }
         
      return low;
   }
   
   /**
    * Gets high temp.
    * @return high.
    */
   
   
   public int getHighTemp()
   {
      if (temperatures.isEmpty())
      {
         return 0;
      }
      int high = temperatures.get(0);
      for (int temp : temperatures)
      {
         if (temp > high)
         {
            high = temp;
         }
      }
         
      return high;
   }
   
   /**
    * Gets min number.
    * @return getLowTemp.
    */
   
   public int lowerMinimum(int lowIn)
   {
      if (lowIn < getLowTemp())
      {
         return lowIn;
      }
      else
      {
         return getLowTemp();
      }
      
      
   }
   
   /**
    * Gets high temp.
    * @return getHighTemp.
    */
   
   
   public int higherMaximum(int highIn)
   {
      if (highIn > getHighTemp())
      {
         return highIn;
      }
      else
      {
         return getHighTemp();
      }
      
   }
   
   /**
    * Prints to screen.
    * @return nameOfList
    */
   
   
   public String toString()
   {
      return "\tTemperature: " + temperatures
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
   }
   
   
   
   
   
   
}