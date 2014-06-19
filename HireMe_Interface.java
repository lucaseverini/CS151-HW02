package HireMe;

import java.util.Scanner;

public class JobTest
{
    public static void main ( String[] args )
   {
      Scanner input= new Scanner(System.in);
      //prompt user for input     
      
      int option=-1;
      JobList myJobs=new JobList();
      InterviewerList myInterviewers=new InterviewerList();
      //ApplicantList myApplicants=new ApplicantList();

      //  read the username from the command-line; need to use try/catch with the
      //  readLine() method
      while (option!=0)
      {
          printOptions ();
          
          try 
          {
              option=input.nextInt();
              System.out.println();
          }           
          catch (NumberFormatException nfe )
          {
             System.out.println ( "Error: Must Enter number(0-10). Please try again" );
          }
          
          switch (option)
          {
              case 1:
                  String jobName, jobDepartment,jobDescription;                  
                  input.nextLine();
                  System.out.print("Enter job Name: ");
                  jobName=input.nextLine();
                  System.out.print("Enter job Department: ");
                  jobDepartment=input.nextLine();
                  System.out.print("Enter job Description: ");  
                  jobDescription=input.nextLine();
                  myJobs.addJob(jobName, jobDepartment, jobDescription);
                  break;
              case 2:                  
                  if(myJobs.getJobSize()>0)
                  {
                      System.out.print("Enter jobID of job to be deleted: ");
                      myJobs.deleteJob(input.nextInt());
                  }
                  break;
                  /*
              case 3:
                  String firstName, lastName, email;
                  input.nextLine();
                  System.out.print("Enter Applicant Last Name: ");
                  firstName=input.nextLine();
                  System.out.print("Enter Applicant First Name: ");
                  lastName=input.nextLine();
                  System.out.print("Enter Applicant email: ");
                  email=input.nextLine();
                  myApplicants.add(firstName,lastName,email);
                  break;
              case 4:
                  myApplicants.displayApplicants();
                  System.out.print("Enter Applicant ID to be deleted: ");
                  myApplicants.deleteApplicant(input.nextInt());                  
                  break;*/
              case 5:
                  input.nextLine();
                  System.out.print("Enter Interviewer Name: ");
                  myInterviewers.addInterviewer(input.nextLine());                  
                  break;
              case 6:
                  input.nextLine();
                  System.out.print("Enter Interviewer Name to be Deleted: ");
                  myInterviewers.deleteInterviewer(input.nextLine());
                  break;
              case 7:
                  
                  break;
              case 8:
                  break;
              case 9:                  
                  System.out.print("Enter JobID to be Filled: ");
                  myJobs.getJob(input.nextInt()).setFilled(true);                 
                  break;
              case 10:
                  myJobs.displayJobs();
                  break;
              case 0:
                  System.out.println("Thank you for using HireMe!");
                  break;
              default:
          }
      }
   }

   public static void printOptions ()
   {
            
      System.out.println ( "**********************************************" );
      System.out.println ( "Hello, Welcome to HireMe" );
      System.out.println ( "Select an option by entering a number:" );
      System.out.println ();      
      System.out.println ( "1. Add job" );
      System.out.println ( "2. Delete  job" );
      System.out.println ( "3. Add  applicant" );
      System.out.println ( "4. Delete applicant" );
      System.out.println ( "5. Add interviewer" );
      System.out.println ( "6. Delete interviewer" );
      System.out.println ( "7. Assign an interviewer to an applicant" );
      System.out.println ( "8. Rate an applicant" );
      System.out.println ( "9. Mark a job as filled" );
      System.out.println("10. Display all Jobs");
      System.out.println("0. Exit HireMe");
      System.out.print ( "Choice: ");

   }
}


     
