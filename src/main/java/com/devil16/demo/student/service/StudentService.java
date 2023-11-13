package com.devil16.demo.student.service;

import java.util.List;

import com.devil16.demo.student.datamodel.StudentDetails;

public interface StudentService {
	
	public List<StudentDetails> fetchAllStudents();
	
	public List<StudentDetails> fetchAllStudentsOfClass(String classOf);
	
}
