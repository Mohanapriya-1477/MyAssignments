package week1.day2Assignments;

public class FindNumbers {
public static void main(String[] args) {
	String details="Amazon has 11400 employees";
	char[] characters=details.toCharArray();
	for (int i=0;i<characters.length;i++)
	{
		if(characters[i] >=48 && characters[i] <=57)
		System.out.print(characters[i]);
				
	}
	
}
}
