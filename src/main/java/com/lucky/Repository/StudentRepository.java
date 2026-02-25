package com.lucky.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.lucky.model.Student;

@Repository
public class StudentRepository {

	List<Student> list = new ArrayList<>();

	public Student createStudent(Student student) {

		list.add(student);

		return student;
	}

	public Student getStudentById(int id) {
		for (Student student : list) {
			if (student.getId() == id) {
				return student;
			}
		}
		return null;
	}
}
