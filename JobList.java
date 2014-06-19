import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;



public class JobList 
{
    private HashMap jobList;
    private int count;
    
    public JobList()
    {
        jobList = new HashMap<Integer,Job>();
        count=0;
    }
    
    public void addJob(int jobId, String jobName, String jobDepartment, String jobDescription)
    {
        Job nextJob=new Job(jobId,jobName,jobDescription,jobDepartment);
        jobList.put(jobId, nextJob);        
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
                System.out.printf("JobID:%d\nJob:%s\nDepartment:%s\nDescription:%s\n\n",nextJob.getId(),nextJob.getName(),nextJob.getDepartment(),nextJob.getDescription());
            }
        }
        else
        {
            System.out.println("No Jobs on List");
        }
    }
    
    public int getJobSize()
    {
        return jobList.size();
    }
}
