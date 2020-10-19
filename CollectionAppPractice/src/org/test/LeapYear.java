package org.test;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		 boolean isyear=false;
		 do {
		System.out.println("enter year YYYY");
		int year=in.nextInt();
		
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
					isyear=true;
				else
					isyear=false;
			}
			else
			isyear=true;
			
		}
		else
			isyear=false;
		if(isyear)
		{
			System.out.println(year+" Year is LeapYear");
		}
		else
		{
			System.out.println(year+" is not LeapYear");
		}
		 }
		 while(true);

	}

}
