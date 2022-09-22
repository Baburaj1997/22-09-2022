package com.Interface.bll;

public interface BankAccount {
	
	public double getBalance();
	
	public void deposit(double amount);//deposit amount
	
	public boolean withdraw(double amount);//withdraw amount

}
