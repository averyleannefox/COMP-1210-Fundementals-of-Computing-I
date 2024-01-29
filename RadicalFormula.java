import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
 
/**
 * Program that solves equation.
 * Project 3  
 * Avery Fox – COMP 1210 - Module 3
 * 9-7-22
 */ 
 
public class RadicalFormula 
      /**
      * Calculates user input varible into series of calculations.
      * @param args Command line arguments (not used).
      */
{


   public static void main(String[] args) 
    
     /**
      * Conditional statements.
      * @param args Command line arguments (not used).
      */   
   {
   
      Scanner userInput = new Scanner(System.in); 
      System.out.print("Enter a value for x: ");
      double xValue = userInput.nextDouble();
      
   
      int decimalToLeft = 0;
      int decimalToRight = 0;
      int indexOfDecimal = 0;
      int finalLength = 0;
      
      // first calculation
      double operation1 = Math.pow((3 * Math.pow(xValue, 8)) 
         - (2 * Math.pow(xValue, 3)), 2);
      
      
      
        // sencond calcultaion
      double operation2 = Math.abs((3 * Math.pow(xValue, 5)) 
         - (2 * Math.pow(xValue, 3)));
      
   
           
      // adding both together and taking square root
      double finalResult = Math.sqrt(operation1 + operation2);
      
      
      
      System.out.println("Result: " + finalResult);
      
      double x1 = finalResult;
      DecimalFormat fmt1 = new DecimalFormat("#,##0.0##");     
     
      
      finalLength = fmt1.format(x1).length();
      
      // converting to a string
      
      String finalResultStr = Double.toString(finalResult);
      
      indexOfDecimal = finalResultStr.indexOf(".");
      decimalToLeft = indexOfDecimal;
      decimalToRight = finalResultStr.length() - indexOfDecimal - 1;
      
      
      System.out.println("# digits to left of "
         + "decimal point: " + decimalToLeft);
      System.out.println("# digits to right of "
         + "decimal point: " + decimalToRight);
         
      System.out.println("Formatted Result: " + fmt1.format(x1));
      
    
      //19683 - 54 = 19629^2 = 385297641
      //729 - 54 = 675
      
      // final = 385298316 - sqaure root - 19629.017
         
   
     
   }
}