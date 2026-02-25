package com.lucky.service;

import org.springframework.stereotype.Service;

import com.lucky.Repository.StudentRepository;
import com.lucky.model.Student;

@Service
public class StudentService {

	private StudentRepository repository;

	public StudentService(StudentRepository repository) {
		super();
		this.repository = repository;
	}

	public Student createStudent(Student student) {
		return repository.createStudent(student);
	}

	public Student getstudent(int id) {
		return repository.getStudentById(id);
	}

	public Student updateStudent(int id, Student student) {
		return repository.updateStudent(id,student);
	}

	public Student deleteStudent(int id) {
		return repository.deleteStudent(id);
	}

}
