package executor;

import entity.Teacher;
import entity.Student;
import service.Relationalclass;


public class Mainclass {

	public static void main(String[] args) {
	
		Student s1 = new Student();
		s1.setId(1);
		s1.setName("Sonia");
		Teacher t = new Teacher();
		t.setSubject("Java");
		t.setTname("Lalita");
		Relationalclass.givenclass(s1);
		Relationalclass.takeclass(t);
		

	}

}
