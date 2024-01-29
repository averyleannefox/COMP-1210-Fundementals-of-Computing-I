import java.text.DecimalFormat;

/**
  * Program that creates, compiles 
  * and runs a JUnit test file.
  * 
  * Activity 7A.  
  * @author Avery Fox
  * @version 10-10-22
  */ 
  
public class RingTorus {

   private String label = "";
   private double largeRadius = 0;
   private double smallRadius = 0;
   
   private static int count = 0;
  

/**
   * Initilizes varibles.
   * @param labelIn - sets the label in.
   * @param largeRadiusIn - initilizes largeRadius.
   * @param smallRadiusIn - initilizes smallRadius.
   */

   public RingTorus(String labelIn, 
      double largeRadiusIn, double smallRadiusIn) { 
      setLabel(labelIn);
      setLargeRadius(largeRadiusIn);
      setSmallRadius(smallRadiusIn);
      
      count++;
      
      //largeRadius++;
      //smallRadius++;
   }
   
   /**
    * Initilizes varibles.
    * Gets the label of the RingTorus
    * @return label - will return label.
    *
    */
   
   public String getLabel() {
      return label;
   } 
   
   /**
    * Initilizes varibles.
    * @param labelIn sets label name.
    * @return true.
    *
    */
   
   public boolean setLabel(String labelIn) {
   
      if (labelIn != null) {
         String s = labelIn;
         label = s.trim();
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
    * Initilizes varibles.
    * Gets largeRadius from input.
    * @return largeRadius.
    *
    */
   
   public double getLargeRadius() {
      return largeRadius;
   } 
   
   /**
    * Initilizes varibles.
    * @param largeRadiusIn sets largeRadius value.
    * @return true.
    *
    */
   
   public boolean setLargeRadius(double largeRadiusIn) {
   
      if (largeRadiusIn >= 0 && largeRadiusIn > smallRadius) {
         largeRadius = largeRadiusIn;
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
    * Initilizes varibles.
    * Gets smallRadius from input.
    * @return smallRadius.
    *
    */
   
   public double getSmallRadius() {
      return smallRadius;
   } 
   
   /**
    * Initilizes varibles.
    * @param smallRadiusIn sets smallRadius value.
    * @return true.
    *
    */
   
   public boolean setSmallRadius(double smallRadiusIn) {
   
      if (smallRadiusIn >= 0 && smallRadiusIn < largeRadius) {
         smallRadius = smallRadiusIn;
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
    * Initilizes varibles.
    * Gets diameter from input.
    * @return diameter calc.
    *
    */
   
   public double diameter() {
      return 2 * (getLargeRadius() + getSmallRadius());
   } 
   
   /**
    * Initilizes varibles.
    * Gets surfaceArea from input.
    * @return surface area calc.
    *
    */
   
   public double surfaceArea() {
      return (2 * Math.PI * getLargeRadius()) 
         * (2 * Math.PI * getSmallRadius());
   } 
   
   /**
    * Initilizes varibles.
    * Gets surfaceArea from input.
    * @return surface area calc.
    *
    */
   
   public double volume() {
      return (2 * Math.PI * getLargeRadius()) 
         * (Math.PI * Math.pow(getSmallRadius(), 2));
   } 
   
   /**
    * Initilizes varibles.
    * Prints to screen.
    * @return output
    *
    */
   
   public String toString() {
   
      DecimalFormat df = new DecimalFormat("#,##0.0##");
    
      System.out.println("RingTorus " + '"' + label + '"');
      
      String output = "\tlarge radius = " 
          + df.format(getLargeRadius()) + " units \n"
          + "\tsmall radius = " + df.format(getSmallRadius()) + " units \n"
          + "\tdiameter = " 
             + df.format(diameter()) + " units \n"
          + "\tsurface area = " 
             + df.format(surfaceArea()) + " square units \n"      
          + "\tvolume = " 
             + df.format(volume()) + " cubic units \n";  
            
      return output; 
   }
   
   /**
    * Initilizes varibles.
    * Counts instances.
    * @return count.
    *
    */
  
   
   public static int getCount() {
      return count;
   }
   
   /**
    * Initilizes varibles.
    * Resets counts.
    *
    */
   
   public static void resetCount() {
      count = 0;
   }
   
   /**
    * Initilizes varibles.
    * @param obj from RingTorus
    * @return false
    *
    */
   
   public boolean equals(Object obj) {
      if (!(obj instanceof RingTorus)) {
         return false;
      }
      else {
         RingTorus rt = (RingTorus) obj;
         return (label.equalsIgnoreCase(rt.getLabel())
            && (Math.abs(largeRadius - rt.getLargeRadius()) < .000001)
            && (Math.abs(smallRadius - rt.getSmallRadius()) < .000001));
            
      }
      
   }
   
   /**
    * Initilizes varibles.
    * Checkstyle requirement.
    * @return 0
    *
    */
   
   public int hashCode() {
      return 0;
   }
   
   /**
    * Initilizes varibles.
    * @param obj object.
    * @return 0
    *
    */
   
   public int compareTo(RingTorus obj) {
      if (Math.abs(this.volume() - obj.volume()) < 0.000001) {
         return 0;
      }
      else if (this.volume() < obj.volume()) {
         return -1;
      }
      else {
         return 1;
      }
   }
   
   
   
}

