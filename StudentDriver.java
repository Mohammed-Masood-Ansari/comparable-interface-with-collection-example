package com.ansari.ArrayList.Objects;

import java.util.ArrayList;
import java.util.List;

public class StudentDriver {

	public static void main(String[] args) {
		
		
		Student student = new Student(190, "akram", "akram@gmail.com");
		Student student1 = new Student(290, "shaban", "shaban@gmail.com");
		Student student2 = new Student(390, "sazid", "sazid@gmail.com");
		
		List<Student>  students = new ArrayList<Student>();
		
		students.add(student);
		students.add(student1);
		students.add(student2);
		
		for (Student student3 : students) {
			
			System.out.println(student3.getId());
			System.out.println(student3.getName());
			System.out.println(student3.getEmail());
		}
		
	}
}
