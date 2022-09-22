package com.Abstract.bll;

public class SalaryEmployee extends Employee {
	private double weeklySalary;

	
	      public SalaryEmployee( String name, String job, double salary )
	      {
	         super( name, job ); 
	         setWeeklySalary( salary );
	      }
	      
	      public void setWeeklySalary( double salary )
	      {
	    	  if ( salary >= 0.0 )
	                  weeklySalary = salary;
	    	  else
	    		  throw new IllegalArgumentException(
	    				 "Weekly salary must be greater then 0" );
	       } 
	         
	      public double getWeeklySalary()
	      {
	    	  return weeklySalary;
	      } 
	      
	           
	      @Override                                                           
	      public double calculatePay()                                            
	      {
	    	  return getWeeklySalary();                                        
	      }

	      @Override
	      public String toString() {
	    	  return "SalaryEmployee [name=" + getName() + ", jobTitle="+getJob()+", totalWeeklySalary=" + calculatePay() + "]";
	      }

}
