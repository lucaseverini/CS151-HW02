/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
	@author Luca
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

// JobList -----------------------------------------------------
public class InterviewerList 
{
	private static HashMap<String, Interviewer> interviewersList;

	InterviewerList()
	{
		interviewersList = new HashMap<>();
	}
	
	void addInterviewer(String name)
	{
		Interviewer interviewer = new Interviewer(name);
		interviewersList.put(interviewer.name, interviewer);
	}
	
	boolean deleteInterviewer(String name)
	{
		Interviewer interviewer = interviewersList.get(name);
		if(interviewer != null)
		{
			interviewersList.remove(name);
			return true;
		}
		else
		{
			return false;
		}
	}

	Interviewer getInterviewer(String name)
	{
		return interviewersList.get(name);
	}

	@SuppressWarnings("unchecked")
	void printInterviewers()
	{
		List<Interviewer> interviewers = new ArrayList(interviewersList.values());
		
		Collections.sort(interviewers);
		
		for(Interviewer iter : interviewers)
		{
			System.out.println(iter);
		}
	}
}
