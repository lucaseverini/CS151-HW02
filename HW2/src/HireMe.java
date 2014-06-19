/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
	@author Luca
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// HireMe -----------------------------------------------------
public class HireMe 
{
	private List<Job> jobs;
	private List<Applicant> applicants;
	private List<Interviewer> interviewers;
	private List<Interview> interviews;
	private List<Rating> ratings;
	private List<Department> departments;

	HireMe()
	{
		jobs = new ArrayList<>();
		applicants = new ArrayList<>();
		interviewers = new ArrayList<>();
		interviews = new ArrayList<>();
		ratings = new ArrayList<>();
		departments = new ArrayList<>();
	}
	
	int addJob(String title, String description, int department, int baseSalary)
	{
		Job job = new Job();
		
		job.title = title;
		job.description = description;
		job.department = department;
		job.baseSalary = baseSalary;
		
		for(Job iter : jobs)
		{
			if(iter.equals(job))
			{
				return 0;
			}
		}
		
		jobs.add(job);
		
		return job.id;
	}
	
	Job getJob(int jobId)
	{
		for(Job iter : jobs)
		{
			if(iter.id == jobId)
			{
				return iter;
			}
		}
		
		return null;
	}
	
	int addApplicant(String firstName, String lastName, String email, int jobId)
	{
		Applicant applicant = new Applicant();
		
		applicant.firstName = firstName;
		applicant.lastName = lastName;
		applicant.email = email;
		applicant.job = jobId;
		
		for(Applicant iter : applicants)
		{
			if(iter.equals(applicant))
			{
				return 0;
			}
		}

		applicants.add(applicant);
		
		return applicant.id;
	}

	int addInterviewer(String firstName, String lastName, int deptId)
	{
		Interviewer interviewer = new Interviewer();
		
		interviewer.firstName = firstName;
		interviewer.lastName = lastName;
		interviewer.department = deptId;
		
		for(Interviewer iter : interviewers)
		{
			if(iter.equals(interviewer))
			{
				return 0;
			}
		}

		interviewers.add(interviewer);
		
		return interviewer.id;
	}

	Applicant getApplicant(int applicantId)
	{
		for(Applicant iter : applicants)
		{
			if(iter.id == applicantId)
			{
				return iter;
			}
		}
		
		return null;
	}
	
	Interviewer getInterviewer(int interviewerId)
	{
		for(Interviewer iter : interviewers)
		{
			if(iter.id == interviewerId)
			{
				return iter;
			}
		}
		
		return null;
	}

	void printApplicants()
	{
		Collections.sort(applicants);

		for(Applicant iter : applicants)
		{
			System.out.println(iter);
		}
	}

	void printInterviewers()
	{
		Collections.sort(interviewers);

		for(Interviewer iter : interviewers)
		{
			System.out.println(iter);
		}
	}

	void printJobs()
	{
		Collections.sort(jobs);

		for(Job iter : jobs)
		{
			System.out.println(iter);
		}
	}

	void printDepartments()
	{
		Collections.sort(departments);

		for(Department iter : departments)
		{
			System.out.println(iter);
		}
	}
	
	int addDepartment(String name)
	{
		Department dept = new Department();
		
		dept.name = name;
		
		for(Department iter : departments)
		{
			if(iter.equals(dept))
			{
				return 0;
			}
		}
		
		departments.add(dept);
		
		return dept.id;
	}
	
	int getDepartmentId(String name)
	{
		for(Department iter : departments)
		{
			if(iter.name.compareToIgnoreCase(name) == 0)
			{
				return iter.id;
			}
		}
		
		return 0;
	}

	int getJobId(String title)
	{
		for(Job iter : jobs)
		{
			if(iter.title.compareToIgnoreCase(title) == 0)
			{
				return iter.id;
			}
		}
		
		return 0;
	}

}
