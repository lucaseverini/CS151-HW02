
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// @author Luca Severini

public class CS151HW2
{
	static HireMe app;
	
	// @param args the command line arguments
	public static void main(String[] args)
	{
		app = new HireMe();
		
		addDepartment();
		
		addJob();
	}
	
	static void addApplicant()
	{	
		Scanner in = new Scanner(System.in);

		System.out.println("Applicant First Name:");
		String firstName = in.nextLine();

		System.out.println("Applicant Last Name:");
		String lastName = in.nextLine();

		System.out.println("Applicant Email:");
		String email = in.nextLine();

		int jobId = 0;
		while(true)
		{
			System.out.println("Applicant Job:");
			String job = in.nextLine();
			jobId = app.getJobId(job);
			if(jobId != 0)
			{
				break;
			}
			else
			{
				System.out.println("Job " + job + " doesn't exist");
			}
		}

		int applicantId = app.addApplicant(firstName, lastName, email, jobId);
		if(applicantId != 0)
		{
			System.out.println("Applicant created. ID: " + applicantId);
		}
		else
		{
			System.out.println("Error creating Applicant");
		}
	}

		static void addInterviewer()
	{	
		Scanner in = new Scanner(System.in);

		System.out.println("Interviewer First Name:");
		String firstName = in.nextLine();

		System.out.println("Interviewer Last Name:");
		String lastName = in.nextLine();

		int deptId = 0;
		while(true)
		{
			System.out.println("Interviewer Department:");
			String dept = in.nextLine();
			deptId = app.getDepartmentId(dept);
			if(deptId != 0)
			{
				break;
			}
			else
			{
				System.out.println("Department " + dept + " doesn't exist");
			}
		}

		int interviewerId = app.addInterviewer(firstName, lastName, deptId);
		if(interviewerId != 0)
		{
			System.out.println("Interviewer created. ID: " + interviewerId);
		}
		else
		{
			System.out.println("Error creating Interviewer");
		}
	}

	static void addDepartment()
	{	
		Scanner in = new Scanner(System.in);

		System.out.println("Department Name:");
		String name = in.nextLine();

		int deptId = app.addDepartment(name);
		if(deptId != 0)
		{
			System.out.println("Department created. ID: " + deptId);
		}
		else
		{
			System.out.println("Error creating Department");
		}
	}
	
	static void addJob()
	{	
		Scanner in = new Scanner(System.in);

		System.out.println("Job Title:");
		String title = in.nextLine();
		
		System.out.println("Job Description:");
		String desc = in.nextLine();

		int deptId = 0;
		while(true)
		{
			System.out.println("Job Department:");
			String dept = in.nextLine();
			deptId = app.getDepartmentId(dept);
			if(deptId != 0)
			{
				break;
			}
			else
			{
				System.out.println("Department " + dept + " doesn't exist");
			}
		}
		
		System.out.println("Job Salary (cents):");
		int salary = Integer.parseInt(in.nextLine());

		int jobId = app.addJob(title, desc, deptId, salary);
		if(jobId != 0)
		{
			System.out.println("Job created. ID: " + jobId);
		}
		else
		{
			System.out.println("Error creating Job");
		}
	}
}
