
package week1.day2Assignments;

public class SumofDigitsfromString {
public static void main(String[] args) {
	String test="Tes12Le79af65";
	char convert[]=test.toCharArray();
	int n=convert.length;
	System.out.println("Length of the given string is:"  + n);
	int sum=0;
	char [] numbers= new char[50];
	int [] num=new int[50];
	for (int i=0;i<n;i++)
	{
		if (Character.isDigit(convert[i]))
		{
		 numbers[i]=convert[i];
		 
			System.out.println(numbers[i]);
			num[i]=Character.getNumericValue(numbers[i]);
			sum=sum+num[i];
		}
	}
	System.out.println("Sum of Digits in Given String is : " + sum);
}
}
