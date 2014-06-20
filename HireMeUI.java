/*
 * Edmund Dao
 * Dennis Hsu
 * Luca Severini
 * Brian Lee
 */

package hireme;  

import java.util.Scanner;


public class HireMeUI
{
    public static void main ( String[] args )
   {
      Scanner input= new Scanner(System.in);
      //prompt user for input     
      
      int option=-1;
      HireMe myHireMe= new HireMe();      

      //  read the username from the command-line; need to use try/catch with the
      //  readLine() method
      while (option!=0)
      {
          printOptions ();
          try 
          {
              option=Integer.parseInt(input.next());
              System.out.println();
          }           
          catch (NumberFormatException nfe )
          {
             System.out.println ( "Error: Must Enter number(0-12). Please try again" );
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
                  myHireMe.getJobList().addJob(jobName, jobDepartment, jobDescription);
                  
                  break;
              case 2:     
                  
                    if(myHireMe.getJobList().getJobSize()>0)
                    {
                        myHireMe.getJobList().displayJobIDs();
                        System.out.print("Enter jobID of job to be deleted: ");
                        myHireMe.getJobList().deleteJob(input.nextInt());                      
                    }
                    else
                    {
                        System.out.println("No Jobs on List.");
                    }
                  break;
                  
              case 3:
                  String firstName, lastName, email;
                  input.nextLine();
                  System.out.print("Enter Applicant Last Name: ");
                  firstName=input.nextLine();
                  System.out.print("Enter Applicant First Name: ");
                  lastName=input.nextLine();
                  System.out.print("Enter Applicant email: ");
                  email=input.nextLine();
                  myHireMe.getApplicantList().addApplicant(firstName,lastName,email);
                  break;
              case 4:
                  if(myHireMe.getApplicantList().getApplicantListSize()>0)
                  {
                      myHireMe.getApplicantList().displayApplicants();
                      System.out.print("Enter Applicant ID to be deleted: ");
                      myHireMe.getApplicantList().deleteApplicant(input.nextInt());                  
                  }
                  else
                  {
                      System.out.println("No Applicants on List");
                  }    
                                    
                  break;
              case 5:
                  input.nextLine();
                  System.out.print("Enter Interviewer Name: ");
                  myHireMe.getInterviewerList().addInterviewer(input.nextLine());                  
                  break;
              case 6:
                  if(myHireMe.getInterviewerList().getInterviewerListSize()>0)
                  {
                      input.nextLine();
                      myHireMe.getInterviewerList().displayInterviewers();
                      System.out.print("Enter Interviewer Name to be Deleted: ");
                      myHireMe.getInterviewerList().deleteInterviewer(input.nextLine());                     
                  }
                  else
                  {
                      System.out.println("No Interviewers on List");
                  }      
                  
                  break;
              case 7:
                  if(myHireMe.getApplicantList().getApplicantListSize()>0 && myHireMe.getInterviewerList().getInterviewerListSize()>0)
                  {
                      int applicantID;
                      myHireMe.getApplicantList().displayApplicants();
                      System.out.print("Enter ApplicantID: ");
                      applicantID=input.nextInt();
                      input.nextLine();
                      myHireMe.getInterviewerList().displayInterviewers();
                      System.out.print("Enter Interviewer Name:");
                      myHireMe.assignInterviewerToApplicant(input.nextLine(), applicantID);
                  }
                  else
                  {
                      System.out.println("Interviewer or Applicant List empty.");
                  }
                  break;
              case 8:
                  if(myHireMe.getApplicantList().getApplicantListSize()>0)
                  {
                      int applicantID;
                      int experience,attitude,salary;                      
                      myHireMe.getApplicantList().displayApplicants();
                      System.out.print("Enter Applicant ID: ");
                      applicantID=input.nextInt();
                      System.out.print("Experience Rating: ");
                      experience=input.nextInt();
                      System.out.print("Attitude Rating: ");
                      attitude=input.nextInt();
                      System.out.print("Salary Rating: ");
                      salary=input.nextInt();
                      myHireMe.rateApplicant(applicantID, experience, attitude, salary);
                  }
                  else
                  {
                      System.out.println("No Applicants on List");
                  }
                  break;
              case 9:
                  if(myHireMe.getJobList().getJobSize()>0)
                  {
                      myHireMe.getJobList().displayJobIDs(); 
                      System.out.print("Enter JobID to be Filled: ");
                      myHireMe.getJobList().getJob(input.nextInt()).setFilled(true);                      
                  }
                  else
                  {
                      System.out.println("No Jobs on List");
                  }              
                  break;
              case 10:
                  myHireMe.getJobList().displayJobs();
                  break;
              case 11:
                  myHireMe.getApplicantList().displayApplicants();
                  break;
              case 12:
                  myHireMe.getInterviewerList().displayInterviewers();
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
      System.out.println("11. Display all Applicants");
      System.out.println("12. Display all Interviewers");
      System.out.println("0. Exit HireMe");
      System.out.print ( "Choice: ");
   }
}
