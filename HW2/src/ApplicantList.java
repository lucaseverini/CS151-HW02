/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
	@author Luca
*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


// JobList -----------------------------------------------------
public class ApplicantList 
{
	private static HashMap<Integer, Applicant> applicantList;

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
		Applicant applicant = applicantList.get(applicantId);
		if(applicant != null)
		{
			applicantList.remove(applicantId);
			return true;
		}
		else
		{
			return false;
		}
	}

	Applicant getApplicant(int applicantId)
	{
		return applicantList.get(applicantId);
	}

	void printJobs()
	{
		List<Applicant> applicants = new ArrayList(applicantList.values());
		
		Collections.sort(applicants);
		
		for(Applicant iter : applicants)
		{
			System.out.println(iter);
		}
	}
}
