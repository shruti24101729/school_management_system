package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t1=new Teacher(1,"Lizzy",5000);
		Teacher t2=new Teacher(2,"Mellisa",7000);
		Teacher t3=new Teacher(3,"Den",10000);
		List<Teacher> teachers=new ArrayList<>();
		teachers.add(t1);
		teachers.add(t2);
		teachers.add(t3);
		Student s1=new Student(1,"Leela",4);
		Student s2=new Student(2,"Ram",10);
		Student s3=new Student(3,"Rabi",7);
		List<Student> students=new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		
		School scl=new School(teachers,students);
		scl.getTotalMoneyEarned();
		
		s1.payfees(50000);
		s2.payfees(30000);
		System.out.print(scl.getTotalMoneyEarned());
	
		t1.receiveSalary(t1.getSalary());
		System.out.println(t1.getName()+"has"+ scl.getTotalMoneyEarned());
		

	}

}
