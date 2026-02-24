package com.lucky.Repository;

import org.springframework.stereotype.Repository;

import com.lucky.model.Student;

@Repository
public class StudentRepository {

	public Student getStudentById(int id) {
		return new Student(id, "Lucky", "MVC");
	}
}
