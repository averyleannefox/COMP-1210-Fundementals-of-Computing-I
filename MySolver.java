import java.util.Scanner;
 /**
 * Program that computes three.
 * numbers together.
 * Project 2.  
 * Avery Fox – COMP 1210 - Module 2.
 * 9-2-22
 */ 
public class MySolver 
  /**
  * Calculates three numbers.
  * @param args Command line arguments - not used.
  */
{


   public static void main(String[] args)  
   {
    /** 
    * Print name to screen.
    * @param args Command line arguments - not used.
    */  
   
   
      
      Scanner scan = new Scanner(System.in);
      
      System.out.println("result = (8.5x + 6.1) (10y + 7.9) / z");
   
      System.out.print("\tEnter x value: ");
   
      double x = scan.nextDouble();
      
      
      Scanner scan2 = new Scanner(System.in);
   
      System.out.print("\tEnter y value: ");
   
      double y = scan2.nextDouble();
      
   
      Scanner scan3 = new Scanner(System.in);
   
      System.out.print("\tEnter z value: ");
   
      double z = scan3.nextDouble();
      
      //operations
      
      if (z == 0)
      {
         System.out.println("result is undefined");
      }
      else
      {
         double equation1 = (8.5 * x);
         double equation2 =  (equation1 + 6.1);
      
         double equation3 = (10 * y);
         double equation4 = (equation3 + 7.9);
      
         double equation5 = (equation2 + equation4);
      
         double finalAnswer = (equation5 / z);
      
         System.out.println("result = " + finalAnswer);
      }
      
   
   }
}
   

