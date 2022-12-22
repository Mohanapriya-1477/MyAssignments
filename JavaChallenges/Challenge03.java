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


