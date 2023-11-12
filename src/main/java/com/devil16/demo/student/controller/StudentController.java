package com.devil16.demo.student.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devil16.demo.student.dto.Student;
import com.devil16.demo.student.validation.ValidErollmentId;

@RestController
@Validated
@RequestMapping("/student")
public class StudentController {
	
	@GetMapping(path="/basic", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Student> getStudentByEnrollmentId(
			@RequestParam(name="enrollment-id") @ValidErollmentId String enrollmentId) {
		return new ResponseEntity<>(Student.builder().build(), HttpStatus.OK);
	}
	
}
