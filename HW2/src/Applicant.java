/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
	@author Luca
*/

// Applicant -----------------------------------------------------
public class Applicant implements Comparable
{
	private static final long serialVersionUID = 1L;
	private static int nextId = 1;

	int id;
	String firstName;
	String lastName;
	int job;

	Applicant()
	{
		id = nextId++;
		
		firstName = "";
		lastName = "";
		job = 0;
	}

	@Override
	public int compareTo(Object obj)
	{
		Applicant applicant = (Applicant)obj;
		
		int result = lastName.compareToIgnoreCase(applicant.lastName);	
		if(result == 0)
		{
			result = firstName.compareToIgnoreCase(applicant.firstName);
		}
			
		return result;		
	}

	@Override
	public boolean equals(Object obj) 
	{
		if(obj instanceof Applicant)
		{
			Applicant applicant = (Applicant)obj;
			return lastName.equals(applicant.lastName) && firstName.equals(applicant.firstName);
		}
		
		return false;
	}

	@Override
	public  String toString()
	{
		return "applicant " + lastName + " " + firstName;
	}
}
