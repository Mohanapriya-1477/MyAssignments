/*Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1*/


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

