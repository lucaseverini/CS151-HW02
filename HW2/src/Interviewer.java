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
	private static int nextId = 1;

	int id;
	String firstName;
	String lastName;
	int department;

	Interviewer()
	{
		id = nextId++;
		
		firstName = "";
		lastName = "";
		department = 0;
	}

	@Override
	public int compareTo(Object obj)
	{
		Interviewer interviewer = (Interviewer)obj;
		
		int result = lastName.compareToIgnoreCase(interviewer.lastName);	
		if(result == 0)
		{
			result = firstName.compareToIgnoreCase(interviewer.firstName);
			if(result == 0)
			{
				if(department > interviewer.department)
				{
					result = -1;
				}
				else if(department < interviewer.department)
				{
					result = 1;
				}
			}
		}
			
		return result;		
	}

	@Override
	public boolean equals(Object obj) 
	{
		if(obj instanceof Interviewer)
		{
			Interviewer interviewer = (Interviewer)obj;
			return lastName.equals(interviewer.lastName) && firstName.equals(interviewer.firstName);
		}
		
		return false;
	}

	@Override
	public  String toString()
	{
		return "interviewer " + lastName + " " + firstName;
	}
}
