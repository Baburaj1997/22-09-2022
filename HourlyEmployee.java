package com.Abstract.bll;

public class HourlyEmployee extends Employee {
	private double wage;
	private int hours;
	
    public HourlyEmployee( String name, String job, double hrSalary, int hoursWorked )
    {
       super( name, job ); 
       setWage( hrSalary );
       setHours(hoursWorked);
    }
    
    public void setWage( double hrSalary )
    {
    	if ( hrSalary >= 0.0 )
                wage = hrSalary;
        else
              throw new IllegalArgumentException(
                   "Hourly wage must be  >= 0.0" );
     } 
       
     public double getWage()
          {
             return wage;
          } 
          
          
          public void setHours(int hoursWorked)
          {
        	  if ( ( hoursWorked >= 0.0 ))
        	  {
        		  hours=hoursWorked;
        	  }
        	  else
        	  {
      
        		  System.out.println("Hours must greater then 0" );
        	  }
          }
          public int getHours()
          {
        	  return hours;
          }
          
         
          @Override                                                           
          public double calculatePay()                                            
          {
              return getHours()*getWage();                                        
          }

		@Override
		public String toString() {
			return "HourlyEmployee [name="+getName()+", jobTitle="+getJob()+", wage=" + wage + ", hours=" + hours +", totalWage="+calculatePay()+ "]";
		}
}
