package com.lucky.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	@PostMapping("/student")
	public ResponseEntity<Student> createStudent(@RequestBody Student student) {
		if (student != null) {
			Student savedStudent = service.createStudent(student);
			return ResponseEntity.status(HttpStatus.CREATED).body(savedStudent);

		}
		return ResponseEntity.badRequest().build();

	}

	@GetMapping("/student/{id}")
	public Student getStudent(@PathVariable int id) {
		return service.getstudent(id);
	}

	@PutMapping("/student/{id}")
	public Student updateStudent(@PathVariable int id, @RequestBody Student student) {
		return service.updateStudent(id, student);
	}

	@DeleteMapping("student/{id}")
	public Student deleteStudent(@PathVariable int id) {
		return service.deleteStudent(id);
	}
}
