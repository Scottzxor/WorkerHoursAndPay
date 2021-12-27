import java.util.Scanner;

/**
   This program demonstrates a solution to the
   Payroll Class programming challenge.
*/

public class PayrollDemo
{
   public static void main(String[] args)
   {
      // Variables for input
      String name;         // An employee's name
      int id;              // An employee's ID number
      double payRate;      // An employee's pay rate
      double hoursWorked;  // The number of hours worked
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Get the employee's name.
      System.out.print("Enter the employee's name: ");
      name = keyboard.nextLine();
      
      // Get the employee's ID number.
      System.out.print("Enter the employee's ID number: ");
      id = keyboard.nextInt();

      // Get the employee's pay rate.
      System.out.print("Enter the employee's hourly pay rate: ");
      payRate = keyboard.nextDouble();
      
      // Get the number of hours worked by the employee.
      System.out.print("Enter the number of hours worked " +
                       " by the employee: ");
      hoursWorked = keyboard.nextDouble();

      // Create a Payroll object and store the data in it.
      Payroll worker = new Payroll(name, id);
      
      //try to set PayRate
      try {
          worker.setPayRate(hoursWorked);
          } catch (InvalidPayRate e) {
        	  if (worker.getPayRate() > 0 || worker.getHoursWorked() > 84) {
        		 //Printing getMessage() here resulted in no printing.
        		  //System.exit(1);
        	  }
    		 System.out.println(e.getMessage());
          }
      
      //try to set hours
      try {
          worker.setHoursWorked(hoursWorked);
          } catch (InvalidHoursException e) {
        	  if (worker.getHoursWorked() > 0 || worker.getHoursWorked() > 84) {
        		 //Printing getMessage() here resulted in no printing.
        		  //System.exit(1);
        	  }
    		 System.out.println(e.getMessage());
          }
      
      //try to set worker's id number
      try {
          worker.setIdNumber(id);
          } catch (InvalidIDException e) {
        	  if (worker.getIdNumber() <= 0) {
        		  System.out.println(e.getMessage());
        		  //System.exit(1);
        	  }
          }

      //try to set worker's name
      try {
      worker.setName(name);
      } catch (EmptyStringException e) {
    	  if (worker.getName().equals("")) {
    		  System.out.println(e.getMessage());
    		  //System.exit(1);
    	  }
      }
      
      // Display the employee's payroll data.
      System.out.println("\nEmployee Payroll Data");
      System.out.println("Name: " + worker.getName());
      System.out.println("ID Number: " + worker.getIdNumber());
      System.out.println("Hourly pay rate: " + worker.getPayRate());
      System.out.println("Hours worked: " + worker.getHoursWorked());
      System.out.println("Gross pay: $" + worker.getGrossPay());
   }
}
