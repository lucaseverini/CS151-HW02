/*
	JobList.java

    Assignment #2 - CS151 - SJSU
	By Dennis Hsu, Brian Lee, Edmund Dao, Luca Severini 
	San Jose June-19-2014
*/

import java.util.HashMap;
import java.util.Set;

public class JobList 
{
    private final HashMap<Integer, Job> jobList;
    
    public JobList()
    {
        jobList = new HashMap<>();
    }
    
    public void addJob(String jobName, String jobDepartment, String jobDescription)
    {
        Job job = new Job(jobName, jobDescription, jobDepartment);
        jobList.put(job.getId(), job);
     }
    
    public boolean deleteJob(int jobId)
    {
        return (jobList.remove(jobId) != null);
    }
    
    public void displayJobs()
    {
        if (jobList.size() > 0)
        {
			System.out.println("Jobs on list:");
			
			Set keys = jobList.keySet();
			for (Object key : keys)
            {         
                Job job = jobList.get((int)key);
 				System.out.printf("Job: %s\n", job.getName());
                System.out.printf("JobId: %d\n", job.getId());
                System.out.printf("Department: %s\n", job.getDepartment());
				System.out.printf("Description: %s\n", job.getDescription());
                System.out.printf("Job Filled: %b\n\n", job.getFilled());
            }            
        }
        else
        {
            System.out.println("No Jobs on list");
        }
    }
    
    public void displayJobIDs()
    {
        System.out.println("Jobs on list:");
		
        if (jobList.size() > 0)
        {
			Set keys = jobList.keySet();
			for (Object key : keys)
            {         
                Job job = jobList.get((int)key);
                System.out.println(job);                
            }
			
            System.out.println();
        }
    }
    
    public int getJobSize()
    {
        return jobList.size();
    }
    
    public Job getJob(int jobId)
    {
        return jobList.get(jobId);
    }
    
    public HashMap getJobList()
    {
        return jobList;
    }
}
