import java.util.Scanner;
   /**
 * Program that reads label, edge and height.
 *
 * Project 4.  
 * Avery Fox – COMP 1210 - Module 4
 * 9-13-22
 */ 

public class HexagonalPrismApp
{

   /**
    * Initilizes varibles.
    * @param args sets string input to variable.
    */ 

   public static void main(String[] args) 
   {
   
      String label = " ";
      double edge = 0.0;
      double height = 0.0;
   
      Scanner userInput = new Scanner(System.in);
   
      System.out.println("Enter label, edge, and "
         + "height for a hexagonal prism.");
       
      System.out.print("\t label: ");
      label = userInput.nextLine();
      
      System.out.print("\t edge: ");
      edge = userInput.nextDouble();
      
      if  (edge < 0)
      {
         System.out.println("Error: height must"
            + " be greater than zero."); 
         System.exit(0);
      }
         
      else
      {
      
      }
      
      System.out.print("\t height: ");
      height = userInput.nextDouble();
   
      
      if (height < 0)
      {
         System.out.println("Error: height must"
            + " be greater than zero.");
         System.exit(0);
      }
         
      else
      {
      
      }
           
      HexagonalPrism prism = new HexagonalPrism(label, edge, height);
      System.out.println(prism);
      
        
        
   
   }
}