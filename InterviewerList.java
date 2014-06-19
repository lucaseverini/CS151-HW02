/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cs151_hw2;

import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
/**
 *
 * @author Hylix
 */
public class InterviewerList {
    private HashMap myMap = new HashMap();
    private int id = 0;
    
    public InterviewerList() {
    }
    
    public InterviewerList(HashMap newMap) {
        myMap = newMap;
    }
    
    public void addInterviewer(String name){
        myMap.put(name, name);
        id++;
    }
    
    public void deleteInterviewer(String name) {
        myMap.remove(name);
    }
    
    public int getInterviewerListSize()
    {
        return myMap.size();
    }
    
    public void displayInterviewers()
    {
        Set keys=myMap.keySet();
        int size=myMap.size();
        System.out.println("Interviewers:");
        if (size > 0)
        {
            for (Iterator i=keys.iterator(); i.hasNext();)
            {         
                int key=(int)i.next();
                Interviewer nextInterviewer=(Interviewer) myMap.get(key);
                System.out.printf("%s\n", nextInterviewer.getName());                
            }
            System.out.println();
        }
        else
        {
            System.out.println("No Jobs on List");
        }
    }
}
