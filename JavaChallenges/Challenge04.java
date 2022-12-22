package javachallenges;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Challenge04 {
	public static void main(String[] args) {
	Scanner a=new Scanner(System.in);
	System.out.println("Enter the length of array :");
	int size=a.nextInt();
	boolean flag=true;
	int[] input01=new int[size];
	System.out.println("Enter all the elements of array:");
	for(int i=0;i<size;i++)
		input01[i]=a.nextInt();
	if(input01.length==1)
	{
	   for(int i=0;i<size;i++)
	   System.out.println(input01[i]);	 
	}
	else
	{
	   for (int i=0;i<size;i++)
	   {
	   for (int j=i+1;j<size;j++)
	   { if(input01[i]==input01[j])
	   		   flag=false;}
	      if (flag)
	   		 System.out.println("Array without duplicates:  "+input01[i]);
			
	   }	   
	
	
	}
	
	
	
		
	
	}
}

