/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2 */

package javachallenges;

import java.util.Scanner;

public class Challenge06 {
public static void main(String[] args) {
	System.out.println("Enter the length of the array");
	Scanner a =new Scanner(System.in);
	int size=a.nextInt();
	int count=1;
	int input01[]=new int[size];
	System.out.println("Enter all the elements in the array");
	for (int i=0;i<size;i++)
		input01[i]=a.nextInt();
	int limit=size/2;
	for (int i=0;i<size;i++)
	{   count=1;
		for (int j=i+1;j<=size-1;j++)
		{
			if(input01[i]==input01[j])
				count =count+1;
		}
		/*System.out.println(count)*/
		if (count > limit)
			System.out.println(input01[i]);
	}

}
}
