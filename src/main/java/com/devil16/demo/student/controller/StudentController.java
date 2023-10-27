package com.devil16.demo.student.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devil16.demo.student.dto.Student;

@RestController
@RequestMapping("student-details")
public class StudentController {
	
	@GetMapping(path="/{enrollment}", consumes=MediaType.TEXT_PLAIN_VALUE)
	public Student getStudentByEnrollmentId(String enrollmentId) {
		return Student.builder().build();
	}
	
}
