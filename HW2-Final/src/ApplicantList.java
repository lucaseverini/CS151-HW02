/*
	ApplicantList.java

    Assignment #2 - CS151 - SJSU
	By Dennis Hsu, Brian Lee, Edmund Dao, Luca Severini 
	San Jose June-19-2014
*/

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

// JobList -----------------------------------------------------
public class ApplicantList 
{
	final private HashMap<Integer, Applicant> applicantList;

	ApplicantList()
	{
		applicantList = new HashMap<>();
	}

	int addApplicant(String firstName, String lastName, String email)
	{
		Applicant applicant = new Applicant(firstName, lastName, email);
		applicantList.put(applicant.id, applicant);

		return applicant.id;
	}

	boolean deleteApplicant(int applicantId)
	{
		return (applicantList.remove(applicantId) != null);
	}

	Applicant getApplicant(int applicantId)
	{
		return applicantList.get(applicantId);
	}
        
	public int getApplicantListSize()
	{
		return applicantList.size();
	}  

	@SuppressWarnings("unchecked")
	void displayApplicants()
	{
		List<Applicant> applicants = new ArrayList(applicantList.values());

		Collections.sort(applicants);
                
		if (applicants.size()>0)
		{
			System.out.println("Applicants on list:");
			
			for(Applicant iter : applicants)
			{
				System.out.println(iter);
			}
			
			System.out.println();
		}
		else
		{
			System.out.println("No Applicants on list");
		}
	}
}