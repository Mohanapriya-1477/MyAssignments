package org.student;

import org.department.Department;

public class Student extends Department{

	public String studentName(String name)
	{
		return name;
	}
	public String studentDept(String studentDept)
	{
		return studentDept;
	}
	public int studentId(int studentId)
	{
		return studentId;
				
	}
	
	public static void main(String[] args) {
		Student s= new Student();
		System.out.println("Name of the student is:  "+ s.studentName("Mohana")); 
		System.out.println("Stiudent department is: " + s.studentDept("Information Tech"));
		System.out.println("Student Id is: " + s.studentId(123456));
		System.out.println("Student department name is: "+ s.deptName("Information Tech"));
		System.out.println("College Name is: "+ s.collegeName("Anna University"));
		System.out.println("College code is : "+ s.collegeCode("123456"));
		System.out.println("College rank code is:  "+ s.collegeRank("123456"));
		
	}
}
	

