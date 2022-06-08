package service;
import entity.Student;
import entity.Teacher;

public class Relationalclass {

	public static void givenclass (Student s)
	{
		System.out.println("the teacher is Teaching to "+s.getName());
		
	}
	
	public static void takeclass (Teacher t)
	{
		System.out.println( "is Teaching " +t.getSubject() );
		
	}
}
