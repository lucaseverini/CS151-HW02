/*
 * Edmund Dao
 * Dennis Hsu
 * Luca Severini
 * Brian Lee
 */

package hireme;

public class Job 
{
    private int id;
    private String name;
    private String department;
    private String description;
    private boolean filled;
    
    public Job(int newId, String newname, String newDescription, String newDepartment)
    {
        name=newname;
        id=newId;
        description=newDescription;
        department=newDepartment;
        filled=false;
    }
    
    public void setId(int jobId)
    {
        id=jobId;
    }
    
    public int getId()
    {
        return id;
    }
    
    public void setName(String jobName)
    {
        name=jobName;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setDepartment(String jobDepartment)
    {
        department=jobDepartment;
    }
    
    public String getDepartment()
    {
        return department;
    }
    
    public void setFilled(boolean jobFilled)
    {
        filled=jobFilled;
    }
    
    public void setDescription(String jobDescription)
    {
        description=jobDescription;
    }
    public String getDescription()
    {
        return description;
    }
    
    public boolean getFilled()
    {
        return filled;
    }   
    
    @Override
    public  String toString()
    {
        return "Job " + id + " : " + name + " : " + department + " : " + (filled ? "[filled]" : "");
    }
    
}

