package javachallenges;

import java.util.Scanner;

public class Challenge07 {
public static void main(String[] args) {
	Scanner a =new Scanner(System.in);
	System.out.println("Enter the length of an array");
	int size=a.nextInt();
	int[] input=new int[size];
	boolean flag=false;
	int count=0;
	System.out.println("Enter all elements in the array");
	for (int i=0;i<size;i++)
		input[i]=a.nextInt();
	for (int i=0;i<size;i++)
	{
	  for (int j=i+1;j<=size-1;j++)
	  {
		  if(input[i]==input[j])
			 count=count+1;
		     break;
	   }
	}
	if(count>=1)
	{
		flag=true;
	System.out.println(flag);
	}
	else
		System.out.println(flag);
}
}
