import java.util.Scanner;
import java.lang.*;
 
/**
 * Program that solves equation.
 * 
 * Project 3  
 * Avery Fox – COMP 1210 - Module 3
 * 9-7-22
 */ 
 
public class BoxLunch {
 /**
   * traverses through a list of numbers.
   * @param args Command line arguments - not used.
   */



   public static void main(String[] args) 
   {
   
   //varibles
   
      int indexOfString = 13;
      String orderCode = "";
      int numOfOrderCode = 0;
      String orderName = "";
      int codeLength = 0;
      int codeTheme = 0;
      int firstDigit = 0;
      int numOfAdultMeal = 0;
      double priceOfAdultMeal = 0;
      int numOfChildMeal = 0;
      double priceOfChildMeal = 0;
      int total = 0;
      double totalAdultMeal = 0.0;
      double totalChildMeal = 0.0;
      int randomNum = 0;
      int min = 1;
      int max = 9999;
         
      Scanner userInput = new Scanner(System.in); 
      System.out.print("Enter order code: ");
      orderCode = userInput.nextLine();
      
      System.out.println();
      
      codeLength = orderCode.length();
      
   
      if (codeLength < 13)
      {
         System.out.println("*** Invalid Order Code ***");
         System.out.println("Order code must have at least 13 characters.");
      }
      else if (codeLength > 13)
      {
         //conditional 1
         orderName = orderCode.substring(13
            );
         System.out.println("Name: " + orderName);
         
         //conditional 2
         
         numOfAdultMeal = Integer.parseInt(orderCode.substring(1, 3));
      
         
         priceOfAdultMeal = Double.parseDouble(orderCode.substring(3, 7));
         priceOfAdultMeal = priceOfAdultMeal / 100;
         
         totalAdultMeal = (numOfAdultMeal * priceOfAdultMeal);
         
         
         System.out.println("Adult meals: " + numOfAdultMeal 
            + " at $" + priceOfAdultMeal);
         
         //conditional 3
         
         numOfChildMeal = Integer.parseInt(orderCode.substring(7, 9));
         
         
         priceOfChildMeal = Double.parseDouble(orderCode.substring(9, 13));
         priceOfChildMeal = priceOfChildMeal / 100;
         
         totalChildMeal = (numOfChildMeal * priceOfChildMeal);
         
         
         System.out.println("Child meals: " + numOfChildMeal 
            + " at $" + priceOfChildMeal);
         
         
         //conditional 4
         
         // total = Double.sum(priceOfAdultMeal, priceOfChildMeal);
         System.out.println("Total: $" + Double.sum(totalAdultMeal, 
            +totalChildMeal));
      
         
         //conditional 5
         
         firstDigit = orderCode.charAt(0);
         if (firstDigit == '0')
         {
            System.out.println("Theme: Birthday");
         }
         else if (firstDigit == '1')
         {
            System.out.println("Theme: Graduation");
         }
         else if ((firstDigit != '0') && (firstDigit != '1'))
         {
            System.out.println("Theme: Holiday");
         }
      
         randomNum = (int) (Math.random() * (max - min + 1) + min); 
         System.out.println("Lucky Number: " + randomNum);
      
      }
   }
}
