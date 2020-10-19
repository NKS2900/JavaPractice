package org.test;


import java.util.*;
public class VowelApp
{
	public static void main(String args[])
	{
		String s;
		char ch;
		boolean b=false;
		Scanner Sc=new Scanner(System.in);
		
		System.out.println("enter String : ");
		s=Sc.nextLine();
		
		for(int j=0;j<s.length();j++)
		{
			ch=s.charAt(j);
			switch(ch)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':	
			case 'U': b=true;
			System.out.println("vowels in String:"+ch);
			}
			
			
		}
		
		if (false)
			System.out.println("There is no vowel");
	}
}
				
	
