/*
 * Edmund Dao
 * Dennis Hsu
 * Luca Severini
 * Brian Lee
 */

package hireme;

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
   
   public void assignInterviewerToApplicant ( String interviewerName , int applicantID )
   {
      //adds an interviewer to a list in applicant class containing all interviewers for that applicant
      applicants.getApplicant(applicantID).addInterviewer(interviewerName);

   }

   public void rateApplicant ( int applicantID , Integer experienceRating , Integer attitudeRating , Integer salaryRating )
   {
      applicants.getApplicant(applicantID).setRating(experienceRating,attitudeRating,salaryRating);
   }
}
