package week3.day1;

public class Students {

	public void studentInfo(int id)
	{
		System.out.println("Student id: "+ id);
	}
	public void studentInfo(int studentId, String studentName)
	{
		System.out.println("NAme of the student is : "+ studentName);
		System.out.println("Id of the student is:  "+ studentId);
	}
	public void studentInfo(String email,String phonenumber)
	{
		System.out.println("Email fo the student is :  "+ email);
		System.out.println("phonenumber of the student is: "+ phonenumber);
	}
	public static void main(String[] args) {
		Students a =new Students();
		a.studentInfo(123456);
		a.studentInfo(123456,"testname");
		a.studentInfo("test@gmail.com","1234567890");
		
	}
}
