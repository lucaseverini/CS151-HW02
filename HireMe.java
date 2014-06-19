
import java.util.ArrayList;

/**
 @author Ed
 */
public class HireMe
{

   private ArrayList<JobList> jobs;
   private ArrayList<ApplicantList> applicants;
   private ArrayList<InterviewerList> interviewers;

   public HireMe ()
   {
      jobs = new ArrayList<> ();
      applicants = new ArrayList<> ();
      interviewers = new ArrayList<> ();
   }

   private void assignInterviewerToApplicant ( int interviewerID , int applicantID )
   {
      //applicants should be a dynamic list
      interviewers.get ( applicantID ).applicants.add ( applicantID );

   }

   private void rateApplicant ( int applicantID , Integer experienceRating , Integer attitudeRating , Integer salaryRating )
   {
      applicants.get ( applicantID ).rating[1] = experienceRating;
      applicants.get ( applicantID ).rating[2] = attitudeRating;
      applicants.get ( applicantID ).rating[3] = salaryRating;
   }
}
