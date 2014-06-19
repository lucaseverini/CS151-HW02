package HireMe;

import java.util.Scanner;

/**
 @author Ed
 */
public class HireMe_Interface
{

   public static void main ( String[] args )
   {
      Scanner input= new Scanner(System.in);
      //prompt user for input
      printOptions ();
      
      int option=-1;

      //  read the username from the command-line; need to use try/catch with the
      //  readLine() method
      while (option!=0)
      {
          try 
          {
              option=input.nextInt();
          }           
          catch ( IOException | NumberFormatException nfe )
          {
             System.out.println ( "Error: Must Enter number(0-9). Please try again" );
         
          }
      }
    


   }

   public static void printOptions ()
   {
      System.out.println ( "" );
      System.out.println ( "**********************************************" );
      System.out.println ( "" );
      System.out.println ( "Hello, Welcome to HireMe" );
      System.out.println ( "" );
      System.out.println ( "Select an option by entering a number:" );
      System.out.println ( "" );
      System.out.println ( "1. Add job" );
      System.out.println ( "" );
      System.out.println ( "2. Delete  job" );
      System.out.println ( "" );
      System.out.println ( "3. Add  applicant" );
      System.out.println ( "" );
      System.out.println ( "4. Delete applicant" );
      System.out.println ( "" );
      System.out.println ( "5. Add interviewer" );
      System.out.println ( "" );
      System.out.println ( "6. Delete interviewer" );
      System.out.println ( "" );
      System.out.println ( "7. Assign an interviewer to an applicant" );
      System.out.println ( "" );
      System.out.println ( "8. Rate an applicant" );
      System.out.println ( "" );
      System.out.println ( "9. Mark a job as filled" );
      System.out.println ( "" );

   }
}
