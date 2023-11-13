package com.devil16.demo.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devil16.demo.student.datamodel.StudentDetails;
import com.devil16.demo.student.dto.Student;
import com.devil16.demo.student.service.StudentService;
import com.devil16.demo.student.validation.ValidErollmentId;
import com.devil16.demo.student.validation.ValidOfClass;

@RestController
@Validated
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping(path="/basic", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<StudentDetails>> getAllStudents(
			@RequestParam(name="of-class", required=false) @ValidOfClass String ofClass) {
		return new ResponseEntity<>(studentService.fetchAllStudents(), HttpStatus.OK);
	}
	
	@GetMapping(path="/basic/{enrollment-id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Student> getStudentById(
			@PathVariable(name="enrollment-id") @ValidErollmentId String enrollmentId) {
		return new ResponseEntity<>(Student.builder().build(), HttpStatus.OK);
	}
	
}
