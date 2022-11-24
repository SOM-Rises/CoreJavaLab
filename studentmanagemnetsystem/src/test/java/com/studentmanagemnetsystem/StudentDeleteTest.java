/*
Test class for checking the delete operation
 */
package com.studentmanagemnetsystem;

import java.util.List;

import com.dao.StudentDao;
import com.entity.Course;
import com.entity.Student;

//declaring class StudentDeleteTest
class StudentDeleteTest {

	// creating objects
	private StudentDao studentDao;
	private Student student;
	private Course course;

	// creating test
	@Test
	public final void studentDeleteById() {
		// using the object and given the values
		student = new Student();
		course = new Course();
		studentDao = new StudentDao();
		student.setFirstName("Somnath");
		student.setLastName("Hazra");
		student.setEmail("somnath@gmail.com");
		course.setCourseName("MCA");
		course.setStudent(student);
		student.setCourse(course);
		studentDao.saveStudent(student);

		// Creating a list of Student
		List<Student> students = studentDao.getAllStudent();
		students.forEach(studentTemp -> System.out.println(studentTemp.getFirstName()));

		// using deleteStudent method
		studentDao.deleteStudent(1);
		// checking if the value is null
		assertNull(studentDao.getStudent(1));
	}
	// end of test

	private void assertNull(Student student2) {
		// TODO Auto-generated method stub

	}
}
