/* Avery Fox
 * 8-22-22
 * purpose: Prints a description of the course. 
 */
public class CourseInfo{

   /*
    * Prints course information to std output.
    *
    * @param args Command line arguments (not used).
    */
   public static void main (String[] args) {
     
      // print course description
      System.out.println ( "This course provides an introduction to Java and " ) ;
      System.out.println ( "object-orientd programming." );
      
      System.out.println();
   
      // print more course description
      System.out.println("The cousre also intoduces the " + "basics of software development.");
      // corrections made: additional 'System.out.println()' that creates a space between the two senteces
      // corrections made: capitalization in line 19- word "The"
      // corrections made: space added in line 19 - after word "the"
   }
}