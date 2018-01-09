package com.bank;
import java.util.ArrayList;
import java.util.Scanner;

public class Bank 
{
	 String name;
	String branch;
	String ifsc;
	Account a;
	 static ArrayList<SavingAccount> a1=new ArrayList<SavingAccount>();
	static ArrayList<LoanAccount> a2=new ArrayList<LoanAccount>();
	static int count=0;
	public static void createaccount()
	{
		Scanner s=new Scanner(System.in);
		int temp=1;
		int accno;
		String name;
		int type;
		String pass;
		double bal=0; 
		
		System.out.println("Enter Name");
		name=s.nextLine();
		System.out.println("Enter type of acc 1=Savings 2=Loan");
		type=s.nextInt();
		System.out.println("Enter new password");
		pass=s.next();
		if(type==1)
		{
			SavingAccount s1=new SavingAccount(temp++,name,pass);
			a1.add(s1);
			System.out.println("Registered Successfully");
		}
		else if(type==2)
		{
			LoanAccount l1=new LoanAccount(temp++,name,pass);
			a2.add(l1);
			System.out.println("Registered Successfully");
		}
	}
	
	public static void login()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=s.nextLine();
		System.out.println("Enter password");
		String pass=s.next();
		System.out.println("Enter Acc type 1.Savings 2.Loan");
		int p=s.nextInt();
		if(p==1)
		{
		  task(name,pass);	
			}
		else if(p==2)
		{
		 task(name,pass);	
		}
		else 
			System.out.println("invalid input");
	}
	public static void task(String name, String pass)
	{
		Scanner s1=new Scanner(System.in);
		int found=0;
		
		for(int i=0;i<a1.size();i++)
		{
			if((a1.get(i)).name.equals(name) && (a1.get(i)).password.equals(pass))
			{
				found=1;
				count=i;
			}
		}
		if(found==1)
		{
			System.out.println("Logged In Successfully..!!!!");
			while(true)
			{
			
			System.out.println();
			System.out.println();
			System.out.println("1.Deposit 2.Withdraw 3.Balance enquiry 4.Logout");
			System.out.println("Enter your choice");
			int choice=s1.nextInt();
			switch(choice)
			{
			case 1:System.out.println("Enter Amoount");
			       double b=s1.nextDouble();
			       a1.get(count).deposit(b);
			       break;
			case 2: System.out.println("Enter Amount");
		       		double g=s1.nextDouble();
		       		a1.get(count).withdraw(g);
		       		break;
			case 3:a1.get(count).getbalance();
					break;
			case 4:a1.get(count).logout();
					break;
			default:System.out.println("Invalid input");
			}
			}
		}
			else
				System.out.println("Invalid Username Password");
	}
}
