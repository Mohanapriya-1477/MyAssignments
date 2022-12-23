/*Given a non-negative integer x, compute and return the square root of x.

Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.

Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.

 Example 1:

Input: x = 4
Output: 2
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.*/

package javachallenges;

import java.util.Scanner;

public class Challenge02 {
public static void main(String[] args) {
	/**Finding square root of input01 **/
	System.out.println("Please provide positive integer for input1:");
	Scanner a= new Scanner(System.in);
	int n1=a.nextInt();
	System.out.println("Given number is: " + n1);
	int o1=(int) Math.sqrt(n1);
	System.out.println("Square root of " + n1 + " is:" + o1);
	
	/**Finding square root of input02 **/
	System.out.println("Please provide positive integer for input2:");
	Scanner a1= new Scanner(System.in);
	int n2=a1.nextInt();
	System.out.println("Given number is: " + n2);
	int o2=(int) Math.sqrt(n2);
	System.out.println("Square root of " + n2 + " is:" + o2);
	
	/**Finding square root of input03**/
	System.out.println("Please provide positive integer for input3:");
	Scanner a2= new Scanner(System.in);
	int n3=a1.nextInt();
	System.out.println("Given number is: " + n3);
	int o3=(int) Math.sqrt(n3);
	System.out.println("Square root of " + n3 + " is:" + o3);
}
}
