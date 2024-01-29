
import java.text.DecimalFormat;



/**
  * Program that creates, compiles 
  * and runs a JUnit test file.
  * 
  * Activity 8.  
  * @author Avery Fox
  * @version 10-22-22
  */ 
  
public class RingTorusList {

//instance varibles

   private String listName;
   private RingTorus[] rtObjList; 
   private int numOfArr;
   
   /**
   * Initilizes varibles.
   * @param listNameIn - sets the name.
   * @param rtObjListIn - counts number of objects.
   * @param numOfArrIn - counts number of objects.
   */

   public RingTorusList(String listNameIn, RingTorus[] rtObjListIn, 
      int numOfArrIn) { 
      
      listName = listNameIn;
      rtObjList = rtObjListIn;
      numOfArr = numOfArrIn;
      
      
   }
   
   /**
    * Initilizes varibles.
    * Gets the name of the RingTorusList
    * @return listName - will return listName.
    *
    */
   
   public String getName() {
      return listName;
   }
   
   /**
    * Initilizes varibles.
    * Gets the name of the RingTorusList
    * @return numOfObj - will return number of objects.
    *
    */
   
   public int numberOfRingToruses() {
      for (int i = 0; i < numOfArr; i++)
      {
         if (rtObjList[i] == null)
         {
            numOfArr--;
         }
      }
      return numOfArr;
   }
   
   
   /**
    * Initilizes varibles.
    * Gets the name of the RingTorusList
    * @return totalNum - will return number of objects.
    *
    */
   
   public double totalDiameter() {
      double totalNum = 0;
      for (int i = 0; i < numOfArr; i++) {
         totalNum += rtObjList[i].diameter();
      }
      return totalNum;
   }
  
        
   /**
    * Initilizes varibles.
    * Gets the name of the RingTorusList
    * @return totalNum - will return number of objects.
    *
    */
   
   public double totalSurfaceArea() {
      double totalNum = 0;
      int index = 0;
      for (int i = 0; i < numOfArr; i++) {
         totalNum += rtObjList[i].surfaceArea();
      }
      return totalNum;
   }
   
   /**
    * Initilizes varibles.
    * Gets the name of the RingTorusList
    * @return totalNum - will return number of objects.
    *
    */
   
   public double totalVolume() {
      double totalNum = 0;
      for (int i = 0; i < numOfArr; i++) {
         totalNum += rtObjList[i].volume();
      }
      return totalNum;
   }
   
   /**
    * Initilizes varibles.
    * Gets the name of the RingTorusList
    * @return totalNum - will return number of objects.
    *
    */
   
   public double averageDiameter() {
      double totalNum = 0;
      for (int i = 0; i < numOfArr; i++) {
         totalNum += (rtObjList[i].diameter()) / numOfArr;
      }
      return totalNum;
   }
   
   /**
    * Initilizes varibles.
    * Gets the name of the RingTorusList
    * @return totalNum - will return average surface area.
    *
    */
   
   public double averageSurfaceArea() {
      double totalNum = 0;
      for (int i = 0; i < numOfArr; i++) {
         totalNum += rtObjList[i].surfaceArea() / numOfArr;
      }
      return totalNum;
   }
   
   /**
    * Initilizes varibles.
    * Gets the name of the RingTorusList
    * @return totalNum - will return number of objects.
    *
    */
   
   public double averageVolume() {
      double totalNum = 0;
      for (int i = 0; i < numOfArr; i++) {
         totalNum += (rtObjList[i].volume()) / numOfArr;
      }
      return totalNum;
   }
  
   
   /**
    * Initilizes varibles.
    * Prints to screen.
    * @return output
    *
    */
   
   public String toString() {
     
      DecimalFormat fmt = new DecimalFormat("#,##0.0##");
      String result = "";
      for (int i = 0; i < numOfArr; i++) {
         result += "\n" + rtObjList[i].toString() + "\n";
         result += listName + "\n";
         result += "----- Summary for " + listName + "Test List -----\n"
               + "Number of RingToruses: " + numOfArr + "\n"
               + "Total Diameter: " + fmt.format(totalDiameter())
               + " units" + "\n"
               + "Total Surface Area " + fmt.format(totalSurfaceArea())
               + " square units" + "\n"
               + "Total Volume: " + fmt.format(totalVolume())
               + " cubic units" + "\n"
               + "Average Diameter: " + fmt.format(averageDiameter())
               + " units" + "\n"
               + "Average Surface Area: " + fmt.format(averageSurfaceArea())
               + " square units" + "\n"
               + "Average Volume: " + fmt.format(averageVolume())
               + " cubic units" + "\n";
      }
      return result; 
   }
        

   
         
