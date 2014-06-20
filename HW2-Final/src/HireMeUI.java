/*
	HireMeUI.java

    Assignment #2 - CS151 - SJSU
	By Dennis Hsu, Brian Lee, Edmund Dao, Luca Severini 
	San Jose June-19-2014
*/

import java.util.Scanner;

public class HireMeUI
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		// prompt user for input     

		HireMe myHireMe = new HireMe();

		// read the username from the command-line; need to use try/catch with the
		// readLine() method
		int option = -1;
		while(option != 0) 
		{
			printOptions();

			try 
			{
				option = Integer.parseInt(input.nextLine());
				System.out.println();
			}
			catch(NumberFormatException nfe) 
			{
				System.out.println("Error: Must Enter number(0-12). Please try again");
			}

			switch(option) 
			{
				case 1:
				{
					String jobName;
					String jobDepartment;
					String jobDescription;

					System.out.print("Enter job Name: ");
					jobName = input.nextLine();
					if(jobName.isEmpty())
					{
						break;
					}

					System.out.print("Enter job Department: ");
					jobDepartment = input.nextLine();
					if(jobDepartment.isEmpty())
					{
						break;
					}

					System.out.print("Enter job Description: ");
					jobDescription = input.nextLine();
					if(jobDescription.isEmpty())
					{
						break;
					}

					myHireMe.getJobList().addJob(jobName, jobDepartment, jobDescription);
					
					System.out.println("Job added\n");
					break;
				}
				
				case 2:
				{
					if(myHireMe.getJobList().getJobSize() > 0) 
					{
						myHireMe.getJobList().displayJobIDs();

						int jobId = 0;
						try 
						{
							System.out.print("Enter jobID of job to be deleted: ");
							String str = input.nextLine();
							if(str.isEmpty())
							{
								break;
							}

							jobId = Integer.parseInt(str);
						}
						catch(NumberFormatException nfe) 
						{
							System.out.println("Error: Invalid Job Id\n");
							break;
						}

						if(myHireMe.getJobList().deleteJob(jobId))
						{
							System.out.println("Job deleted\n");
						}
						else
						{
							System.out.println("Job not on list\n");
						}
					}
					else 
					{
						System.out.println("No Jobs on list\n");
					}
					break;
				}

				case 3:
				{
					String firstName;
					String lastName;
					String email;

					System.out.print("Enter Applicant Last Name: ");
					firstName = input.nextLine();
					if(firstName.isEmpty())
					{
						break;
					}

					System.out.print("Enter Applicant First Name: ");
					lastName = input.nextLine();
					if(lastName.isEmpty())
					{
						break;
					}

					System.out.print("Enter Applicant email: ");
					email = input.nextLine();
					if(email.isEmpty())
					{
						break;
					}

					myHireMe.getApplicantList().addApplicant(firstName, lastName, email);
					
					System.out.println("Applicant added\n");
					break;
				}

				case 4:
				{
					if(myHireMe.getApplicantList().getApplicantListSize() > 0)
					{
						myHireMe.getApplicantList().displayApplicants();

						int appId = 0;
						try 
						{
							System.out.print("Enter Applicant ID to be deleted: ");
							String str = input.nextLine();
							if(str.isEmpty())
							{
								break;
							}

							appId = Integer.parseInt(str);
						}
						catch(NumberFormatException nfe) 
						{
							System.out.println("Error: Invalid Applicant Id\n");
							break;
						}

						if(myHireMe.getApplicantList().deleteApplicant(appId))
						{
							System.out.println("Applicant deleted\n");
						}
						else 
						{
							System.out.println("Applicant not on list\n");
						}
					}
					else 
					{
						System.out.println("No Applicants on List\n");
					}
					break;
				}

				case 5:
				{
					System.out.print("Enter Interviewer Name: ");
					String name = input.nextLine();
					if(name.isEmpty())
					{
						break;
					}

					myHireMe.getInterviewerList().addInterviewer(name);
					
					System.out.println("Interviewer added\n");
					break;
				}

				case 6:
				{
					if(myHireMe.getInterviewerList().getInterviewerListSize() > 0) 
					{
						myHireMe.getInterviewerList().displayInterviewers();

						System.out.print("Enter Interviewer Name to be Deleted: ");

						String name = input.nextLine();
						if(name.isEmpty())
						{
							break;
						}

						if(myHireMe.getInterviewerList().deleteInterviewer(name))
						{
							System.out.println("Interviewer deleted\n");
						}
						else
						{
							System.out.println("Interviewer not on list\n");
						}
					}
					else 
					{
						System.out.println("No Interviewers on List\n");
					}
					break;
				}

				case 7:
				{
					if(myHireMe.getApplicantList().getApplicantListSize() > 0
							&& myHireMe.getInterviewerList().getInterviewerListSize() > 0)
					{
						myHireMe.getApplicantList().displayApplicants();

						int applicantId;
						
						try 
						{
							System.out.print("Enter Applicant ID: ");
						
							String str = input.nextLine();
							if(str.isEmpty())
							{
								break;
							}
							
							applicantId = Integer.parseInt(str);
						}					
						catch(NumberFormatException nfe) 
						{
							System.out.printf("Error: Invalid Applicant Id\n\n");
							break;
						}

						myHireMe.getInterviewerList().displayInterviewers();
						System.out.print("Enter Interviewer Name:");
						String name = input.nextLine();
						if(name.isEmpty())
						{
							break;
						}
						
						if(myHireMe.getInterviewerList().getInterviewer(name) == null)
						{
							System.out.println("Interviewer not on list\n");
							break;
						}

						Applicant applicant = myHireMe.getApplicantList().getApplicant(applicantId);
						if(applicant != null)
						{
							myHireMe.assignInterviewerToApplicant(applicantId, name);
							
							System.out.println("Interviewer assigned to applicant\n");
						}
						else
						{
							System.out.println("Applicant not on list\n");
						}
					}
					else 
					{
						System.out.println("Interviewer and/or Applicant list empty\n");
					}
					break;
				}

				case 8:
				{
					if(myHireMe.getApplicantList().getApplicantListSize() > 0)
					{
						int applicantId;
						int experience, attitude, salary;

						myHireMe.getApplicantList().displayApplicants();

						try 
						{
							System.out.print("Enter Applicant ID: ");
						
							String str = input.nextLine();
							if(str.isEmpty())
							{
								break;
							}
							
							applicantId = Integer.parseInt(str);
						}					
						catch(NumberFormatException nfe) 
						{
							System.out.printf("Error: Invalid Applicant Id\n\n");
							break;
						}
						
						try 
						{
							System.out.print("Experience Rating: ");
							
							String str = input.nextLine();
							if(str.isEmpty())
							{
								break;
							}
							
							experience = Integer.parseInt(str);
							if(experience < 0 || experience > 10)
							{
								System.out.printf("Error: Invalid Experience rating\n\n");
								break;
							}
						}					
						catch(NumberFormatException nfe) 
						{
							System.out.printf("Error: Invalid Experience rating\n\n");
							break;
						}

						try 
						{
							System.out.print("Attitude Rating: ");
							
							String str = input.nextLine();
							if(str.isEmpty())
							{
								break;
							}
							
							attitude = Integer.parseInt(str);
							if(attitude < 0 || attitude > 10)
							{
								System.out.printf("Error: Invalid Attitude rating\n\n");
								break;
							}
						}					
						catch(NumberFormatException nfe) 
						{
							System.out.printf("Error: Invalid Attitude rating\n\n");
							break;
						}

						try 
						{
							System.out.print("Salary Rating: ");
							
							String str = input.nextLine();
							if(str.isEmpty())
							{
								break;
							}
							
							salary = Integer.parseInt(str);
							if(salary < 0 || salary > 10)
							{
								System.out.printf("Error: Invalid Salary rating\n\n");
								break;
							}
						}					
						catch(NumberFormatException nfe) 
						{
							System.out.printf("Error: Invalid Salary rating\n\n");
							break;
						}

						Applicant applicant = myHireMe.getApplicantList().getApplicant(applicantId);
						if(applicant != null)
						{
							myHireMe.rateApplicant(applicantId, experience, attitude, salary);
						}
						else
						{
							System.out.println("Applicant not on list\n");
						}
					}
					else
					{
						System.out.println("No Applicants on List\n");
					}
					break;
				}

				case 9:
				{
					if(myHireMe.getJobList().getJobSize() > 0) 
					{
						myHireMe.getJobList().displayJobIDs();

						int jobId;
						try 
						{
							System.out.print("Enter JobID to be Filled: ");
						
							String str = input.nextLine();
							if(str.isEmpty())
							{
								break;
							}
							
							jobId = Integer.parseInt(str);
						}					
						catch(NumberFormatException nfe) 
						{
							System.out.printf("Error: Invalid Job Id\n\n");
							break;
						}

						Job job = myHireMe.getJobList().getJob(jobId);
						if(job != null)
						{
							job.setFilled(true);
							
							System.out.println("Job filled\n");
						}
						else
						{
							System.out.println("Job not on list\n");
						}
					}
					else 
					{
						System.out.println("No Jobs on List\n");
					}
					break;
				}

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
					System.out.println("Invalid choice\n");
					break;
			}
		}
	}
   
	public static void printOptions ()
	{            
		System.out.println("**********************************************");
		System.out.println("Hello, Welcome to HireMe!");
		System.out.println("Select an option by entering a number:");
		System.out.println();
		System.out.println("1.  Add job");
		System.out.println("2.  Delete job");
		System.out.println("3.  Add applicant");
		System.out.println("4.  Delete applicant");
		System.out.println("5.  Add interviewer");
		System.out.println("6.  Delete interviewer");
		System.out.println("7.  Assign an interviewer to an applicant");
		System.out.println("8.  Rate an applicant");
		System.out.println("9.  Mark a job as filled");
		System.out.println("10. Display all jobs");
		System.out.println("11. Display all applicants");
		System.out.println("12. Display all interviewers");
		
		System.out.println("0.  Exit HireMe");
		System.out.println();
		System.out.print("Choice: ");
   }
}