import java.util.ArrayList;
import java.util.Scanner;

/**
 * Program that stores temperatures.
 * 
 * Activity 6.  
 * @author Avery Fox
 * @version 9-26-22
 */ 

public class TemperatureInfo
{


   /**
    * Initilizes varibles.
    * @param args sets string input to variable.
    */ 
   public static void main(String[] args) {
      
      Scanner userInput = new Scanner(System.in);
      ArrayList<Integer> tempsList = new ArrayList<Integer>();
   
      String tempInput = "";
      do {
         System.out.print("Enter a temperature (or nothing to end list): ");
         tempInput = userInput.nextLine().trim();
         if (!tempInput.equals(" ")) {
            tempsList.add(Integer.parseInt(tempInput));
         }
      } while (!tempsList.equals(" "));
      Temperatures temps = new Temperatures(tempsList);
   
      char choice = 'E';
      do {
         System.out.print("Enter choice - [L]ow temp, " 
            + "[H]igh temp, [P]rint, [E]nd: ");
         choice = userInput.nextLine().toUpperCase().charAt(0);
         switch (choice) {
            case 'L':
               System.out.println("\tLow is " + temps.getLowTemp());
               break;
            case 'P':
               System.out.println(temps);
               break;
            case 'E':
               System.out.println("\tDone");
               break;
            
            default:
               System.out.println("\tInvalid choice!");
           
         }
        
      } while (choice != 'E');
     
   }
         
     
}