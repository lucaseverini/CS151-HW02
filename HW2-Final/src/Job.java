/*
	Job.java

    Assignment #2 - CS151 - SJSU
	By Dennis Hsu, Brian Lee, Edmund Dao, Luca Severini 
	San Jose June-19-2014
*/

public class Job 
{
	private static final long serialVersionUID = 1L;
	private static int nextId = 1;

	private final int id;
    private String name;
    private String department;
    private String description;
    private boolean filled;
    
    public Job(String newname, String newDescription, String newDepartment)
    {
		id = nextId++;
        name = newname;
        description = newDescription;
        department = newDepartment;
        filled = false;
    }
        
    public int getId()
    {
        return id;
    }
    
    public void setName(String jobName)
    {
        name = jobName;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setDepartment(String jobDepartment)
    {
        department = jobDepartment;
    }
    
    public String getDepartment()
    {
        return department;
    }
    
    public void setFilled(boolean jobFilled)
    {
        filled = jobFilled;
    }
    
    public void setDescription(String jobDescription)
    {
        description = jobDescription;
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
    public String toString()
    {
        return id + " : " + name + " : " + department + (filled ? ": [filled]" : "");
    }
}
