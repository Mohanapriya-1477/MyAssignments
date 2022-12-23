/*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.
 
 Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.*/


package javachallenges;

public class Challenge03 {
	public static void main(String[] args) {
		boolean flag;
		String input1="A man, a plan, a canal: Panama";
		String input2="race a car";
		String input3="";
		Challenge03 p=new Challenge03();
		flag=p.isPalindrome(input1);
		if(flag)
			System.out.println("Given input1 is a palindrome ");
		else
			System.out.println("Given input1 is not a palindrome");
		flag=p.isPalindrome(input2);
		if(flag)
			System.out.println("Given input2 is a palindrome ");
		else
			System.out.println("Given input2 is not a palindrome");
		flag=p.isPalindrome(input3);
		if(flag)
			System.out.println("Given input3 is a palindrome ");
		else
			System.out.println("Given input3 is not a palindrome");
	}

public boolean isPalindrome(String input){
	
	boolean flag=true;
	int i=0;
	if(input==" ")
			 return flag;
    else
		input=input.replaceAll("[^a-zA-Z]", "");
		char[] array1=input.toCharArray();
		String reverse="";
		for(i = array1.length-1;i>=0;i--)
		  reverse=reverse+array1[i];
		if(reverse.equalsIgnoreCase(input))
			return true;
		else 
			return false;		 
			
		}
			
	}


