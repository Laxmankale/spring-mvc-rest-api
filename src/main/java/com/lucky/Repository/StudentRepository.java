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

	public Student updateStudent(int id, Student student) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				list.set(i, student);

				return student;
			}
		}
		return null;

	}

	public Student deleteStudent(int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				Student deletedStudent = list.get(i);
				list.remove(i);
				return deletedStudent;

			}
		}
		return null;
	}
}
