/* Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
Example 1:
Input: s = "leetcode"
Output: 0

Example 2:
Input: s = "loveleetcode"
Output: 2

Example 3:
Input: s = "aabb"
Output: -1*/

package javachallenges;

import java.util.Scanner;

public class Challenge09 {
public static void main(String[] args) {
	//getting input string from user
	Scanner a=new Scanner(System.in);
	System.out.println("Enter the input string:");
	String input=a.next();
	int count=0;
	System.out.println(input);
	//changing input string to character array
	char[]array=input.toCharArray();
	int i;
	System.out.println("Length of the array is : " + array.length);
	//traversing through each element in the array and comparing it with other character
	for (i=0;i<array.length;i++)
	{
		for (int j=i+1;j<array.length;j++)
		{
		 if(array[i]==array[j])
		    {
			   count=count+1;
		       break; //if first match for the selected character is found , system will take the control out of if else loop
		    }
		 else
			 	count=0;
		 if(count>=1)
			break;	//if first match is found , system will take control out of inner for loop and starts with outer for loop new iteration
	 	 }
		if(count==0) // if no match found for the selected character , then system will print that character index 
			System.out.println("Index of first disticnt letter in a given string is "+ i); 
			break;	
	} 
	
	if(count>=1) // if none of the given character is unique , system will print the default output
		System.out.println("There is no distinct character in given string . Hence the output is -1");
}

}

