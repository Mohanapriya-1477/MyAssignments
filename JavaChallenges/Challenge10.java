/*
You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:

Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
Example 2:

Input: jewels = "z", stones = "ZZ"
Output: 0
 */

package javachallenges;

import java.util.Scanner;

public class Challenge10 {
public static void main(String[] args) {
	
  Scanner a=new Scanner(System.in);
  System.out.println("Please enter the input for string -Jewel: ");
  String jewel=a.next();
  System.out.println("Please enter the input for string -Stone: ");
  String stones=a.next();
  String jewel01="";String stones01="";
  String[] j=jewel.split(" ");
  String[] s=stones.split(" ");
  int count=0;
  for (int i=0;i<j.length;i++)
 	  jewel01=j[i];
  for (int i=0;i<s.length;i++)
  stones01=s[i];
  char[] jewelchar=jewel01.toCharArray();
  char[] stonechar=stones01.toCharArray();
  for (int i=0;i<jewelchar.length;i++)
  {
	  for (int k=0;k<stonechar.length;k++)
		  if(jewelchar[i]==stonechar[k])
			  count=count+1;
  }
  System.out.println(count);
}
}
