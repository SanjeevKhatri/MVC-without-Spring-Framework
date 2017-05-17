package com.test.DAO;

import com.test.model.Student;

public class StudentService {

	public Student getStudentById(int studentid) {
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		Student notFound = new Student();


		notFound.setId(0);
		notFound.setName("We dont have any student with this id!!!");
		notFound.setAddress("Sorry");
		notFound.setGender(false);
		
		student1.setId(5);
		student1.setName("Sanjay");
		student1.setAddress("Nepal");
		student1.setGender(true);

		student2.setId(7);
		student2.setName("Deeyas");
		student2.setAddress("Nepal");
		student2.setGender(true);

		student3.setId(9);
		student3.setName("Sanjeev");
		student3.setAddress("Nepal");
		student3.setGender(true);

		if (student1.getId() == studentid) {
			return student1;
		} else if (student2.getId() == studentid) {
			return student2;
		} else if (student3.getId() == studentid) {
			return student3;
		} else {
			return notFound;
		}
	}

}
