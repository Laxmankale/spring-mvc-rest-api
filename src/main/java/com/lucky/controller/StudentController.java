package com.lucky.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucky.model.Student;
import com.lucky.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {

	private StudentService service;

	public StudentController(StudentService service) {
		super();
		this.service = service;
	}

	@GetMapping("/student/{id}")
	public Student getStudent(@PathVariable int id) {
		return service.getstudent(id);
	}
}
