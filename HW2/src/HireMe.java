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
	
	int addApplicant(String firstName, String lastName)
	{
		Applicant applicant = new Applicant();
		
		applicant.firstName = firstName;
		applicant.lastName = lastName;
		
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
}
