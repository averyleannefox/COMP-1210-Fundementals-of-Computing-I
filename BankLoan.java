/**
  * Program that creates, compiles 
  * and runs a JUnit test file.
  * 
  * Activity 7A.  
  * @author Avery Fox
  * @version 10-10-22
  */ 
public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;
   private static int loansCreated = 0;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;
   
   /**
    * Initilizes varibles.
    * @param customerNameIn initilizes customerName.
    * @param interestRateIn initilizes interestRate.
    */

   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }
   
   /**
    * Initilizes varibles.
    * @param amount gets loan amount.
    * @return wasLoanMade.
    *
    */

   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }
   
   /**
    * Initilizes varibles.
    * @param amountPaid gets amount paid.
    * @return 0.
    *
    */

   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   
   /**
    * Initilizes varibles.
    * @param args Command line arguments (not used).
    * @return balance.
    *
    */
   
   public double getBalance() {
      return balance;
   }
   
   /**
    * Initilizes varibles.
    * @param interestRateIn gets interest rate amount.
    * @return true.
    *
    */
   
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
    * Initilizes varibles.
    * @param args gets interest rate.
    * @return interestRate.
    *
    */
   
   public double getInterestRate() {
      return interestRate;
   }
   
   /**
    * Initilizes varibles.
    * @param args sets balance.
    *
    */
   
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   
   /**
    * Initilizes varibles.
    * @param args prints to screen.
    * @return output
    *
    */
   
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }
   
   /**
    * Initilizes varibles.
    * @param amount gets amount.
    * @return true.
    *
    */
   
   public static boolean isAmountValid(double amount)
   {
      if (amount >= 0)
      {
         return true;
      }
      return false;
   }
   
   
   /**
    * Initilizes varibles.
    * @param loan gets loan.
    * @return true.
    *
    */
   
   public static boolean isInDebt(BankLoan loan)
   {  
      if (loan.getBalance() > 0)
      {
         return true;
      }
      return false;
   }
   
   /**
    * Initilizes varibles.
    * @param loansCreated counts loans.
    *
    */
   
   public BankLoan(int loansCreated)
   {
      loansCreated++;
   }
   
   /**
    * Initilizes varibles.
    * @param args counts loans.
    * @return loansCreated.
    *
    */
  
   
   public static int getLoansCreated()
   {
      return loansCreated;
   }
   
   /**
    * Initilizes varibles.
    * @param args resets loans.
    *
    */
   
   public static void resetLoansCreated()
   {
      loansCreated = 0;
   }
   
   
   

}
