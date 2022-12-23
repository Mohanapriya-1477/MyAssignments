/*Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true

Example 2:
Input: nums = [1,2,3,4]
Output: false

Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true */

package javachallenges;

import java.util.Scanner;

public class Challenge07 {
public static void main(String[] args) {
	Scanner a =new Scanner(System.in);
	System.out.println("Enter the length of an array");
	int size=a.nextInt();
	int[] input=new int[size]; 
	boolean flag=false;
	int count=0;
	System.out.println("Enter all elements in the array");
	for (int i=0;i<size;i++)
		input[i]=a.nextInt();//getting input array
	for (int i=0;i<size;i++)
	{
	  for (int j=i+1;j<=size-1;j++)
	  {
		  if(input[i]==input[j]) //comparing each element in the array with other elements
			 count=count+1;
		     break;
	   }
	}
	if(count>=1)
	{
		flag=true;
	System.out.println(flag);
	}
	else
		System.out.println(flag);
}
}
