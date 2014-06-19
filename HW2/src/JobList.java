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
import java.util.HashMap;
import java.util.List;


// JobList -----------------------------------------------------
public class JobList 
{
	private static HashMap<Integer, Job> jobList;
	private static int jobId = 1;

	JobList()
	{
		jobList = new HashMap<>();
	}
	
	int addJob(String name, String department, String description)
	{
		Job job = new Job(name, department, description);
		jobList.put(job.id, job);
		
		return job.id;
	}
	
	boolean deleteJob(int jobId)
	{
		Job job = jobList.get(jobId);
		if(job != null)
		{
			jobList.remove(jobId);
			return true;
		}
		else
		{
			return false;
		}
	}

	Job getJob(int jobId)
	{
		return jobList.get(jobId);
	}

	@SuppressWarnings("unchecked")
	void printJobs()
	{
		List<Job> jobs = new ArrayList(jobList.values());
		
		Collections.sort(jobs);
		
		for(Job iter : jobs)
		{
			System.out.println(iter);
		}
	}
}
