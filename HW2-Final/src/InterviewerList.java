/*
	InterviewerList.java

    Assignment #2 - CS151 - SJSU
	By Dennis Hsu, Brian Lee, Edmund Dao, Luca Severini 
	San Jose June-19-2014
*/

import java.util.HashMap;
import java.util.*;

public class InterviewerList 
{
    final private HashMap<String, Interviewer> interviewerList;
    
    public InterviewerList() 
    {
        interviewerList = new HashMap<>();
    }
      
    public void addInterviewer(String name)
	{
        Interviewer intrv = new Interviewer(name);
        interviewerList.put(intrv.getName(), intrv);
    }
 
	public Interviewer getInterviewer(String name)
	{
        return interviewerList.get(name);
    }

    public boolean deleteInterviewer(String name)
	{
        return (interviewerList.remove(name) != null);
    }
    
    public int getInterviewerListSize()
    {
        return interviewerList.size();
    }
    
    public HashMap getInterviewerList()
    {
        return interviewerList;
    }
    
   public void displayInterviewers()
    {
		@SuppressWarnings("unchecked")
        List<Interviewer> allInterviewers = new ArrayList(interviewerList.values());
        
        if (allInterviewers.size()>0)
        {
            System.out.println("Interviewers on list:");
			
            for(Interviewer iter : allInterviewers)
            {              
                System.out.println(iter);
            }
			
			System.out.println();
        }
        else
        {
            System.out.println("No Interviewers on list");
        }
    }
}
