/*Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.
 
 Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.*/

package javachallenges;

public class Challenge01 {
public static void main(String[] args) {
	
	String input1="hi welcome to java programming";
	String inputarray1[]=input1.split(" ");
	
	String input2="fly me   to   the moon";
	String inputarray2[]=input2.split(" ");
	
	String input3="luffy is still joyboy";
	String inputarray3[]=input3.split(" ");
	
	for (int j=inputarray1.length-1;j>=inputarray1.length-1;j--)
	{
	     char a1[]=inputarray1[j].toCharArray();
	     System.out.println("Length of last word in String01:" + a1.length);
	}
	for (int j=inputarray2.length-1;j>=inputarray2.length-1;j--)
	{
	     char a2[]=inputarray2[j].toCharArray();
	     System.out.println("Length of last word in String02:" + a2.length);
	} 
	for (int j=inputarray3.length-1;j>=inputarray3.length-1;j--)
	{
	     char a3[]=inputarray3[j].toCharArray();
	     System.out.println("Length of last word in String03:" + a3.length);
	}
	
}
}
