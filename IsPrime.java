package week1.day1;
import java.util.Scanner;

public class IsPrime {
	public static void main(String[] args) {
	int rem=0;
	Scanner a= new Scanner(System.in);
	System.out.println("Please provide a positive integer as input");
		int n=a.nextInt();
	
	if(n>1)
	{
		for(int i=2;i<n;i++)
		{ rem=n%i;
			if (rem==0)
				break;		
		}
		
		if(rem==0)
			System.out.println("Given number is not a prime");
		else 
			System.out.println("Given number is a prime");
	}						
	else 
	System.out.println("Please enter any number greater than 1 ");
	
	}
}

