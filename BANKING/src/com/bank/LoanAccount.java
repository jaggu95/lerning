package com.bank;

public class LoanAccount extends Account
{
int acno;
double balance;
String name;
String password;
public LoanAccount(int acno, String name, String password) {
	super();
	this.acno = acno;
	this.name = name;
	this.password=password;
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
	System.out.println("available Loan balance is"+balance);
}
public void logout()
{
	System.exit(0);
}
}
