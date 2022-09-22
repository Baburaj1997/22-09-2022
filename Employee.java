package com.Abstract.bll;

public abstract class Employee {
	
	private String name;
    private String job;

 
    public Employee( String name, String job )
    	{
    		this.name = name;
    		this.job = job;
    	}


    	public String getName() {
    		return name;
    	}


    	public void setName(String name) {
    		this.name = name;
    	}


    	public String getJob() {
    		return job;
    	}


    	public void setJobTitle(String jobTitle) {
    		this.job = job;
    	}

    	public abstract double calculatePay();

    	@Override
    	public String toString() {
    		return "Employee [Name=" + name + ", Job Title=" + job + "]";
    	} 
}
