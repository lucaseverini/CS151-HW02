package HireMe;

import java.io.*;

/**
 @author Ed
 */
public class HireMe_Interface
{

   public static void main ( String[] args )
   {
      //prompt user for input
      printOptions ();
      BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) );

      int option;

      //  read the username from the command-line; need to use try/catch with the
      //  readLine() method
      try
      {
         option = Integer.parseInt ( br.readLine () );
      } catch ( IOException | NumberFormatException nfe )
      {
         System.out.println ( "Please try again" );
         System.exit ( 1 );
      }
   }

   public static void printOptions ()
   {
      System.out.println ( "" );
      System.out.println ( "**********************************************" );
      System.out.println ( "" );
      System.out.println ( "Hello, Welcome to Hire me" );
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
      System.out.println ( "4. Assign an interviewer to an applicant" );
      System.out.println ( "" );
      System.out.println ( "5. Rate an applicant" );
      System.out.println ( "" );
      System.out.println ( "6. Mark a job as filled" );
      System.out.println ( "" );

   }
}
