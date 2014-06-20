
import java.util.Objects;

/*
	Interviewer.java

    Assignment #2 - CS151 - SJSU
	By Dennis Hsu, Brian Lee, Edmund Dao, Luca Severini 
	San Jose June-19-2014
*/   

public class Interviewer implements Comparable
{
    private String name;
    
    public Interviewer(String name) 
	{
        this.name = name;
    }
    
    public String getName()
	{
        return this.name;
    }
    
    public void setName(String name) 
	{
        this.name = name;
    }
    
    @Override
    public String toString()
    {
        return this.name;
    }

	@Override
	public int compareTo(Object obj)
	{
		Interviewer interviewer = (Interviewer)obj;

		return name.compareToIgnoreCase(interviewer.name);	
	}

	@Override
	public boolean equals(Object obj) 
	{
		if(obj instanceof Interviewer)
		{
			Interviewer interviewer = (Interviewer)obj;
			return name.equals(interviewer.name);
		}

		return false;
	}

	@Override
	public int hashCode()
	{
		int hash = 5;
		hash = 47 * hash + Objects.hashCode(name);
		return hash;
	}
} 

