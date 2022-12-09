package week1.day2Assignments;

import java.util.Arrays;

public class RemoveDuplicates {
public static void main(String[] args) {
	String text="We learn java basics as part of java sessions in java week1";
    String[] input=text.split(" ");
    String[] output;int count=0;
     for (int i=0;i<input.length;i++)
    { for (int j=i+1;j<input.length;j++)
    	{
    	if(input[i].equals(input[j]))
    	{
    	count=count+1;
         }
    	}
    System.out.println(count);
	if(count>1) {
		text = text.replace(input[i], "");
		count = 0;
    	
    }
        		
}
     System.out.println("Output String without duplicates is: " + text);
}
}
