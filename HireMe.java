package HireMe;

import java.util.ArrayList;

/**
 @author Ed
 */
public class HireMe
{

   private JobList jobs;
   private ApplicantList applicants;
   private InterviewerList interviewers;

   public HireMe ()
   {
      jobs = new JobList ();
      applicants = new ApplicantList ();
      interviewers = new InterviewerList ();
   }

   private void assignInterviewerToApplicant ( String interviewerName , int applicantID )
   {
      //adds an interviewer to a list in applicant class containing all interviewers for that applicant
      applicants.applicantList.get ( applicantID ).interviewers.add ( interviewerName );

   }
	
   private void rateApplicant ( int applicantID , Integer experienceRating , Integer attitudeRating , Integer salaryRating )
   {
      applicants.applicantList.get ( applicantID ).rating[1] = experienceRating;
      applicants.applicantList.get ( applicantID ).rating[2] = attitudeRating;
      applicants.applicantList.get ( applicantID ).rating[3] = salaryRating;
   }
}
