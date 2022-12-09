package week1.day2Assignments;
import java.util.Scanner;
public class Palindrome {
public static void main(String[] args) {
	System.out.println("Please enter the input string");
	Scanner a= new Scanner(System.in);
	String input= a.next();	
	String reverse="";
	char[] inputarray=input.toCharArray();
	int n=inputarray.length;
	System.out.println(n);
	for (int i=0;i<n;i++)
	System.out.print(inputarray[i]);
	System.out.println();
	for (int i=n-1;i>=0;i--)
		reverse=reverse+inputarray[i];
	if(input.equals(reverse))
		System.out.println("Given input is palindrome");
	else
		System.out.println("Given input is not a palindrome");	
}
}
