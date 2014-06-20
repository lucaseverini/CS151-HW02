/*
 * Edmund Dao
 * Dennis Hsu
 * Luca Severini
 * Brian Lee
 */

package hireme;

import java.util.ArrayList;
import java.util.List;

// Applicant -----------------------------------------------------
public class Applicant implements Comparable
{
	private static final long serialVersionUID = 1L;
	private static int nextId = 1;

	int id;
	String firstName;
	String lastName;
	String email;
	int rating[];
	int job;
	public List<String> interviewers;

	Applicant(String firstName, String lastName, String email)
	{
		this.id = nextId++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
                this.rating= new int[3];

		this.interviewers = new ArrayList();
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
		return "ID:" + id + " " + lastName + " " + firstName + " " + email + " Interviewers:" + interviewers + " Rating(Experience,Attitude,Salary):" +rating[0] + " " + rating[1] + " " + rating[2];
	}

	int getId()
	{
		return id;
	}

	String getFirstName()
	{
		return firstName;
	}

	String getLastName()
	{
		return lastName;
	}

	String getEmail()
	{
		return email;
	}

	public int[] getRating()
	{
		return rating;
	}

	void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	void setEmail(String email)
	{
		this.email = email;
	}

	void setRating(int experience, int attitude, int salary)
	{		 
		rating[0] = experience;
		rating[1] = attitude;
		rating[2] = salary;
	}

	void addInterviewer(String interviewer)
	{
		this.interviewers.add(interviewer);
	}
}
