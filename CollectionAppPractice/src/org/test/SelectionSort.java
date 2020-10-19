package org.test;

public class SelectionSort {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		int a[]= {36,56,7,9,4,88,99,5};
		
		int min,temp=0;
		for(int i=0;i<a.length;i++)
		{
			min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			Thread.sleep(1000);
		}
	}

}
