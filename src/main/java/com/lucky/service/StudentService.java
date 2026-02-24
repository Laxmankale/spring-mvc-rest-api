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

	public Student getstudent(int id) {
		return repository.getStudentById(id);
	}

}
