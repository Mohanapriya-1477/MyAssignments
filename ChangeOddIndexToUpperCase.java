package week1.day2Assignments;

public class ChangeOddIndexToUpperCase {
  public static void main(String[] args) {
	String input="testleaf";
	char[] character = input.toCharArray();
	System.out.println(character.length);
	String upper="";
	for (int i=0;i<8;i++)
	{ 
		if(i%2!=0)
		upper=upper+Character.toUpperCase(character[i]);
	 }
	System.out.println(upper);
	
}
}
