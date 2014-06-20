package hireme;

import java.util.*;

/**
 *
 * @author Hylix
 */
public class InterviewerList {
    private HashMap<String,Interviewer> myMap;  
    private int id = 0;
    
    public InterviewerList() 
    {
        myMap = new HashMap();
    }
    
    public InterviewerList(HashMap newMap) {
        myMap = newMap;
    }
    
    public void addInterviewer(String name){
        Interviewer i =  new Interviewer(name);
        myMap.put(name, i);
           
        id++;
    }
    
    public void deleteInterviewer(String name) {
        myMap.remove(name);
    }
    
    public int getInterviewerListSize()
    {
        return myMap.size();
    }
    
    public HashMap getInterviewerList()
    {
        return myMap;
    }
    
   public void displayInterviewers()
    {
        List<Interviewer> allInterviewers = new ArrayList(myMap.values());
        
        if (allInterviewers.size()>0)
        {
            System.out.println("Interviewers:");
            for(Interviewer iter : allInterviewers)
            {              
                System.out.print(iter);
                System.out.println("");
            }
        }
        else
        {
            System.out.println("No Interviewers on List");
        }
    }
}