   /**
    * Initilizes varibles.
    * Prints to screen.
    * @return numOfObj
    *
    */
   
   public RingTorus[] getList() {
      return rtObjList; 
   }
   
              
   
   /**
    * Initilizes varibles.
    * @param labelIn - counts number of objects.
    * @param largeRadiusIn - counts number of objects.
    * @param smallRadiusIn - counts number of objects.
    * Prints to screen.
    *
    */
    
   
   public void addRingTorus(String labelIn, double largeRadiusIn, 
      double smallRadiusIn) {
      RingTorus rtObj = new RingTorus(labelIn, largeRadiusIn, smallRadiusIn);
      rtObjList[numOfArr] = rtObj;
      numOfArr++;
       
   }
   
   /**
    * Initilizes varibles.
    * @param labelIn - counts number of objects.
    * Prints to screen.
    * @return output
    *
    */
    
   
   public RingTorus findRingTorus(String labelIn) {
      numberOfRingToruses();
      if (numOfArr > 0)
      {
         for (int i = 0; i < numOfArr; i++)
         {
            if (rtObjList[i].getLabel().equalsIgnoreCase(labelIn))
            {
               return rtObjList[i];
            }
         }
         return null;
      }
      else 
      {
         return null;
      }
       
   }
   
   /**
    * Initilizes varibles.
    * Prints to screen.
    * @return output
    * @param labelIn - counts number of objects.
    *
    */
    
   
   public RingTorus deleteRingTorus(String labelIn) {
      RingTorus result = null;
      int numOfArrIn = 0;
   
      for (int i = 0; i < numOfArr; i++)
      {
         if (rtObjList[i].getLabel().equalsIgnoreCase(labelIn))
         {
            result = rtObjList[i];
            for (int j = i; j <= numOfArr - 1; j++)
            {
               rtObjList[j] = rtObjList[j + 1];
            }
            rtObjList[numOfArr - 1] = null;
            numOfArr--;
            break;
         }
      }
      return result;
       
   }
   
   /**
    * Initilizes varibles.
    * Prints to screen.
    * @param labelIn - counts number of objects.
    * @param largeRadiusIn - counts number of objects.
    * @param smallRadiusIn - counts number of objects.
    * @return output
    *
    */
    
   
   public RingTorus editRingTorus(String labelIn, 
      double largeRadiusIn, double smallRadiusIn) {
      RingTorus newObj = null;
            
      for (int i = 0; i < numOfArr; i++)
      {
         if (rtObjList[i].getLabel().equalsIgnoreCase(labelIn))
         {
            rtObjList[i].setLargeRadius(largeRadiusIn);  
            rtObjList[i].setSmallRadius(smallRadiusIn);  
               
            newObj = rtObjList[i];
            break;           
         }
      }
      return newObj;
       
   }
   
   /**
    * Initilizes varibles.
    * Prints to screen.
    * @return output
    *
    */
    
   
   // public RingTorus findRingTorusWithLargestVolume() {
   //   	
      // RingTorus[] rtTest = new RingTorus[0];
      // rtTest[0] = rtObjList[0];
      // for (int i = 0; i < numOfArr; i++){
         // if(rtObjList[i].volume() > rtTest[0].volume()) {
            // rtTest[0] = rtObjList[i];           
         // }
      // }
      // return rtTest[0];
   // }
   
   public RingTorus findRingTorusWithLargestVolume() {
      
      RingTorus largestVal = new RingTorus("ex", 1.1, 1.2); 
      double startingVal = rtObjList[0].volume();
      if (numOfArr > 0) {
         for (int i = 0; i < numOfArr; i++) {
            if (rtObjList[i].volume() >= startingVal) {
               startingVal = rtObjList[i].volume();
               largestVal = rtObjList[i];
            }
         }
      }
      
      else {
         return null;
      }
      
      return largestVal;
   }
}
        
    



