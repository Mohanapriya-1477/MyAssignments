package week1.day1;

public class Fibbonacci {
	public static void main(String[] args) {
		int x,y,sum,n;
		x=0;y=1;sum=0;
		System.out.println("Fibonacci Series is:");
		System.out.println(x);
		System.out.println(y);
		for(n=0;n<11;n++)
		{
			sum=x+y;
			System.out.println(sum);
			x=y;y=sum;
			
		}
	}
		
}
