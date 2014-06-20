/*
 * Edmund Dao
 * Dennis Hsu
 * Luca Severini
 * Brian Lee
 */

package hireme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


// JobList -----------------------------------------------------
public class ApplicantList 
{
	private static HashMap<Integer, Applicant> applicantList;

	ApplicantList()
	{
		applicantList = new HashMap();
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
                    System.out.println("Applicant List:");
                    for(Applicant iter : applicants)
                    {
                       	System.out.println(iter);
                    }
                }
                else
                {
                    System.out.println("No Applicants on List");
                }
	}
}
