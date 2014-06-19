/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
	@author Luca
*/

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Job -----------------------------------------------------
public class Job implements Comparable
{
	private static final long serialVersionUID = 1L;
	private static int nextId = 1;
	
	int id;
	String name;
	String department;
	String description;
	boolean filled;
	
	Job(String name, String department, String description)
	{
		this.id = nextId++;
		this.name = name;
		this.description = description;
		this.department = department;
		this.filled = false;
	}

	@Override
	public int compareTo(Object obj)
	{
		Job job = (Job)obj;
		
		if(this.id > job.id)
		{
			return -1;
		}
		else if(id < job.id)
		{
			return 1;
		}
		
		return 0;		
	}
		
	@Override
	public boolean equals(Object obj) 
	{
		if(obj instanceof Job)
		{
			Job job = (Job)obj;
			return (id == job.id);
		}
		
		return false;
	}

	@Override
	public  String toString()
	{
		return id + " : " + name;
	}
}
