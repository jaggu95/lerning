package com.bank;
import java.util.Scanner;
import java.util.ArrayList;
public class mainclass
{

	public static void main(String[] args) 
	{
		for(;;)
		{
			System.out.println("Welcome..!!!!!!!!");
			System.out.println("1.Login");
			System.out.println("2.Signup");
				System.out.println("Enter your choice");
			Scanner s=new Scanner(System.in);
			int c=s.nextInt();
			switch(c)
			{
			case 1:Bank.login();
					break;
			case 2:Bank.createaccount();
					break;
			default:System.out.println("invalid option");
			}
		}
	}
}
