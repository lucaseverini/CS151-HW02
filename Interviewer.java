package HireMe;


   

import java.util.ArrayList;

public class Interviewer {
    private String name;
    
    public ArrayList<String> applicantAndInterviewerList = new ArrayList<String>();
    
    public Interviewer(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString()
    {
        return this.name;
    }
} 

