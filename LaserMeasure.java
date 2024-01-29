import java.util.Scanner;
 /**
 * Program that computes the miles, feet and.
 * yards of a given raw distance.
 * Project 2.  
 * Avery Fox – COMP 1210 - Module 2.
 * 9-2-22
 */ 
public class LaserMeasure 
{
   /**
   * Calculates three numbers.
   * @param args Command line arguments - not used.
   */



   public static void main(String[] args)
   { 
    /** 
    * calculations.
    * @param args Command line arguments - not used.
    */   
   
   
      Scanner input = new Scanner(System.in);  
    
      int distInch = 0;
      
   
      
      System.out.println("Enter the raw distance measurement in inches: ");
      distInch = input.nextInt();
      
      if (distInch < 0)
      {
         System.out.println("Measurement must be non-negative!");
      }
      else 
      {
         int mileCalc = distInch / 63360;
         int yardsCalc = (distInch % 63360) / 36;
         int feetCalc = ((distInch % 63360) % 36) / 12;
         int finalCalc = ((distInch % 63360) % 36) % 12;
         
          
         System.out.println("\nMeasurement by combined miles, "
             + "yards, feet, inches:");
         System.out.println("\n\tmiles: " + mileCalc);
         System.out.println("\tyards: " + yardsCalc);
         System.out.println("\tfeet: " + feetCalc);
         System.out.println("\tinches: " + finalCalc);
      
         System.out.println("\n" + distInch + " in = " + mileCalc 
             + " mi," + yardsCalc + " yd," 
             + feetCalc + " ft," + finalCalc + " in");
      }
      
   }
}
      
