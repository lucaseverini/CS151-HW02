package HireMe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;



public class JobList 
{
    private HashMap jobList;
    private int jobId;
    
    public JobList()
    {
        jobList = new HashMap<Integer,Job>();
        jobId=1;
    }
    
    public void addJob(String jobName, String jobDepartment, String jobDescription)
    {
        Job nextJob=new Job(jobId,jobName,jobDescription,jobDepartment);
        jobList.put(jobId, nextJob);
        ++jobId;
    }
    
    public void deleteJob(int jobId)
    {
        jobList.remove(jobId);
    }
    
    public void displayJobs()
    {
        Set keys=jobList.keySet();
        int size=jobList.size();
        if (size > 0)
        {
            for (Iterator i=keys.iterator(); i.hasNext();)
            {         
                int key=(int)i.next();
                Job nextJob=(Job) jobList.get(key);
                System.out.printf("JobID:%d\nJob:%s\nDepartment:%s\nDescription:%s\n",nextJob.getId(),nextJob.getName(),nextJob.getDepartment(),nextJob.getDescription());
                System.out.printf("Job Filled: %b", nextJob.getFilled());
            }
            System.out.println();
        }
        else
        {
            System.out.println("No Jobs on List");
        }
    }
    
    public void displayJobIDs()
    {
        Set keys=jobList.keySet();
        int size=jobList.size();
        
        System.out.print("Available JobIDs:");
        if (size > 0)
        {
            for (Iterator i=keys.iterator(); i.hasNext();)
            {         
                int key=(int)i.next();
                Job nextJob=(Job) jobList.get(key);
                System.out.printf(" %d",nextJob.getId());                
            }
            System.out.println();
        }
    
    public int getJobSize()
    {
        return jobList.size();
    }
    
    public Job getJob(int jobId)
    {
        return (Job)jobList.get(jobId);
    }
}
    
