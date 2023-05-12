package com.ansari.ArrayList.Objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentSortDriver {

	public static void main(String[] args) {
        
//		Student student1 =;
//		Student student2 = ;
//		Student student3 = ;
		
		List<Student>  students = new ArrayList<Student>();

		students.add( new Student(123, "balwant", "balwant123@gmail.com"));
		students.add(new Student(12, "chandan", "chandan123@gmail.com"));
		students.add(new Student(166, "kajal", "kajal324@gmail.com"));
		
		Collections.sort(students);
		
		for (Student student : students) {
			System.out.println("studentId = "+student.getId());
			System.out.println("studentName = "+student.getName());
			System.out.println("studentId = "+student.getEmail());
		}
	}
}
