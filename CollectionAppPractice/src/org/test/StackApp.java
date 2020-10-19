package org.test;

import java.util.Scanner;
import java.util.Stack;

public class StackApp {

	public static void main(String[] args) {
		
		Stack s=new Stack();
		Scanner sc=new Scanner(System.in);
		do
        {
			System.out.println("Enter your choice");
			
	        System.out.println("1.PUSH");
	        System.out.println("2.POP");
	        System.out.println("3.Diplay");
	        int choice=sc.nextInt();

        	switch(choice)

        	{
        		case 1:
        		System.out.println("Enter element to add in stack");
        		int ele=sc.nextInt();
        		s.push(ele);
        		break;
        	
        		case 2:
        		System.out.println("Removed element is: "+s.pop());
        		break;
        		
        		case 3:
        			for(int i=(s.size()-1);i>=0;i--)
        			{
        				Object ele1=s.get(i);
        			   System.out.println("Stach Elements "+ele1);
        			}
        			break;
        			default:
        				System.out.println("wrong chioce////////");
        	}
        	}
        while(true);
	}

}
