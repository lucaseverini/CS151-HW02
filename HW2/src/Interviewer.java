/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
	@author Luca
*/

// Interviewer -----------------------------------------------------
public class Interviewer implements Comparable
{
	private static final long serialVersionUID = 1L;

	String name;

	Interviewer(String name)
	{
		this.name = name;
	}

	@Override
	public int compareTo(Object obj)
	{
		Interviewer interviewer = (Interviewer)obj;
		
		int result = name.compareToIgnoreCase(interviewer.name);	
			
		return result;		
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
	public  String toString()
	{
		return "interviewer " + name;
	}
}
