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
      //applicants should be a dynamic list
      interviewers.get ( interviewerName ).applicants.add ( applicantID );

   }

   private void rateApplicant ( int applicantID , Integer experienceRating , Integer attitudeRating , Integer salaryRating )
   {
      applicants.get ( applicantID ).rating[1] = experienceRating;
      applicants.get ( applicantID ).rating[2] = attitudeRating;
      applicants.get ( applicantID ).rating[3] = salaryRating;
   }
}
