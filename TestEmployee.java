package com.Abstract.pll;

import com.Abstract.bll.HourlyEmployee;
import com.Abstract.bll.SalaryEmployee;

public class TestEmployee {

	public static void main(String[] args) {
		SalaryEmployee salariedEmployee =new SalaryEmployee("ajay", "HR",5000);
		
		HourlyEmployee hourlyEmployee=new HourlyEmployee("vijay","operator",200,100);
		
		System.out.println(salariedEmployee);
		System.out.println(hourlyEmployee);

	}

}
