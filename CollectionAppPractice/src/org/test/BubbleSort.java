package org.test;

public class BubbleSort {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		int a[]= {1,4,3,2,5,9,7,6,8};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			int flag=0;
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
					
				}
			}
			if(flag==0)
			{
				break;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			Thread.sleep(1000);
		}

	}

}
