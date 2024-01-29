import java.io.IOException;

/**
  * Program that creates, compiles 
  * and runs a JUnit test file.
  * 
  * Project 9.  
  * @author Avery Fox
  * @version 11-1-22
  */ 
  
public class BakeryPart2 {

/**
    * Initilizes varibles.
    * Gets the name of the RingTorusList
    * @param args - sets list.
    * @throws IOException - throws exception.
    *
    */ 
    
   public static void main(String[] args) throws IOException {
      if (args [0] == null || args [0] == "") {
         System.out.println("File name expected as command line argument.");
         System.out.println("Program ending.");
      }
      else
      {
         String fileName = args[0];
         BakedItemList a = new BakedItemList();
         a.readItemFile(fileName);
         System.out.println(a.generateReport());
         System.out.println(a.generateReportByClass());
         System.out.println(a.generateReportByPrice());
         System.out.println(a.generateReportByFlavor());
         System.out.println(a.generateExcludedRecordsReport());
         
      }
   }
     
}