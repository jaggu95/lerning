package com.bank;

public class SavingAccount extends Account
{
int acno;
String name;
String password;
double balance;
public SavingAccount(int acno, String name, String password) {
	super();
	this.acno = acno;
	this.name = name;
	this.password = password;
}
@Override
public void withdraw(double amount) {
	if(amount>0 && amount<=balance)
	{
		balance=balance-amount;
	}
	else
		System.out.println("invalid amount");
	
}
@Override
public void deposit(double amount) {
	if(amount>0)
	{
		balance=balance+amount;
	}
	else
		System.out.println("invalid amount");
	
}
public void getbalance()
{
	System.out.println("Available Savings Balance is"+balance);
}
public void logout()
{
	System.out.println("succesfully logged out");
	System.exit(0);
	
}


}
