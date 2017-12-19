package com.springbatch.common;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;

/**
  * Class for spring scheduler.
  * 
  * @author Patryk Chrusciel
  */
 public class SimpleLauncher {
 
      /**
       * Job to run.
       */
      private Job job;
 
      /**
       * Job launcher.
       */
      private JobLauncher jobLauncher;
 
      /**
       * Counter variable to demonstrate parameters set and read.
       */
      private static int counter = 0;
 
      /**
       * This method will be call every time after spring scheduler launch.
     * @throws JobInstanceAlreadyCompleteException 
     * @throws JobRestartException 
     * @throws JobExecutionAlreadyRunningException 
       */
       public void launch() throws JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
 
	   //Create parameters for job.
    	   JobParameters jobParams = createJobParameters();
    	   System.out.println( jobParams );    	   
	   // Run job.
    	   JobExecution result = null;          

    	   try {
	       result = getJobLauncher().run(getJob(), jobParams);
    	   } catch (JobParametersInvalidException e) {
	       e.printStackTrace();
    	   }
          // After job execution show details.
          System.out.print("Job status is " + result.getStatus() + ". ");
          System.out.print("Job has been started : " + result.getStartTime() + " and finished: "
                   + result.getEndTime() + ".\n");          
     }
 
     /**
      * Create parameters for job.
      * 
      * @return Parameters for job.
      */
      private JobParameters createJobParameters() {
         Map<String, JobParameter> parametersMap = new HashMap<String, JobParameter>();
         parametersMap.put("JobName", new JobParameter("JobName_" + ++counter));
         JobParameters jobParameters = new JobParameters(parametersMap);
         return jobParameters;
     }
 
     public void setJob(Job job) {
         this.job = job;
     }
 
      public Job getJob() {
         return job;
     }
 
      public void setJobLauncher(JobLauncher jobLauncher) {
         this.jobLauncher = jobLauncher;
      }
 
     public JobLauncher getJobLauncher() {
         return jobLauncher;
      }
}
