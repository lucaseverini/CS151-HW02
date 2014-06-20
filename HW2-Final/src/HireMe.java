/*
	Applicant.java

    Assignment #2 - CS151 - SJSU
	By Dennis Hsu, Brian Lee, Edmund Dao, Luca Severini 
	San Jose June-19-2014
*/

public class HireMe
{

   final private JobList jobs;
   final private ApplicantList applicants;
   final private InterviewerList interviewers;

   public HireMe ()
   {
      jobs = new JobList ();
      applicants = new ApplicantList ();
      interviewers = new InterviewerList ();
   }
   
   public JobList getJobList()
   {
       return jobs;
   }

   public ApplicantList getApplicantList()
   {
      return applicants;
   }
   
   public InterviewerList getInterviewerList()
   {
       return interviewers;
   }
   
   public void assignInterviewerToApplicant (int applicantId, String interviewerName)
   {
      //adds an interviewer to a list in applicant class containing all interviewers for that applicant
      applicants.getApplicant(applicantId).addInterviewer(interviewerName);
   }

   public void rateApplicant (int applicantId , Integer experienceRating , Integer attitudeRating , Integer salaryRating)
   {
      applicants.getApplicant(applicantId).setRating(experienceRating,attitudeRating,salaryRating);
   }
}