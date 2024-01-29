   /**
  * Program that creates, compiles 
  * and runs a JUnit test file.
  * 
  * Activity 7B.  
  * @author Avery Fox
  * @version 10-15-22
  */ 
  
public class Customer implements Comparable<Customer> {

   private String name = "";
   private String location = "";
   private double balance = 0.0;
   
 /**
   * Initilizes varibles.
   * @param nameIn - sets the label in.
   */
         
   public Customer(String nameIn) {
      name = nameIn;
      location = "";
      balance = 0;
   }
   
   /**
    * Initilizes varibles.
    * Gets the label of the RingTorus
    * @return name - will return label.
    *
    */
   
   public String getName() {
      return name;
   }
   
   /**
    * Initilizes varibles.
    * @param locationIn sets location name.
    *
    */
   
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   
   /**
    * Initilizes varibles.
    * @param amount changes balance value.
    *
    */
   
   public void changeBalance(double amount) {
      balance += amount;
   }
   
   /**
    * Initilizes varibles.
    * Gets location from input.
    * @return location.
    *
    */
   
   public String getLocation() {
      return location;
   }
   
   /**
    * Initilizes varibles.
    * Gets balance from input.
    * @return balance.
    *
    */
   
   public double getBalance() {
      return balance;
   }
   
   /**
    * Initilizes varibles.
    * @param city sets smallRadius value.
    * @param state sets smallRadius value.
    *
    */
   
   public void setLocation(String city, String state) {
      location = city + ", " + state;
   }
   /**
    * Initilizes varibles.
    * Prints to screen.
    * @return output
    *
    */
   
   public String toString() {
      return getName() + "\n" + getLocation() + "\n$" + getBalance();
   }
   
   /**
    * Initilizes varibles.
    * @param obj object.
    * @return 0
    *
    */
   
   public int compareTo(Customer obj) {
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001) {
         return 0;
      }
      else if (this.balance < obj.getBalance()) {
         return -1;
      }
      else {
         return 1;
      }
   }
   
   
  
}